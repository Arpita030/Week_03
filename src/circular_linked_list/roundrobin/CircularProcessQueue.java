package circular_linked_list.roundrobin;

import java.util.ArrayList;

class CircularProcessQueue {
    private Process head = null;
    private Process tail = null;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        System.out.println("Process added successfully!");
    }

    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        Process current = head, prev = null;
        do {
            if (current.processId == processId) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Process " + processId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process ID not found!");
    }

    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Process current = head;
        int currentTime = 0;
        ArrayList<Process> completedProcesses = new ArrayList<>();

        System.out.println("\nStarting Round Robin Scheduling:");
        while (completedProcesses.size() < getTotalProcesses()) {
            if (current.remainingTime > 0) {
                System.out.println("Executing Process " + current.processId + " for "
                        + Math.min(timeQuantum, current.remainingTime) + " units.");
                int timeExecuted = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= timeExecuted;
                currentTime += timeExecuted;

                Process temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0) {
                        temp.waitingTime += timeExecuted;
                    }
                    temp = temp.next;
                } while (temp != head);

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    completedProcesses.add(current);
                    System.out.println("Process " + current.processId + " completed.");
                }
            }
            current = current.next;
        }

        displayProcessDetails();
        calculateAverageTimes();
    }

    public void displayProcessDetails() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }

        System.out.println("\nProcess Details:");
        Process current = head;
        do {
            System.out.println(current);
            current = current.next;
        } while (current != head);
    }

    public void calculateAverageTimes() {
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int count = 0;

        Process current = head;
        do {
            totalWaitingTime += current.waitingTime;
            totalTurnAroundTime += current.turnAroundTime;
            count++;
            current = current.next;
        } while (current != head);

        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnAroundTime = (double) totalTurnAroundTime / count;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }

    private int getTotalProcesses() {
        if (head == null) return 0;

        int count = 0;
        Process current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}

package circular_linked_list.roundrobin;

class Process {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Process ID: " + processId + ", Burst Time: " + burstTime + ", Remaining Time: "
                + remainingTime + ", Priority: " + priority;
    }
}

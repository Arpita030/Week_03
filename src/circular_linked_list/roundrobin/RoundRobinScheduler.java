package circular_linked_list.roundrobin;

import java.util.Scanner;

public class RoundRobinScheduler {
    public static void main(String[] args) {
        CircularProcessQueue processQueue = new CircularProcessQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nRound Robin Scheduler Menu:");
            System.out.println("1. Add Process");
            System.out.println("2. Remove Process");
            System.out.println("3. Simulate Round Robin Scheduling");
            System.out.println("4. Display All Processes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Process ID: ");
                    int processId = scanner.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int burstTime = scanner.nextInt();
                    System.out.print("Enter Priority: ");
                    int priority = scanner.nextInt();
                    processQueue.addProcess(processId, burstTime, priority);
                    break;

                case 2:
                    System.out.print("Enter Process ID to remove: ");
                    int removeId = scanner.nextInt();
                    processQueue.removeProcess(removeId);
                    break;

                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int timeQuantum = scanner.nextInt();
                    processQueue.simulateRoundRobin(timeQuantum);
                    break;

                case 4:
                    processQueue.displayProcessDetails();
                    break;

                case 5:
                    System.out.println("Exiting Round Robin Scheduler. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

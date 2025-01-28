package circular_linked_list.task_scheduler;

import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Search Task by Priority");
            System.out.println("5. View and Move to Next Task");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Task Priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Due Date: ");
                    String dueDate = scanner.nextLine();
                    taskList.addTask(taskId, taskName, priority, dueDate);
                    break;

                case 2:
                    System.out.print("Enter Task ID to remove: ");
                    int removeId = scanner.nextInt();
                    taskList.removeTask(removeId);
                    break;

                case 3:
                    taskList.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter Task Priority to search: ");
                    int searchPriority = scanner.nextInt();
                    taskList.searchByPriority(searchPriority);
                    break;

                case 5:
                    taskList.viewNextTask();
                    break;

                case 6:
                    System.out.println("Exiting Task Scheduler. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

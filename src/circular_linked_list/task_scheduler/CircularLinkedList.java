package circular_linked_list.task_scheduler;

class CircularLinkedList {
    private Task head = null;
    private Task tail = null;

    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
        System.out.println("Task added successfully!");
    }

    public void removeTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task current = head, prev = null;
        do {
            if (current.taskId == taskId) {
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
                System.out.println("Task removed successfully!");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task ID not found!");
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task current = head;
        System.out.println("Tasks in the list:");
        do {
            System.out.println(current);
            current = current.next;
        } while (current != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println(current);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with the given priority.");
        }
    }

    public void viewNextTask() {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        System.out.println("Current Task: " + head);
        head = head.next;
    }
}

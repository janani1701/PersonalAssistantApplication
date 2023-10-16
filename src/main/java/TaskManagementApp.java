import java.util.Scanner;

public class TaskManagementApp {
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task to Priority Queue");
            System.out.println("2. Process Tasks from Priority Queue");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter the task priority (1-10): ");
                    int priority = Integer.parseInt(scanner.nextLine());
                    taskQueue.addTask(description, priority);
                    System.out.println("'" + description + "' added to the task queue with priority " + priority);
                    break;

                case "2":
                    if (taskQueue.isEmpty()) {
                        System.out.println("Priority queue is empty.");
                    } else {
                        System.out.println("Processing tasks from the priority queue:");
                        taskQueue.processTasks();
                    }
                    break;
                case "3":
                    System.out.println("Listing out the tasks added");
                    taskQueue.viewTasks();
                    break;

                case "4":
                    System.out.println("Exiting the Task Management System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

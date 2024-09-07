package lista07.exercicio01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nTask Manager:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Mark task as completed");
            System.out.println("4. List all tasks");
            System.out.println("5. Remove completed tasks");
            System.out.println("6. Count tasks");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character after the number

            switch (option) {
                case 1:
                    System.out.print("Enter the description of the new task: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter the description of the task to be removed: ");
                    String removeDescription = scanner.nextLine();
                    taskManager.removeTask(removeDescription);
                    break;
                case 3:
                    System.out.print("Enter the description of the task to be marked as completed: ");
                    String completeDescription = scanner.nextLine();
                    taskManager.markTaskAsCompleted(completeDescription);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    taskManager.removeCompletedTasks();
                    break;
                case 6:
                    System.out.println("Number of tasks: " + taskManager.countTasks());
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 7);

        scanner.close();
    }
}


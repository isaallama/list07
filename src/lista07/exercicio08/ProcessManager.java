package lista07.exercicio08;

import java.util.Scanner;


public class ProcessManager {
    public static void main(String[] args) {
        ProcessQueue processQueue = new ProcessQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProcess Manager:");
            System.out.println("1. Add Process");
            System.out.println("2. Execute Next Process");
            System.out.println("3. Display Process Queue");
            System.out.println("4. Display Queue Size");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter process ID: ");
                    String processId = scanner.nextLine();
                    System.out.print("Enter process description: ");
                    String description = scanner.nextLine();
                    Process process = new Process(processId, description);
                    processQueue.enqueue(process);
                    break;
                case 2:
                    Process executedProcess = processQueue.dequeue();
                    if (executedProcess != null) {
                        System.out.println("Executing process: " + executedProcess);
                    } else {
                        System.out.println("No processes in the queue.");
                    }
                    break;
                case 3:
                    processQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Current queue size: " + processQueue.getSize());
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

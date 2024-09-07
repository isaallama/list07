package lista07.exercicio07;

import java.util.Scanner;

public class PrintJobManager {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPrint Job Manager:");
            System.out.println("1. Add Print Job");
            System.out.println("2. Process Next Job");
            System.out.println("3. Display Print Queue");
            System.out.println("4. Display Queue Size");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter job ID: ");
                    String jobId = scanner.nextLine();
                    System.out.print("Enter job description: ");
                    String description = scanner.nextLine();
                    PrintJob printJob = new PrintJob(jobId, description);
                    printQueue.enqueue(printJob);
                    break;
                case 2:
                    PrintJob processedJob = printQueue.dequeue();
                    if (processedJob != null) {
                        System.out.println("Processing job: " + processedJob);
                    } else {
                        System.out.println("No print jobs in the queue.");
                    }
                    break;
                case 3:
                    printQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Current queue size: " + printQueue.getSize());
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


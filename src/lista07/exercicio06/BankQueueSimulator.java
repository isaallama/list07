package lista07.exercicio06;

import java.util.Scanner;

public class BankQueueSimulator {
    public static void main(String[] args) {
        CustomerQueue queue = new CustomerQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Queue Simulator:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Call next customer");
            System.out.println("3. Display queue");
            System.out.println("4. Display queue size");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    queue.enqueue(customerName);
                    break;
                case 2:
                    String nextCustomer = queue.dequeue();
                    if (nextCustomer != null) {
                        System.out.println("Calling next customer: " + nextCustomer);
                    } else {
                        System.out.println("No customers in the queue.");
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Current queue size: " + queue.getSize());
                    break;
                case 5:
                    System.out.println("Exiting the simulator.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

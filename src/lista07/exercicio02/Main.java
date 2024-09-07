package lista07.exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum size of the history: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine();
        HistoryManager historyManager = new HistoryManager(maxSize);

        int option;
        do {
            System.out.println("\nBrowser History Manager:");
            System.out.println("1. Add URL");
            System.out.println("2. Display History");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the URL to add: ");
                    String url = scanner.nextLine();
                    historyManager.addUrl(url);
                    break;
                case 2:
                    historyManager.displayHistory();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 3);

        scanner.close();
    }
}
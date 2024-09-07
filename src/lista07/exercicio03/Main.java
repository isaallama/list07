package lista07.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undoManager = new Undo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nText Editor Undo Manager:");
            System.out.println("1. Add Action");
            System.out.println("2. Undo Last Action");
            System.out.println("3. Display History");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter action description: ");
                    String action = scanner.nextLine();
                    Undo.addAction(action);
                    break;
                case 2:
                    Undo.undo();
                    break;
                case 3:
                    undoManager.displayHistory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
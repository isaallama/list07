package lista07.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EditHistory history = new EditHistory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSimple Text Editor:");
            System.out.println("1. Record Edit");
            System.out.println("2. Revert Last Edit (Undo)");
            System.out.println("3. Repeat Last Edit (Redo)");
            System.out.println("4. Display Edit History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter edit description: ");
                    String edit = scanner.nextLine();
                    history.recordEdit(edit);
                    break;
                case 2:
                    history.revertEdit();
                    break;
                case 3:
                    history.repeatEdit();
                    break;
                case 4:
                    history.showHistory();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

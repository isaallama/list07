package lista07.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerHand hand = new PlayerHand();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCard Game:");
            System.out.println("1. Add Card to Hand");
            System.out.println("2. Remove Card from Hand");
            System.out.println("3. Swap Cards");
            System.out.println("4. Display Hand");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter card name: ");
                    String cardName = scanner.nextLine();
                    hand.addCard(cardName);
                    break;
                case 2:
                    hand.removeCard();
                    break;
                case 3:
                    System.out.print("Enter first card name to swap: ");
                    String card1 = scanner.nextLine();
                    System.out.print("Enter second card name to swap: ");
                    String card2 = scanner.nextLine();
                    hand.swapCards(card1, card2);
                    break;
                case 4:
                    hand.displayHand();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

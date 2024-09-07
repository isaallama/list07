package lista07.exercicio05;

public class PlayerHand {
    private CardGame head;
    private CardGame tail;

    public PlayerHand() {
        head = null;
        tail = null;
    }


    public void addCard(String cardName) {
        CardGame newCard = new CardGame(cardName);
        if (head == null) {
            head = newCard;
            tail = newCard;
        } else {
            newCard.next = head;
            head.prev = newCard;
            head = newCard;
        }
        System.out.println("Added card: " + cardName);
    }


    public void removeCard() {
        if (tail == null) {
            System.out.println("No cards to remove.");
            return;
        }

        System.out.println("Removed card: " + tail.cardName);

        if (tail == head) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }


    public void swapCards(String card1, String card2) {
        CardGame node1 = findCardNode(card1);
        CardGame node2 = findCardNode(card2);

        if (node1 == null || node2 == null) {
            System.out.println("One or both cards not found.");
            return;
        }


        if (node1 != node2) {
            CardGame tempPrev = node1.prev;
            CardGame tempNext = node1.next;


            if (node1.prev != null) {
                node1.prev.next = node2;
            }
            if (node1.next != null) {
                node1.next.prev = node2;
            }


            if (node2.prev != null) {
                node2.prev.next = node1;
            }
            if (node2.next != null) {
                node2.next.prev = node1;
            }


            node1.prev = node2.prev;
            node1.next = node2.next;
            node2.prev = tempPrev;
            node2.next = tempNext;


            if (node1 == head) {
                head = node2;
            } else if (node2 == head) {
                head = node1;
            }
            if (node1 == tail) {
                tail = node2;
            } else if (node2 == tail) {
                tail = node1;
            }

            System.out.println("Swapped cards: " + card1 + " with " + card2);
        }
    }


    private CardGame findCardNode(String cardName) {
        CardGame current = head;
        while (current != null) {
            if (current.cardName.equalsIgnoreCase(cardName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public void displayHand() {
        if (head == null) {
            System.out.println("No cards in hand.");
            return;
        }

        CardGame current = head;
        System.out.println("Player's hand:");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}

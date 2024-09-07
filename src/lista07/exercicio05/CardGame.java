package lista07.exercicio05;

public class CardGame {
    String cardName;
    CardGame prev;
    CardGame next;

    public CardGame(String cardName) {
        this.cardName = cardName;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return cardName;
    }
}

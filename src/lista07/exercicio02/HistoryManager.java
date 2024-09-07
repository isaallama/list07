package lista07.exercicio02;

public class HistoryManager {
    private BrowsingHistory head;
    private final int maxSize;
    private int currentSize;

    public HistoryManager(int maxSize) {
        this.head = null;
        this.maxSize = maxSize;
        this.currentSize = 0;
    }

    public void addUrl(String URL) {
        BrowsingHistory newNode = new BrowsingHistory(URL);
        if (head == null) {
            head = newNode;
        } else {
            BrowsingHistory current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        currentSize++;
        if (currentSize > maxSize) {
            removeOldestUrl();
        }
        System.out.println("URL added: " + URL);
    }


    private void removeOldestUrl() {
        if (head == null) {
            return;
        }
        head = head.next;
        currentSize--;
        System.out.println("Oldest URL removed.");
    }

    public void displayHistory() {
        if (head == null) {
            System.out.println("History is empty.");
            return;
        }
        BrowsingHistory current = head;
        System.out.println("Browser History:");
        while (current != null) {
            System.out.println(current.URL);
            current = current.next;
        }
    }

}
package lista07.exercicio02;

public class BrowsingHistory {
    String URL;
    BrowsingHistory next;

    public BrowsingHistory(String URL){
        this.URL = URL;
        this.next = null;
    }

    @Override
    public String toString() {
        return URL;
    }
}

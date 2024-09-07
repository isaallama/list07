package lista07.exercicio03;

public class ActionTaken {
    String action;
    ActionTaken next;

    public ActionTaken(String action) {
        this.action = action;
        this.next = null;
    }

    @Override
    public String toString() {
        return action;
    }
}

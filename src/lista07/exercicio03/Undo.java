package lista07.exercicio03;

public class Undo {
    private static ActionTaken head;

    public Undo() {
        head = null;
    }


    public static void addAction(String action) {
        ActionTaken newNode = new ActionTaken(action);
        newNode.next = head;
        head = newNode;
        System.out.println("Action added: " + action);
    }


    public static void undo() {
        if (head == null) {
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undoing action: " + head.action);
        head = head.next;
    }


    public void displayHistory() {
        if (head == null) {
            System.out.println("No actions recorded.");
            return;
        }
        ActionTaken current = head;
        System.out.println("Action History:");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}


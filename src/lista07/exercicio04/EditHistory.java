package lista07.exercicio04;

public class EditHistory {
    private EditText start;
    private EditText currentEdit;

    public EditHistory() {
        this.start = null;
        this.currentEdit = null;
    }


    public void recordEdit(String action) {
        EditText newEdit = new EditText(action);
        if (start == null) {
            start = newEdit;
            currentEdit = newEdit;
        } else {
            currentEdit.next = newEdit;
            newEdit.previous = currentEdit;
            currentEdit = newEdit;
        }
        System.out.println("Recorded edit: " + action);
    }


    public void revertEdit() {
        if (currentEdit == null) {
            System.out.println("No edits to revert.");
            return;
        }
        System.out.println("Reverted edit: " + currentEdit.editAction);
        currentEdit = currentEdit.previous;
    }


    public void repeatEdit() {
        if (currentEdit == null || currentEdit.next == null) {
            System.out.println("No edits to repeat.");
            return;
        }
        currentEdit = currentEdit.next;
        System.out.println("Repeated edit: " + currentEdit.editAction);
    }


    public void showHistory() {
        if (start == null) {
            System.out.println("No edit history.");
            return;
        }
        EditText temp = start;
        System.out.println("Edit History:");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}


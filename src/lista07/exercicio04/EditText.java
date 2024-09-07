package lista07.exercicio04;

public class EditText{
    String editAction;
    EditText previous;
    EditText next;

    public EditText(String editAction) {
        this.editAction = editAction;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return editAction;
    }
}

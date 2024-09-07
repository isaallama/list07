package lista07.exercicio01;

public class TaskManager {
    private Task head;

    public TaskManager() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added: " + description);
    }


    private Task findTask(String description) {
        Task current = head;
        while (current != null) {
            if (current.description.equals(description)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public void removeTask(String description) {
        if (head == null) {
            System.out.println("No task to remove.");
            return;
        }

        if (head.description.equals(description)) {
            head = head.next;
            System.out.println("Task removed: " + description);
            return;
        }

        Task current = head;
        while (current.next != null && !current.next.description.equals(description)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task removed: " + description);
        } else {
            System.out.println("Task not found: " + description);
        }
    }


    public void markTaskAsCompleted(String description) {
        Task task = findTask(description);
        if (task != null) {
            task.markAsCompleted();
            System.out.println("Task marked as completed: " + description);
        } else {
            System.out.println("Task not found: " + description);
        }
    }


    public int countTasks() {
        int count = 0;
        Task current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public void removeCompletedTasks() {
        if (head == null) {
            System.out.println("No completed tasks to remove.");
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null) {
            if (current.isCompleted) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Task removed: " + current.description);
            } else {
                previous = current;
            }
            current = current.next;
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks added.");
            return;
        }

        Task current = head;
        System.out.println("Task List:");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
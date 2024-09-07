package lista07.exercicio08;


class ProcessNode {
    private final Process process;
    private ProcessNode next;

    public ProcessNode(Process process) {
        this.process = process;
        this.next = null;
    }

    public Process getProcess() {
        return process;
    }

    public ProcessNode getNext() {
        return next;
    }

    public void setNext(ProcessNode next) {
        this.next = next;
    }
}

class ProcessQueue {
    private ProcessNode front;
    private ProcessNode rear;
    private int size;

    public ProcessQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(Process process) {
        ProcessNode newNode = new ProcessNode(process);
        if (rear != null) {
            rear.setNext(newNode);
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
        System.out.println("Process added: " + process);
    }


    public Process dequeue() {
        if (front == null) {
            return null;
        }
        Process process = front.getProcess();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return process;
    }


    public void displayQueue() {
        if (front == null) {
            System.out.println("The process queue is empty.");
            return;
        }
        ProcessNode current = front;
        System.out.println("Processes in the Queue:");
        while (current != null) {
            System.out.println(current.getProcess());
            current = current.getNext();
        }
    }


    public int getSize() {
        return size;
    }
}


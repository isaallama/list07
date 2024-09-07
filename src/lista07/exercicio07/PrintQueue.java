package lista07.exercicio07;


class PrintJobNode {
    private final PrintJob printJob;
    private PrintJobNode next;

    public PrintJobNode(PrintJob printJob) {
        this.printJob = printJob;
        this.next = null;
    }

    public PrintJob getPrintJob() {
        return printJob;
    }

    public PrintJobNode getNext() {
        return next;
    }

    public void setNext(PrintJobNode next) {
        this.next = next;
    }
}


class PrintQueue {
    private PrintJobNode front;
    private PrintJobNode rear;
    private int size;

    public PrintQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


    public void enqueue(PrintJob printJob) {
        PrintJobNode newNode = new PrintJobNode(printJob);
        if (rear != null) {
            rear.setNext(newNode);
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
        System.out.println("Print job added: " + printJob);
    }


    public PrintJob dequeue() {
        if (front == null) {
            return null;
        }
        PrintJob printJob = front.getPrintJob();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return printJob;
    }


    public void displayQueue() {
        if (front == null) {
            System.out.println("The print queue is empty.");
            return;
        }
        PrintJobNode current = front;
        System.out.println("Print Jobs in the Queue:");
        while (current != null) {
            System.out.println(current.getPrintJob());
            current = current.getNext();
        }
    }


    public int getSize() {
        return size;
    }
}


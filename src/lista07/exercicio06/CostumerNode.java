package lista07.exercicio06;


class CustomerNode {
    String customerName;
    CustomerNode next;

    public CustomerNode(String customerName) {
        this.customerName = customerName;
        this.next = null;
    }
}


class CustomerQueue {
    private CustomerNode front;
    private CustomerNode rear;
    private int size;

    public CustomerQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


    public void enqueue(String customerName) {
        CustomerNode newNode = new CustomerNode(customerName);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
        System.out.println("Customer " + customerName + " added to the queue.");
    }

    public String dequeue() {
        if (front == null) {
            return null;
        }
        String customerName = front.customerName;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return customerName;
    }


    public void displayQueue() {
        if (front == null) {
            System.out.println("The queue is empty.");
            return;
        }
        CustomerNode current = front;
        System.out.print("Customers in the queue: ");
        while (current != null) {
            System.out.print(current.customerName + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

}
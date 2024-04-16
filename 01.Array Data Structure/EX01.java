class QueueArray {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    // Constructor
    public QueueArray(int q) {
        maxSize = q;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Get the number of items stored in the queue
    public int size() {
        return nItems;
    }

    // Enqueue or insert an element
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + x);
        } else {
            rear = (rear + 1) % maxSize;
            queArray[rear] = x;
            nItems++;
            System.out.println(x + " enqueued to the queue");
        }
    }

    // Dequeue or remove an element
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
        } else {
            int removedItem = queArray[front];
            front = (front + 1) % maxSize;
            nItems--;
            System.out.println(removedItem + " dequeued from the queue");
        }
    }

    // Peek at the front of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek");
            return -1; // Return a default value indicating an empty queue
        } else {
            return queArray[front];
        }
    }

    // Display the elements of the queue
    public void displayData() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to display.");
        } else {
            System.out.print("Queue elements: ");
            int count = 0;
            int index = front;
            while (count < nItems) {
                System.out.print(queArray[index] + " ");
                index = (index + 1) % maxSize;
                count++;
            }
            System.out.println();
        }
    }
}

public class EX01 {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());
        System.out.println("Queue size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Is the queue full? " + queue.isFull());
        System.out.println("Queue size: " + queue.size());

        queue.displayData();

        System.out.println("Front of the queue: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        queue.displayData();
    }
}

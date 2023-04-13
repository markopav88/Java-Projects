public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (empty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public T front() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }

    public boolean empty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        // Enqueue elements
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(13);
        queue.enqueue(6);
        queue.enqueue(11);

        // Dequeue elements and sum values
        int sum = 0;
        while (!queue.empty()) {
            sum += queue.front();
            queue.dequeue();
        }

        System.out.println("Sum of the elements: " + sum);
    }
}
/** queue becomes empty after you've dequeued all the elements during the loop in the main method /*
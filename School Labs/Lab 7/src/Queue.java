public interface Queue<T> {
    void enqueue(T element);
    /**
     * Removes and returns the element at the front of the queue.
     * @return the dequeued element
     */
    T dequeue();
    /**
     * Returns the element at the front of the queue without removing it.
     * @return the front element
     */
    T front();
    boolean empty();
}
//

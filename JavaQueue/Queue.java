public class Queue<T> {
    private T[] arr;
    private int head;
    private int tail;
    private int size;

    public Queue(int capacity) {
        arr = (T[]) new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(T item) throws FullQueueException{
        if (isFull()) {
            throw new FullQueueException("Queue is full");
        }
        arr[tail++] = item;
        if (tail == arr.length) {
            tail = 0;
        }
        size++;
    }

    public T dequeue() throws EmptyQueueException{
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        T item = arr[head];
        arr[head++] = null;
        if (head == arr.length) {
            head = 0;
        }
        size--;
        return item;
    }
}

import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private Node first = new Node();
    private Node last = new Node();

    @Override
    public void enqueue(T item) {
        Node newNode = new Node();
        newNode.info = item;
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T front() throws NoSuchElementException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    private class Node
    {
        private T info = null;
        private Node next = null;
    }
}
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private Node first = null;
    private Node last = null;

    public MyQueue()
    {
        first = null;
        last = null;
    }

    @Override
    public void enqueue(T item) {
        Node newNode = new Node();
        newNode.info = item;
        if(first == null)
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            T item = first.info;
            first = first.next;
            return item;
        }
    }

    @Override
    public T front() throws NoSuchElementException {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first.info;
        }
    }

    @Override
    public int size() {
        if(first == null)
        {
            return 0;
        }
        else
        {
            int x = 1;
            Node test = first;
            while(test.next != null)
            {
                test = test.next;
                x++;
            }
            return x;
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
    }

    private class Node
    {
        private T info;
        private Node next;
    }
}
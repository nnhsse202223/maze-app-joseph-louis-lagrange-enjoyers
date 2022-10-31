import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyQueueTest
{
    public MyQueueTest()
    {

    }

    @Before
    public void setUp()
    {

    }
 
    @After
    public void tearDown()
    {

    }

    @Test
    public void testBasic()
    {
        MyQueue<String> test = new MyQueue<>();
        try
        {
            test.front();
            fail();
        }
        catch (Exception e) 
        {
            
        }
        try
        {
            test.dequeue();
            fail();
        }
        catch (Exception e) 
        {
            
        }
        assertEquals(test.size(), 0);
        assertEquals(test.isEmpty(), true);
        test.enqueue("first");
        assertEquals(test.size(), 1);
        assertEquals(test.isEmpty(), false);
        test.enqueue("second");
        assertEquals(test.size(), 2);
        assertEquals(test.isEmpty(), false);
        assertEquals(test.front(), "first");
        assertEquals(test.dequeue(), "first");
        assertEquals(test.size(), 1);
        assertEquals(test.isEmpty(), false);
        test.enqueue("third");
        assertEquals(test.size(), 2);
        assertEquals(test.isEmpty(), false);
        assertEquals(test.front(), "second");
        assertEquals(test.dequeue(), "second");
        assertEquals(test.size(), 1);
        assertEquals(test.isEmpty(), false);
        test.enqueue("fourth");
        assertEquals(test.size(), 2);
        assertEquals(test.isEmpty(), false);
        test.enqueue("fifth");
        assertEquals(test.size(), 3);
        assertEquals(test.isEmpty(), false);
        assertEquals(test.front(), "third");
        assertEquals(test.dequeue(), "third");
        assertEquals(test.size(), 2);
        assertEquals(test.isEmpty(), false);
        assertEquals(test.front(), "fourth");
        assertEquals(test.dequeue(), "fourth");
        assertEquals(test.size(), 1);
        assertEquals(test.isEmpty(), false);
        assertEquals(test.front(), "fifth");
        assertEquals(test.dequeue(), "fifth");
        assertEquals(test.size(), 0);
        assertEquals(test.isEmpty(), true);
        try
        {
            test.front();
            fail("An exception should be thrown when calling front() with no nodes in the list");
        }
        catch (Exception e) 
        {
            
        }
        try
        {
            test.dequeue();
            fail("An exception should be thrown when calling dequeue() with no nodes in the list");
        }
        catch (Exception e) 
        {
            
        }
    }

    @Test
    public void testClear()
    {
        MyQueue<String> test = new MyQueue<>();
        test.clear();
        assertEquals(test.size(), 0);
        assertEquals(test.isEmpty(), true);
        test.enqueue("first");
        assertEquals(test.size(), 1);
        assertEquals(test.isEmpty(), false);
        test.enqueue("second");
        assertEquals(test.size(), 2);
        assertEquals(test.isEmpty(), false);
        test.enqueue("third");
        assertEquals(test.size(), 3);
        assertEquals(test.isEmpty(), false);
        test.enqueue("fourth");
        assertEquals(test.size(), 4);
        assertEquals(test.isEmpty(), false);
        test.enqueue("fifth");
        assertEquals(test.size(), 5);
        assertEquals(test.isEmpty(), false);
        test.clear();
        assertEquals(test.size(), 0);
        assertEquals(test.isEmpty(), true);
    }
}
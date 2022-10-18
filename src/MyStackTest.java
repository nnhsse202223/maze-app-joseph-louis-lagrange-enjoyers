import static org.junit.Assert.*;
import javax.print.attribute.standard.MediaSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.ArrayList;

import java.util.Stack;

public class MyStackTest {
    public MyStackTest(){

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
    public void testClear()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }
        stack.clear();
        stack2.clear();
        assertEquals(stack.toString(),stack2.getList().toString().toString());
    }

    @Test
    public void testPush()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }
        stack.push(0);
        stack2.push(0);
        assertEquals(stack.toString(),stack2.getList().toString());
    }

    @Test
    public void testPop()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }
        assertEquals(stack.pop(),stack2.pop());
    }

    @Test
    public void testTop()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }

        assertEquals(stack.peek(),stack2.top());
    }


    @Test
    public void testisEmpty()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }
        
        assertEquals(stack.isEmpty(),stack2.isEmpty());
    }

    @Test
    public void testsize()
    {
        Stack stack = new Stack();
        myStack stack2 = new myStack<>();
        for(int i =0; i < 10; i++){
            stack.push(i);
            stack2.push(i);
        }

        assertEquals(stack.size(),stack2.size());
    }
}

import static org.junit.Assert.*;
import javax.print.attribute.standard.MediaSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.ArrayList;

public class MazeTest {
    public MazeTest(){

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
    public void testgetNeighbors()
    {
        //Square in Maze
        Maze test = new Maze();
        test.loadMaze("C:/Users/amnguyen2/Desktop/maze-app-joseph-louis-lagrange-enjoyers/src/maze-2");

        ArrayList<Square> neighbors = test.getNeighbors(new Square(4, 4, 1));
        ArrayList<Square> actualNeighbors = new ArrayList<>();
        actualNeighbors.add(new Square(4,3,0));
        actualNeighbors.add(new Square(3,4,1));
        actualNeighbors.add(new Square(5,4,0));
        actualNeighbors.add(new Square(4,5,0));

        assertEquals(actualNeighbors,neighbors);

        ArrayList<Square> neighbors2 = test.getNeighbors(new Square(3, 9, 0));
        ArrayList<Square> actualNeighbors2 = new ArrayList<>();
        actualNeighbors.add(new Square(3,10,0));
        actualNeighbors.add(new Square(3,8,0));
        actualNeighbors.add(new Square(2,9,1));
        actualNeighbors.add(new Square(4,9,1));

        assertEquals(actualNeighbors,neighbors);

        //Corners
        ArrayList<Square> neighborsCorner = test.getNeighbors(new Square(3, 4, 1));

        //Borders
    }





    @Test
    public void testgetStart()
    {

    }

    @Test
    public void testgetFinish()
    {

    }

    @Test
    public void testReset()
    {

    }

    
    @Test
    public void testInvalidMazeName()
    {
        Maze invalidMaze = new Maze();
        assertEquals(false, invalidMaze.loadMaze("this is not a valid path to a maze"));
    }

    @Test
    public void testLoadMazeInvalid()
    {
        Maze invalidMaze = new Maze();
        assertEquals(false, invalidMaze.loadMaze("maze-invalid"));
    }

    @Test
    public void testLoadMazeGood()
    {
        Maze invalidMaze = new Maze();
        assertEquals(true, invalidMaze.loadMaze("maze-2"));
    }



}

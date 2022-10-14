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
        test.loadMaze("maze-2");

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
        ArrayList<Square> neighborsTopLeftCorner = test.getNeighbors(new Square(1, 0, 0));
        ArrayList<Square> actualneighborsTopLeftCorner = new ArrayList<>();
        actualneighborsTopLeftCorner.add(new Square(1, 1, 0));
        actualneighborsTopLeftCorner.add(new Square(2, 0, 1));
        assertEquals(actualneighborsTopLeftCorner, neighborsTopLeftCorner);

        
        ArrayList<Square> neighborsBottomRightCorner = test.getNeighbors(new Square(7, 13, 0));
        ArrayList<Square> actualneighborsBottomRightCorner = new ArrayList<>();
        actualneighborsBottomRightCorner.add(new Square(6, 13, 0));
        actualneighborsBottomRightCorner.add(new Square(7, 12, 3));
        assertEquals(actualneighborsBottomRightCorner, neighborsBottomRightCorner);
        
        
        //Borders
        ArrayList<Square> neighborsTopBorder = test.getNeighbors(new Square(1, 5, 0));
        ArrayList<Square> actualneighborsTopBorder = new ArrayList<>();
        actualneighborsTopBorder.add(new Square(1, 4, 0));
        actualneighborsTopBorder.add(new Square(1, 6, 1));
        actualneighborsTopBorder.add(new Square(2, 6, 1));
        assertEquals(actualneighborsTopBorder, neighborsTopBorder);

        ArrayList<Square> neighborsBottomBorder = test.getNeighbors(new Square(7, 5, 0));
        ArrayList<Square> actualneighborsBottomBorder = new ArrayList<>();
        actualneighborsBottomBorder.add(new Square(7, 4, 2));
        actualneighborsBottomBorder.add(new Square(7,6, 0));
        actualneighborsBottomBorder.add(new Square(6, 5, 1));
        assertEquals(actualneighborsBottomBorder, neighborsBottomBorder);
    }

    @Test
    public void testgetStart()
    {
        Maze test = new Maze();
        test.loadMaze("maze-2");
        Square start = new Square(7, 4, 2);
        assertEquals(start,test.getStart());

        Maze test2 = new Maze();
        test.loadMaze("maze-4");
        Square start2 = new Square(6, 4, 2);
        assertEquals(start,test.getStart());
    }

    @Test
    public void testgetFinish()
    {
        Maze test = new Maze();
        test.loadMaze("maze-2");
        Square finish = new Square(7, 12, 3);
        assertEquals(finish,test.getFinish());

        Maze test2 = new Maze();
        test.loadMaze("maze-4");
        Square finish2 = new Square(1, 10, 3);
        assertEquals(finish2,test2.getFinish());
    }

    @Test
    public void testReset()
    {
        //Fill in after reset is implemented
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
        Maze maze = new Maze();
        assertEquals(true, maze.loadMaze("maze-2"));
        maze.toString();
    }



}

import java.util.ArrayList;

public class Maze {
    private Square[][]  maze;   // somewhere as a class variable
    public Maze(){}

    public boolean loadMaze(String fname){
        return true;
    }

    public ArrayList<Square> getNeighbors(Square sq){
        return null;
    }

    public Square getStart(){
        return null;
    }

    public Square getFinish(){
        return null;
    }

    public void reset(){

    }

    public String toString(){
        return "";
    }



    




}



/**
 * import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Maze {
    private Square[][]  maze;   // somewhere as a class variable
    private Square start;
    private Square finish;
    private int numRows;
    private int numCols;

    public Maze()
    {

    }

    public boolean loadMaze(String fname)
    {
        try
        {
        Scanner s = new Scanner(new File(fname));
        numRows = s.nextInt();
        numCols = s.nextInt();
        this.maze = new Square[numRows][numCols];
        for (int row = 0; row < numRows; row++) 
        {
            for (int col = 0; col < numCols; col++) 
            {
                int x = s.nextInt();
                Square newSquare = new Square(row, col, x);
                if(x == 2)
                {
                    start = newSquare;
                }
                if(x == 3)
                {
                    finish = newSquare;
                }
                maze[row][col] = newSquare;
            }
        }
        if(start == null || finish == null || s.hasNextInt())
        {
            return false;
        }
        return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<>();
        int row = sq.getRow();
        int col = sq.getCol();
        if(row > 0)
        {
            neighbors.add(maze[row - 1][col]);
        }
        if(row < numRows - 1)
        {
            neighbors.add(maze[row + 1][col]);
        }
        if(col > 0)
        {
            neighbors.add(maze[row][col - 1]);
        }
        if(col < numCols - 1)
        {
            neighbors.add(maze[row][col + 1]);
        }
        return neighbors;
    }

    public Square getStart()
    {
        return start;
    }

    public Square getFinish()
    {
        return finish;
    }

    public void reset()
    {
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                maze[row][col].reset();
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(maze[row][col].getType() == 0)
                {
                    sb.append("_");
                }
                if(maze[row][col].getType() == 1)
                {
                    sb.append("#");
                }
                if(maze[row][col].getType() == 2)
                {
                    sb.append("S");
                }
                if(maze[row][col].getType() == 3)
                {
                    sb.append("E");
                }
            }
        }
        return new String(sb);
    }
}

 */
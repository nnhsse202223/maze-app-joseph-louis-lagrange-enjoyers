import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class MazeSolver 
{    
    public abstract void makeEmpty(); //create an empty worklist

    public abstract boolean isEmpty(); //return true if the worklist is empty

    public abstract void add(Square sq); //add the given Square to the worklist

    public abstract Square next(); //return the "next" item from the worklist

    protected Maze testMaze;

    private boolean solved;
    private boolean valid;
    private Square final_Square;
    private ArrayList<int[]> path;


    public MazeSolver(Maze maze)
    {
        this.testMaze = maze;
        this.solved = false;
        this.valid = false;
        this.final_Square = this.testMaze.getFinish();
        this.path = new ArrayList<>();
        this.makeEmpty();
        this.add(this.testMaze.getStart());
    }

    public boolean isSolved() 
    {
        return this.solved;
    }

    public String getPath() 
    {
        if(!isSolved())
        {
            return "The maze is not solved.";
        }
        else
        {
            Square stepSquare = this.final_Square;
            int[] row_col_end_square = {stepSquare.getRow(),stepSquare.getCol()};
            this.path.add(row_col_end_square);
            Square previousSquare = stepSquare.getPrevious();
            while(previousSquare != null)
            {
                int[] row_col_previous_square = {previousSquare.getRow(),previousSquare.getCol()};
                this.path.add(row_col_previous_square);
                stepSquare = previousSquare;
            }
        }
    }

    public Square step() 
    {
        if(isEmpty())
        {
            return null;
            
        }
        else
        {
            Square newSquare = next();
            if(newSquare.getType() != 3)
            {
                ArrayList<Square> neighbors = testMaze.getNeighbors(newSquare);
                for(Square neighbor: neighbors)
                {
                    add(neighbor);
                }
            }
            return newSquare;
        }
    }

    public void solve() 
    {
        while(true)
        {
            Square stepSquare = step();
            if(stepSquare == null)
            {
                break;
            }
            if(stepSquare.getType() == 3)
            {
                this.solved = true;
                System.out.println(this.getPath());
            }
        }
    }


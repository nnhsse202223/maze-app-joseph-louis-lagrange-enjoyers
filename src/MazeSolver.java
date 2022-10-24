import java.util.ArrayList;

public abstract class MazeSolver 
{    
    public abstract void makeEmpty(); //create an empty worklist

    public abstract boolean isEmpty(); //return true if the worklist is empty

    public abstract void add(Square sq); //add the given Square to the worklist

    public abstract Square next(); //return the "next" item from the worklist

    protected Maze testMaze;

    private boolean solved;
    private Square final_Square;
    private String path;
    private boolean possible;


    public MazeSolver(Maze maze)
    {
        possible = true;
        this.testMaze = maze;
        this.solved = false;
        this.final_Square = testMaze.getFinish();
        this.path = "";
        this.makeEmpty(); 
        this.add(this.testMaze.getStart());
    }

    public boolean isSolved() 
    {
        return this.solved;
    }

    public String getPath() 
    {
        if(!solved && possible)
        {
            return "The maze is not solved yet.";
        }
        else if(!possible)
        {
            return "The maze is unsolvable.";
        }
        else
        {
            Square stepSquare = this.final_Square;
            while(stepSquare != null)
            {
                this.path += "(";
                this.path += stepSquare.getRow();
                this.path += ",";

                this.path += stepSquare.getCol();
                this.path += "), ";
                stepSquare.setOnPath(true);
                stepSquare = stepSquare.getPrevious();
                System.out.println("Previous Square: ");
                System.out.println(stepSquare.getRow());
                System.out.println(stepSquare.getCol());
            }
            return path;
        }
    }

    public Square step() 
    {
        if(isEmpty())
        {
            solved = true;
            possible = false;
            return null;
        }
        else
        {
            Square newSquare = next();
            newSquare.setExplored(true);
            newSquare.setOnList(false);
            if(newSquare.getType() != 3)
            {
                ArrayList<Square> neighbors = testMaze.getNeighbors(newSquare);
                for(Square neighbor: neighbors)
                {
                    if(!neighbor.getExplored() || !neighbor.getOnList())
                    {
                        neighbor.setPrevious(newSquare);
                        add(neighbor);
                    }
                }
            }
            else
            {
                solved = true;
            }
            return newSquare;
        }
    }

    public void solve() 
    {
        while(true)
        {
            Square stepSquare = step();
            if(stepSquare == null || stepSquare.getType() == 3)
            {
                break;
            }
        }
        System.out.println(this.getPath());
    }
}

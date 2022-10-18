public abstract class MazeSolver 
{    
    public abstract void makeEmpty(); //create an empty worklist

    public abstract boolean isEmpty(); //return true if the worklist is empty

    public abstract void add(Square sq); //add the given Square to the worklist

    public abstract Square next(); //return the "next" item from the worklist

    protected Maze testMaze;

    private boolean solved;
    private boolean valid;

    public MazeSolver(Maze maze)
    {
        this.testMaze = maze;
        this.solved = false;
        this.valid = false;
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
            if(this.valid){ //check valid path




            }
            else{



                
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
            Square new = next();
        }
    }

    public void solve() 
    {
        while(true)
        {
            if(step() == null)
            {
                break;
            }
        }
    }
}

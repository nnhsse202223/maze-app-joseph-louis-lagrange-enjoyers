public abstract class MazeSolver 
{    
    public abstract void makeEmpty();

    public abstract boolean isEmpty();

    public abstract void add(Square sq);

    public abstract Square next();

    public MazeSolver(Maze maze)
    {
        
    }

    public boolean isSolved() 
    {
        return false;
    }

    public String getPath() 
    {
        return null;
    }

    public Square step() 
    {
        return null;
    }

    public void solve() 
    {

    }
}

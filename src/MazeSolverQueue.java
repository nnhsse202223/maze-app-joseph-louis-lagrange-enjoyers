public class MazeSolverQueue extends MazeSolver
{
    private MyQueue<Square> worklist;

    public MazeSolverQueue(Maze maze) 
    {
        super(maze);
    }

    @Override
    public void makeEmpty() 
    {
        worklist = new MyQueue<>();
    }

    @Override
    public boolean isEmpty() 
    {
        return worklist.isEmpty();
    }

    @Override
    public void add(Square sq) 
    {
        worklist.enqueue(sq);
    }

    @Override
    public Square next() 
    {
        return worklist.dequeue();
    }

    public static void main(String[] args)
    {
        Maze testMaze = new Maze();
        testMaze.loadMaze("C:/Users/jaqunell/maze-app-joseph-louis-lagrange-enjoyers/src/maze-2");
        MazeSolverQueue testSolver = new MazeSolverQueue(testMaze);
        testSolver.solve();
    }
}

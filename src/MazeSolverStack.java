
public class MazeSolverStack extends MazeSolver {
    
    private MyStack<Square> worklist;
    
    public MazeSolverStack(Maze maze){
        super(maze);
    }

    @Override
    public void makeEmpty() {
        this.worklist = new MyStack<>();
    }

    @Override
    public boolean isEmpty() {
        return this.worklist.isEmpty();
    }

    @Override
    public void add(Square sq) {
        worklist.push(sq);
    }
        
    @Override
    public Square next() {
        return worklist.pop();
    }

    public static void main(String[] args) {
        /*
         * Also, for testing purposes, give both MazeSolverStack and MazeSolverQueue main( ) methods that get a maze from the command-line argument, 
         * create the appropriate type of worklist, call the solve( ) method to find a solution and then print the resulting path, if there is one.
         */

        Maze testmaze = new Maze();
        testmaze.loadMaze("C:/Users/amnguyen2/Desktop/maze-app-joseph-louis-lagrange-enjoyers/src/maze-4");
        MazeSolverStack test_solver_stack = new MazeSolverStack(testmaze);
        test_solver_stack.solve();




        
    }

}

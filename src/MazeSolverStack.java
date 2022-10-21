public class MazeSolverStack extends MazeSolver {
    
    private MyStack<Square> worklist;
    
    public MazeSolverStack(Maze maze){
        super(maze);\
        ///TOOOO DOOOO IMPLEMENT WORKLISt
    }

    @Override
    public void makeEmpty() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void add(Square sq) {
        worklist.push(sq);
    }
        
    }

    @Override
    public Square next() {
        // TODO Auto-generated method stub
        return null;
    }

}

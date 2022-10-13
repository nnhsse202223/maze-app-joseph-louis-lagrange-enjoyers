import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Maze {
    private Square[][]  maze;   // somewhere as a class variable
    private Square start;
    private Square finish;
    private int numRows;
    private int numCols;

    public Maze(){}


    public boolean loadMaze(String fname)
        throws FileNotFoundException{
        
        Scanner s = new Scanner(new File(fname));
        numRows = s.nextInt();
        numCols = s.nextInt();
        this.maze = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                maze[row][col] = null;
    }
}
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

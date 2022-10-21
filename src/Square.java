public class Square
{
    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    
    private int type;
    private int row;
    private int col;

    private Square previous;
    private boolean onPath;
    private boolean onList;
    private boolean explored;

    /**
     * Constructor for objects of class Square
     * 
     * @param initialRow    the row for this Square in the Maze
     * @param initialCol    the column for this Square in the Maze
     * @param initialType   the type (space, wall, start, exit) for this
     *                          Square in the Maze
     */
    public Square(int initialRow, int initialCol, int initialType)
    {
        this.row = initialRow;
        this.col = initialCol;
        this.type = initialType;
        this.previous = null;
        onPath = false;
        onList = false;
        explored = false;
    }

    /**
     * Returns this square's type
     *
     * @return    this square's type
     */
    public int getType()
    {
        return this.type;
    }

    /**
     * Returns this square's row
     *
     * @return    this square's row
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * Returns this square's column
     *
     * @return    this square's column
     */
    public int getCol()
    {
        return this.col;
    }

    public void reset()
    {
        
    }

    @Override
    public String toString()
    {
        String str = null;

        switch(this.getType())
        {
            case Square.SPACE:
            {
                str = "_";
                break;
            }
            case Square.WALL:
            {
                str = "#";
                break;
            }
            case Square.START:
            {
                str = "S";
                break;
            }
            case Square.EXIT:
            {
                str = "E";
                break;
            }
        }
        if(onList)
        {
            str += "o";
        }
        if(explored)
        {
            str += ".";
        }
        if(onPath)
        {
            str += "x";
        }
        return str;
    }

    @Override
    public boolean equals(Object other)
    {
        // self check
        if(this == other)
        {
            return true;
        }

        // null check
        if(other == null)
        {
            return false;
        }

        // type check
        if(this.getClass() != other.getClass())
        {
            return false;
        }

        Square otherSq = (Square)other;

        // field comparision
        return (this.row == otherSq.row) &&
                (this.col == otherSq.col) &&
                (this.type == otherSq.type);
    }

    public Square getPrevious()
    {
        return previous;
    }

    public void setPrevious(Square pre)
    {
        previous = pre;
    }

    public void setOnPath(boolean state)
    {
        if(type == 0)
        {
            onPath = state;
        }
    }

    public void setOnList(boolean state)
    {
        if(type == 0)
        {
            onList = state;
        }
    }

    public void setExplored(boolean state)
    {
        if(type == 0)
        {
            explored = state;
        }
    }

    public boolean getOnPath()
    {
        return onPath;
    }
    public boolean getOnList()
    {
        return onList;
    }

    public boolean getExplored()
    {
        return explored;
    }
}
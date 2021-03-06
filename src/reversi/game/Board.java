package reversi.game;

/**
 * Names: Natalie Elisha and Ofek Segal.
 * IDs: 209475458, 315638288
 */
public class Board {
    //The default size
    private static final int DEFAULT_SIZE = 8;
    
    //The cell matrix
    private final Cell[][] _theBoard;
    
    //The real size
    private final int _boardSize;
    
    //The number of x cells in the matrix
    private int _xCount;
    
    //The number of o cells in the matrix
    private int _oCount;
    
    /**
     * Creating a Board object
     * with the default size (8)
     */
    public Board() {
        _boardSize = DEFAULT_SIZE;
        _theBoard = new Cell[_boardSize][_boardSize];
        
        for (int i = 0; i < _boardSize; i++) {
            for (int j = 0; j < _boardSize; j++) {
                _theBoard[i][j] = Cell.Empty;
            }
        }
    }
    
    /**
     * Creating a Board object
     * with the specified size
     * @param size the size of the board
     */
    public Board(int size) {
        _boardSize = size;
        _theBoard = new Cell[_boardSize][_boardSize];
        
        for (int i = 0; i < _boardSize; i++) {
            for (int j = 0; j < _boardSize; j++) {
                _theBoard[i][j] = Cell.Empty;
            }
        }
    }
    
    /**
     * Copy constructor
     * @param b the board to copy
     */
    public Board(Board b) {
        _boardSize = b._boardSize;
        _theBoard = new Cell[_boardSize][_boardSize];
        
        for (int outerIndex = 0; outerIndex < _boardSize; outerIndex++) {
            for (int innerIndex = 0; innerIndex < _boardSize; innerIndex++) {
                _theBoard[outerIndex][innerIndex] = b._theBoard[outerIndex][innerIndex];
            }
        }
    }
    
    /**
     * Returning the size of the board
     * @return the size of the board
     */
    public int getBoardSize() {
        return _boardSize;
    }
    
    /**
     * Returning the number of X
     * cells in the board
     * @return the number of x cells
     */
    public int getXCount() {
        return _xCount;
    }
    
    /**
     * Returning the number of o
     * cells in the board
     * @return the number of o cells
     */
    public int getOCount() {
        return _oCount;
    }
    
    /**
     * Checking if the point is
     * on the board
     * @param p the point to check
     * @return true or false
     */
    public boolean pointExists(Point p) {
        return 0 <= p.getX() && p.getX() < _boardSize &&
               0 <= p.getY() && p.getY() < _boardSize;
    }
    
    /**
     * Checking if the cell
     * in the point is Empty
     * @param p the cell's location (a point)
     * @return true or false
     */
    public boolean isCellEmpty(Point p) {
        if (!pointExists(p)) {
            return false;
        }
        return _theBoard[p.getX()][p.getY()] == Cell.Empty;
    }
    
    /**
     * Setting the cell's value
     * @param p the cell's location
     * @param playerType - the new value
     * @return true if the action succeeded,
     * 		   otherwise false
     */
    public boolean setCell(Point p, Cell playerType) {
        if (!pointExists(p)) {
            return false;
        }
        
        Cell before = _theBoard[p.getX()][p.getY()];
        switch (before) {
            case X:     _xCount--;
                        break;
            case O:     _oCount--;
                        break;
            default:    break;
        }
        
        _theBoard[p.getX()][p.getY()] = playerType;
        
        switch (playerType) {
            case X:     _xCount++;
                        break;
            case O:     _oCount++;
                        break;
            default:    break;
        }
        return true;
    }
    
    /**
     * Returning the cell's value
     * @param p the cell's location
     * @return the cell's value
     */
    public Cell getCell(Point p) {
        if (!pointExists(p)) {
            return Cell.Empty;
        }
        
        return _theBoard[p.getX()][p.getY()];
    }
    
    /**.
     * The function returns a printable version
     * of the board
     * @return the board as a string
     */
    @Override
    public String toString() {
        String toReturn = "";
	toReturn += " | ";
	for (int counter = 0; counter < _boardSize; counter++) {
            String numberToString = Integer.toString(counter + 1);
            toReturn += numberToString;
            toReturn += " | ";
	}
        toReturn += "\n";
	for (int index = 0; index < 2 + 4 * _boardSize; index++) {
            toReturn += "-";
        }
        toReturn += "\n";
        //Going through the board, line by line
        for (int outer = 0; outer < _boardSize; outer++) {
            String numberToString = Integer.toString(outer + 1);
            toReturn += numberToString;
            toReturn += "| ";
            for (int inner = 0; inner < _boardSize; inner++) {
                //Choosing what to print
                switch (_theBoard[outer][inner]) {
                    case Empty:     toReturn += " ";
                                    break;
                    case X:         toReturn += "X";
                                    break;
                    case O:         toReturn += "O";
                                    break;
                }
                toReturn += " | ";
            }
            toReturn += "\n";
            for (int index = 0; index < 2 + 4 * _boardSize; index++) {
                toReturn += "-";
            }
            toReturn += "\n";
        }
        return toReturn;
    }
}

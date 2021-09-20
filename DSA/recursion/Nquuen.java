public class Nquuen {
    
    static boolean canPlace(int[][] board, int x, int y, int n)
    {
        for (int i = 1; i < board.length; i++) {
            if (board[x+i][y] == 1 || board[x][y+i] == 1 || board[x+i][y+i] == 1)
            {
                return false;
            }
        }
        
        return true;
    }

    static boolean PlaceQueen(int[][] board, int y, int n)
    {
        if(y == n)
        {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if(canPlace(board, i, y, n))
            {
                board[i][y] = 1;
                if(PlaceQueen(board, y+1, n))
                {
                    return true;
                }
                board[i][y] = 0;
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}

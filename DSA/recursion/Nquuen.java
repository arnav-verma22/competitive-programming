public class Nquuen {
    
    static boolean canPlace(int[][] board, int x, int y, int n)
    {
        for (int i = 1; i < board.length; i++) {
            try {
                if (board[x+i][y] == 1 || board[x][y+i] == 1 || board[x+i][y+i] == 1 
                    )
            {
                return false;
            }

            } catch (Exception e) {
                //TODO: handle exception
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
        
        int[] arr = {1,2,3,3,4,5,6};
        try {

            if (arr[6] == 6) {
                System.out.println("true");
            }
            if(arr[7] == 8 )
            {
                System.out.println("true");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

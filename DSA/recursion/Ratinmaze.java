class Ratinmaze{

    static boolean isValid(int[][] maze, int x, int y, int n)
    {
        if(x<n && y<n && maze[x][y]==1)
            return true;
        
        return false;
    }
    static boolean ratinmaze(int[][] maze, int x, int y, int n, int[][] path)
    {
        path[x][y] = 1;
        if(x == n-1 && y == n-1)
        {
            path[x][y] = 1;
            return true;
        }
        if(isValid(maze, x+1, y, n))
        {
            
            if(ratinmaze(maze, x+1, y, n, path))
            {
                return true;
            }
        }
        if(isValid(maze, x, y+1, n))
        {
            if(ratinmaze(maze, x, y+1, n, path))
            {
                return true;
            }
                
        }
        path[x][y] = 0;
        return false;
    }
    public static void main(String[] args) 
    {
        int[][] path = new int[5][5];
        for(int i=0; i<5; i++)
        {
            for (int j = 0; j < path.length; j++) 
            {
                path[i][j] = 0;
            }
        }
        int[][] maze =  {{1,0,1,0,1},
                        {1,1,1,1,1},
                        {0,1,0,1,0},
                        {1,0,0,1,1},
                        {1,1,1,0,1}};
        if(ratinmaze(maze, 0, 0, 5, path))
        {
            for (int i = 0; i < path.length; i++) 
            {
                for (int j = 0; j < path.length; j++) 
                {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
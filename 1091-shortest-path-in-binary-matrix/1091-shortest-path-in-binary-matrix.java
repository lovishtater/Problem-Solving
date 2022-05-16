class Solution 
{
    public int shortestPathBinaryMatrix(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        if(m==0)
            return 0;
        if(grid[0][0]==1)
            return -1;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        grid[0][0]=1;
        int[][] dir={{0,-1},{0,1},{1,-1},{1,0},{1,1},{-1,-1},{-1,0},{-1,1}};
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-- > 0)
            {
                int[] curPoint=q.poll();
                if(curPoint[0]==m-1 && curPoint[1]==n-1)
                    return curPoint[2];
                for(int[] d:dir)
                {
                    int r=curPoint[0]+d[0];
                    int c=curPoint[1]+d[1];
                    if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==0)
                    {
                        q.add(new int[]{r,c,curPoint[2]+1});
                        grid[r][c]=1;
                    }
                }
            }
        }
        return -1;
    }
}
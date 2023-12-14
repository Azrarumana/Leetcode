class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int grid2[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid2[j][i]=grid[i][j];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Arrays.equals(grid[i],grid2[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
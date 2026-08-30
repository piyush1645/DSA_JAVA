class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    coverLand(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void coverLand(char[][] grid ,int i,int j){

        //boundary check
        if(i<0 || i>=grid.length || j<0 ||j>= grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
            coverLand(grid,i,j-1);
      
            coverLand(grid,i,j+1);
            coverLand(grid,i-1,j);
            coverLand(grid,i+1,j);
        
    }
}
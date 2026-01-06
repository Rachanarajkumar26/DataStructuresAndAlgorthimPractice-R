class Solution {
    public void rotate(int[][] matrix) {
        
        //transpose
        int c=matrix[0].length;
        int r=matrix.length;

        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }

        for(int i=0;i<r;i++)
        {
            reverse(i,c,matrix);
        }
    }

    public static void reverse(int i,int j,int mat[][])
    {
        int left=0;
        int right=j-1;

        while(left<right)
        {
            int temp=mat[i][left];
            mat[i][left]=mat[i][right];
            mat[i][right]=temp;

            left++;
            right--;
        }
    } 
}
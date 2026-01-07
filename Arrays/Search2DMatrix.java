// tc:O(m*n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int c=matrix[0].length;
        int r=matrix.length;
        int ele=matrix[r/2][c-1];
         boolean found=false;
        if(ele==target)
        {
            return true;
        }
        else if(ele<target)
        {
            for(int i=(r/2)+1;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(matrix[i][j]==target)
                    {
                        found=true;
                    }
                }
            }
        }
        else if(ele>target)
        {
            for(int i=0;i<=r/2;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(matrix[i][j]==target)
                    {
                        found=true;
                    }
                }
            }
        }

        if(found==true)
        return true;
        else
        return false;
    }
}


//using binary search
//tc:O(log(m*n))
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int c=matrix[0].length;
        int r=matrix.length;
        
        int low=0,high=r*c-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            int row=mid/c;
            int col=mid%c;

            if(matrix[row][col]==target)
            return true;

            else if(matrix[row][col]>target)
            {
                high=mid-1;
            }
            
            else if(matrix[row][col]<target)
            {
                low=mid+1;
            }
            

        }

        return false;
    }
}
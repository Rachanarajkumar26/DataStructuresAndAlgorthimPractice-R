class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;
        int low=0,mid=0,high=n-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
               mid++;
            }
            else if(nums[mid]==2)
            {
                swap(mid,high,nums);
                high--;
            }
        }
    }

    public static void swap(int num1,int num2,int nums[])
    {
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}
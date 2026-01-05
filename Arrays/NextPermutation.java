class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int ind1=-1;
        int ind2=0;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                 ind1=i;
                 break;
            }
        }

        if(ind1==-1)
        {
            reverse(0,nums);
            return;

        }
        int pivot=nums[ind1];

        for(int i=n-1;i>ind1;i--)
        {
            if(nums[i]>pivot)
            {
                ind2=i;
                break;
            }
        }

        swap(ind1,ind2,nums);
        reverse(ind1+1,nums);
    }
    public static void swap(int i,int j,int nums[])
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int i,int nums[])
    {
        int left=i;
        int right=nums.length-1;

        while(left<right)
        {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
            
            left++;
            right--;
        }
    }

}
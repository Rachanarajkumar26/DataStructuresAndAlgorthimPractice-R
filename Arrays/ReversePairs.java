class Solution {
    public int reversePairs(int[] nums) {
        
        int n=nums.length;
        return mergesort(0,n-1,nums);
    }
    public static int mergesort(int low,int high,int nums[])
    {
        int cnt=0;
        if(low>=high)return cnt;
           int mid=(low+high)/2;
         cnt+=mergesort(low,mid,nums);
         cnt+=mergesort(mid+1,high,nums);
         cnt+=countpairs(low,mid,high,nums);
         merge(low,mid,high,nums);
         return cnt;

    }
    public static int countpairs(int low,int mid,int high,int nums[])
    {
        int right=mid+1;
        int cnt=0;
    for(int i=low;i<=mid;i++)
    {
        while(right<=high && (long)nums[i]>2L*nums[right])right++;
        cnt+=right-(mid+1);
    }

    return cnt;
    }

    public static void merge(int low,int mid,int high,int nums[])
    {
        int left=low,right=mid+1;
           ArrayList<Integer>temp=new ArrayList<>();
        while(left<=mid && right<=high)
        {
           if(nums[left]>=nums[right])
           {
            temp.add(nums[right]);
            right++;
           }
           else
           {
            temp.add(nums[left]);
            left++;
           }
        }

        while(left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }
    }
}
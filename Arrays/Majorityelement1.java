class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length,cnt=0,ele=-1;

        int c=n/2;

        for(int i=0;i<n;i++)
        {
           if(cnt==0)
           {
              cnt=1;
             ele=nums[i];
           }

           else if(ele==nums[i])
           {
            cnt++;
           }
           else
           {
            cnt--;
           }
        }

        return ele;
    }
}
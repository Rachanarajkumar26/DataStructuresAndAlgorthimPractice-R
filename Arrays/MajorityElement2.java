class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>ans=new ArrayList<>();
        int e1=Integer.MIN_VALUE,c1=0;
        int e2=Integer.MIN_VALUE,c2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1)
            {
                c1++;
            }
            else if(nums[i]==e2)
            {
                c2++;
            }
           else if(c1==0)
            {
                e1=nums[i];
                c1=1;
            }
            else if(c2==0)
            {
                e2=nums[i];
                c2=1;
            }
            else if(nums[i]!=e1 && nums[i]!=e2)
            {
                c1--;
                c2--;
            }
        }
        //to recheck manually whether e1 & e2 ocuurs n/3 times in array
int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1)
            {
                cnt1++;
            }
            else if(nums[i]==e2)
            {
                cnt2++;
            }

        }
        int n=nums.length;
        if(cnt1>n/3)
        {
            ans.add(e1);
        }
        if(cnt2>n/3 && e1!=e2)
        {
            ans.add(e2);
        }

        return ans;
    }
}
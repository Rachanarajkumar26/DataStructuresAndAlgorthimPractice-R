class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here 
        int n=arr.length;
        int res=0;
        Set<Integer>set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        
        for(int num:arr)
        {
            if(set.contains(num) && !set.contains(num-1))
            {
                int curr=num;
                int cnt=0;
                while(set.contains(curr))
                {
                    set.remove(curr);
                    curr++;
                    cnt++;
                }
                
                res=Math.max(res,cnt);
                
            }
        }
        
        return res;
    }
}

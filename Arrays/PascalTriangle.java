class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
        List<Integer>ans=pascal(i);
        res.add(ans);
        }
       return res;
    }
    public List<Integer> pascal(int rows)
    {
        
        List<Integer>temp=new ArrayList<>();
       
        int ans=1;
         temp.add(ans);
         for(int i=0;i<rows;i++)
         {
            ans=ans*(rows-i);
            ans=ans/(i+1);
            temp.add(ans);
         }
        
         return temp;
    }
}
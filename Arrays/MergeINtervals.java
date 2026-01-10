import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>>merge=new ArrayList<>();

        for(int interval[]:intervals)
        {
            if(merge.isEmpty() || merge.get((merge.size()-1)).get(1)<interval[0])
            {
                merge.add(Arrays.asList(interval[0],interval[1]));
            }

            else
            {
                int last=merge.size()-1;
                int maxend=Math.max(merge.get(last).get(1),interval[1]);
                merge.get(last).set(1,maxend);
            }
        }

        int ans[][]=new int[merge.size()][2];

        for(int i=0;i<merge.size();i++)
        {
            ans[i][0]=merge.get(i).get(0);
            ans[i][1]=merge.get(i).get(1);
        }

        return ans;
    }
}
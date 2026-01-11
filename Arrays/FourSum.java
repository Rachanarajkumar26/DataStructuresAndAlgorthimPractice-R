import java.util.*;
public class FourSum{
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
                if(i>0 && arr[i]==arr[i-1])continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])continue;
                int k=j+1,l=n-1;
                while(k<l)
                {
                    long sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target)
                    {
                        list.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[l])));
                       k++;
                       l--;
                       
                    while(k<l && arr[k]==arr[k-1])k++;
                    while(k<l && arr[l]==arr[l+1])l--;
                    }
                    
                    else if(sum<target)
                    k++;
                    else
                    l--;
                }
            }
        }
        
        return list;
    }
}

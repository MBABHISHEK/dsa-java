class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> ans=new ArrayList<>();  
     Arrays.sort(candidates);
     helper(0,target,candidates,ans,new ArrayList<Integer>()); 
     return ans;
    }
    public void helper(int index,int sum,int [] arr,List<List<Integer>> ans,List<Integer> list)
    {
        if(sum==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index&&arr[i]==arr[i-1])
            continue;
            if(arr[i]>sum)
            break;
            list.add(arr[i]);
            helper(i,sum-arr[i],arr,ans,list);
            list.remove(list.size()-1);
        }
    }
}

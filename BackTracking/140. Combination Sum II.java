import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, candidates, ans, new ArrayList<Integer>());
        return ans;
    }

    public void helper(int index, int sum, int[] arr, List<List<Integer>> ans, List<Integer> list) {
        if (sum == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (index == arr.length || sum < arr[index]) {
            return;
        }
        int temp = arr[index];
        list.add(arr[index]);
        helper(index + 1, sum - arr[index], arr, ans, list);
        list.remove(list.size() - 1);
        int i = index + 1;
        while (i < arr.length && arr[i] == temp) {
            i++;
        }
        helper(i, sum, arr, ans, list);
    }
}

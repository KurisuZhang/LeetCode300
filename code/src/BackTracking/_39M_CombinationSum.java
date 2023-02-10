package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _39M_CombinationSum {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int sum;
    int target;
    int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        sum = 0;
        this.target = target;
        this.candidates = candidates;    
        dfs(0);
        return result;
    }

    public void dfs(int start) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (; start < candidates.length; start++) {
            int num = candidates[start];
            path.add(num);
            sum = sum + num;
            dfs(start);
            path.remove(path.size() - 1);
            sum = sum - num;
        }
    }
}

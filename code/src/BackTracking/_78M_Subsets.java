package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _78M_Subsets {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        result.add(new ArrayList<>());
        DFS(0);
        return result;
    }

    public void DFS(int i){

        if (i == nums.length) {
            return;
        }

        for (; i < nums.length; i++) {
            path.add(nums[i]);
            result.add(new ArrayList<>(path));

            DFS(i + 1);

            path.remove(path.size() - 1);

        }
    }
}

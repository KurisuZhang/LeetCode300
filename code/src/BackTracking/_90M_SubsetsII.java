package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _90M_SubsetsII {
    HashSet<List<Integer>> hashSet = new HashSet<>();
    List<Integer> path = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        DFS(0);
        List<List<Integer>> result =new ArrayList<>(hashSet);
        result.add(new ArrayList<>());
        return result;
    }

    public void DFS(int i){

        if (i == nums.length) {
            return;
        }

        for (; i < nums.length; i++) {
            int num = nums[i];
            path.add(num);
            Collections.sort(path);
            if (!hashSet.contains(path)) {
                hashSet.add(new ArrayList<>(path));
            }

            DFS(i + 1);

            path.remove((Object) num);

        }
    }
}

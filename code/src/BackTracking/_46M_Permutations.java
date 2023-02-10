package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _46M_Permutations {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] isVisit;
    int[] nums; 
    
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.isVisit = new boolean[nums.length];
        Arrays.fill(isVisit, false);
        dfs(0);
        return result;
    }
    
    
    public void dfs(int start){
        
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (; start < nums.length; start++) {
            if (!isVisit[start]){
                int num = nums[start];
                path.add(num);
                isVisit[start] = true;
                dfs(0);
                isVisit[start] = false;
                path.remove(path.size() - 1);
            }
        }
        
    }
}

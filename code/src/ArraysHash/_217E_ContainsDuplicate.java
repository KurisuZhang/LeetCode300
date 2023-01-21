package ArraysHash;

import java.util.HashMap;
import java.util.HashSet;

public class _217E_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }

        return false;
    }
}

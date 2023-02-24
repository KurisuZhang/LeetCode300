package ArraysHash;

import java.util.HashMap;
import java.util.HashSet;

public class _1207E_UniqueNumberofOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i :
                hashMap.values()) {
            if (hashSet.contains(i)) {
                return false;
            } else {
                hashSet.add(i);
            }
        }

        return true;
    }

}

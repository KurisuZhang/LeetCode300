package Design;

import java.util.LinkedHashMap;

public class _146M_LRUCache {

    int capacity;
    LinkedHashMap<Integer, Integer> linkedHashMap;

    public _146M_LRUCache(int capacity) {
        this.capacity = capacity;
        linkedHashMap = new LinkedHashMap<>();
    }

    public int get(int key) {

        if (linkedHashMap.containsKey(key)) {
            int value = linkedHashMap.remove(key);
            linkedHashMap.put(key, value);
            return value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (linkedHashMap.containsKey(key)) {
            linkedHashMap.remove(key);
            linkedHashMap.put(key, value);
        } else {
            linkedHashMap.put(key, value);
            if (linkedHashMap.size() > capacity) {
                int theKey = linkedHashMap.keySet().iterator().next();
                linkedHashMap.remove(theKey);
            }
        }
    }


}

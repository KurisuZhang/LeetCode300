package ArraysHash;

import java.util.*;

public class _49M_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length==0 || strs.length==1){
            return new ArrayList<>(Collections.singletonList(Arrays.asList(strs)));
        }

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            if (hashMap.containsKey(key)){
                hashMap.get(key).add(s);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hashMap.put(key, list);
            }


        }

        return new ArrayList<>(hashMap.values());

    }


}

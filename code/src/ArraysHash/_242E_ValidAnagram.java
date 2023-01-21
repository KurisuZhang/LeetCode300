package ArraysHash;

import java.util.HashMap;

public class _242E_ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();


        for (char c : sChar) {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (char c : tChar) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c)-1);
                if (hashMap.get(c)==0){
                    hashMap.remove(c);
                }
            }else {
                return false;
            }
        }

        if (hashMap.size() == 0) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean a = isAnagram(s, t);
        System.out.println(a);
    }
}

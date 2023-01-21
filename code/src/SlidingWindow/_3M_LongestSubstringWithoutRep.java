package SlidingWindow;

import java.util.HashSet;

public class _3M_LongestSubstringWithoutRep {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        HashSet<Character> hashSet = new HashSet<>();
        int result = Integer.MIN_VALUE;

        for (int end = 0; end < s.length(); end++) {

            while (hashSet.contains(s.charAt(end))) {
                hashSet.remove(s.charAt(start));
                start++;
            }
            hashSet.add(s.charAt(end));
            result = Math.max(result, hashSet.size());
        }
        return s.length() == 0 ? 0 : result;
    }
}

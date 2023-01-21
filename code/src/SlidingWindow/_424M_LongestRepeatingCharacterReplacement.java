package SlidingWindow;
import java.util.HashMap;

public class _424M_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int startPoint = 0;
        int maxLength = 0;
        int maxFrequency = 0;

        for (int endPoint = 0; endPoint < s.length(); endPoint++) {

            char last = s.charAt(endPoint);
            hashMap.put(last, hashMap.getOrDefault(last, 0) + 1);

//            int maxFrequency = Collections.max(hashMap.values());

            maxFrequency = Math.max(maxFrequency,hashMap.get(last));

            while (endPoint - startPoint + 1 - maxFrequency > k) {
                char first = s.charAt(startPoint);
                hashMap.put(first, hashMap.get(first) - 1);
                startPoint++;
            }

            maxLength = Math.max(maxLength, endPoint - startPoint + 1);

        }

        return maxLength;
    }
}

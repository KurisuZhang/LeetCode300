package ArraysHash;

import java.util.HashMap;

public class _13E_RomantoInteger {
    public int romanToInt(String s) {

        HashMap<Character, int[]> hashMap = new HashMap<>();
        hashMap.put('I',new int[]{1,0});
        hashMap.put('V',new int[]{5,1});
        hashMap.put('X',new int[]{10,2});
        hashMap.put('L',new int[]{50,3});
        hashMap.put('C',new int[]{100,4});
        hashMap.put('D',new int[]{500,5});
        hashMap.put('M',new int[]{1000,6});


        char[] chars = s.toCharArray();

        int result = 0;

        result = result + hashMap.get(chars[0])[0];

        for (int i = 1; i < chars.length; i++) {

            if (hashMap.get(chars[i - 1])[1] < hashMap.get(chars[i])[1]) {
                result = result - 2 * hashMap.get(chars[i - 1])[0] + hashMap.get(chars[i])[0];
            } else {
                result = result + hashMap.get(chars[i])[0];
            }
        }


        return result;
    }
}

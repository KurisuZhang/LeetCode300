package TwoPoint;

import java.util.Arrays;
import java.util.Collections;

public class _125E_ValidPalindrome {
    public boolean isPalindrome(String s) {
        // preprocessing
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }

//        int start = 0;
//        int end = stringBuilder.length() - 1;
//
//        while (start < end) {
//            if (stringBuilder.charAt(start) == stringBuilder.charAt(end)) {
//                start++;
//                end--;
//            } else {
//                return false;
//            }
//        }
//
//        return true;

        StringBuilder stringReverse = new StringBuilder(stringBuilder).reverse();
        return stringBuilder.toString().equals(stringReverse.toString());
    }
}

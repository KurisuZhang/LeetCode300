package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class _20E_ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('{', '}');
        hashMap.put('(', ')');
        hashMap.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                deque.addLast(c);
            }else if (!deque.isEmpty() && hashMap.get(deque.removeLast())==c){
                continue;
            }else {
                return false;
            }
        }
        return deque.isEmpty();
    }
}

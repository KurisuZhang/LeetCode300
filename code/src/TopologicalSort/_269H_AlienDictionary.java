package TopologicalSort;

import java.util.*;

public class _269H_AlienDictionary {

    public static String alienOrder(String[] words) {

        // result
        List<Character> result = new ArrayList<>();
        // two hashmap
        HashMap<Character, List<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> inDegree = new HashMap<>();


        // 1.
        for (int i = 0; i < words.length; i++) {

            char[] word = words[i].toCharArray();

            for (Character c : word) {
                graph.put(c, new ArrayList<>());
                inDegree.put(c, 0);
            }
        }

        //2.
        char[] firstWord = words[0].toCharArray();

        for (int i = 1; i < words.length; i++) {

            char[] secondWord = words[i].toCharArray();
            boolean preFix = true;

            for (int j = 0; j < Math.min(firstWord.length, secondWord.length); j++) {
                if (firstWord[j] == secondWord[j]) {
                    continue;
                }
                graph.get(firstWord[j]).add(secondWord[j]);
                inDegree.put(secondWord[j], inDegree.get(secondWord[j]) + 1);
                preFix = false;
                break;
            }

            if (preFix) {
                if (firstWord.length > secondWord.length) {
                    return "";
                }
            }
            firstWord = Arrays.copyOf(secondWord, secondWord.length);

        }

        //3.
        Deque<Character> deque = new ArrayDeque<>();

        for (Character c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                deque.addLast(c);
            }
        }

        //4.
        while (!deque.isEmpty()) {
            Character c = deque.removeFirst();
            result.add(c);

            for (int i = 0; i < graph.get(c).size(); i++) {
                Character child = graph.get(c).get(i);
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    deque.addLast(child);
                }
            }
        }

        if(result.size() != graph.size()){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c :
                result) {
            stringBuilder.append(c);
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(alienOrder(new String[]{"ac","ab","zc","zb"}));
    }


}

package Tree;

import java.util.HashMap;
import java.util.Set;

public class _211M_DesignAddandSearchWords {

    private class NodeFor211 {

        public boolean isWord;
        public HashMap<Character,NodeFor211> node;

        public NodeFor211(){
            isWord = false;
            node = new HashMap<>();
        }

    }

    NodeFor211 root;
    boolean result;

    public _211M_DesignAddandSearchWords() {
        root = new NodeFor211();
    }

    public void addWord(String word) {
        NodeFor211 curr = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!curr.node.containsKey(c)) {
                curr.node.put(c, new NodeFor211());
            }

            curr = curr.node.get(c);
        }

        curr.isWord = true;
    }

    public boolean search(String word) {

        result = false;
        NodeFor211 curr = root;
        DFS(curr,word);
        return result;
    }

    public void DFS(NodeFor211 curr,String word){

        if (curr.node.isEmpty() && !word.isEmpty()) {
            return;
        }

        if (word.isEmpty()) {
            if (curr.isWord){
                result = true;
                return;
            }
        }

        char c = word.charAt(0);

        if (c == '.') {
            Set<Character> characters = curr.node.keySet();
            for (Character character : characters) {
                if (curr.node.containsKey(character)) {
                    DFS(curr.node.get(character), word.substring(1));
                } else {
                    return;
                }
            }
        } else {
            if (curr.node.containsKey(c)){
                DFS(curr.node.get(c), word.substring(1));
            }else {
                return;
            }
        }
    }


}

package Tree;

import java.util.HashMap;

public class _208M_ImplementTrie {

    private class NodeFor208{
        public boolean isWord;
        public NodeFor208[] nodeArray;

        public NodeFor208() {
            isWord = false;
            nodeArray = new NodeFor208[26];
        }
    }

    NodeFor208 root;

    public _208M_ImplementTrie() {
        root = new NodeFor208();
    }

    public void insert(String word) {

        NodeFor208 current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (current.nodeArray[c - 'a'] == null) {
                current.nodeArray[c - 'a'] = new NodeFor208();
            }
            current = current.nodeArray[c - 'a'];
        }

        current.isWord = true;

    }

    public boolean search(String word) {

        NodeFor208 cur = root;
        for(int i = 0 ; i < word.length() ; i ++){
            char c = word.charAt(i);
            if(cur.nodeArray[c-'a'] == null)
                return false;
            cur = cur.nodeArray[c-'a'];
        }
        return cur.isWord;
    }

    public boolean startsWith(String word) {

        NodeFor208 cur = root;
        for(int i = 0 ; i < word.length() ; i ++){
            char c = word.charAt(i);
            if(cur.nodeArray[c-'a'] == null)
                return false;
            cur = cur.nodeArray[c-'a'];
        }
        return true;
    }

}

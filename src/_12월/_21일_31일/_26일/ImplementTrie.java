package _12월._21일_31일._26일;

import java.util.HashMap;
import java.util.Map;

public class ImplementTrie {

    TrieNode trie ;
    public ImplementTrie() {
        trie = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = trie;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            cur.put(c,new TrieNode());
            cur = cur.get(c);
        }
        cur.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = trie;
        for(int i = 0;i<word.length();i++){
            if(node.contains(word.charAt(i))){
                node = node.get(word.charAt(i));
            }
            else{
                return false;
            }
        }
        return node.getEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = trie;
        for(int i = 0;i<prefix.length();i++){
            if(node.contains(prefix.charAt(i))){
                node = node.get(prefix.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }

    class TrieNode{
        boolean isLast;
        Map<Character,TrieNode> children;

        public TrieNode() {
            children = new HashMap<>();
        }

        public boolean contains(Character c){
            return children.containsKey(c);
        }

        public TrieNode get(Character c){
            return children.get(c);
        }

        public void put(Character c, TrieNode node){
            if(!children.containsKey(c)){
                children.put(c,node);
            }
        }

        public void setEnd(){
            isLast = true;
        }

        public boolean getEnd() {
            return isLast;
        }
    }
}

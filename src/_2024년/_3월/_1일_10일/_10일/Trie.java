package _2024년._3월._1일_10일._10일;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private TrieNode trie;

    public Trie() {
        trie = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = trie;
        for (int i = 0; i < word.length(); i++) {
            cur.put(word.charAt(i), new TrieNode());
            cur = cur.get(word.charAt(i));
        }
        cur.setLast();
    }

    public boolean search(String word) {
        TrieNode cur = trie;
        for (int i = 0; i < word.length(); i++) {
            if(cur.get(word.charAt(i)) == null){
                return false;
            }
            cur = cur.get(word.charAt(i));
        }
        return cur.isLast;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = trie;
        for (int i = 0; i < prefix.length(); i++) {
            if(cur.get(prefix.charAt(i)) == null){
                return false;
            }
            cur = cur.get(prefix.charAt(i));
        }
        return true;
    }

    class TrieNode {
        private boolean isLast;
        Map<Character, TrieNode> children = new HashMap<>();

        public void put(Character c, TrieNode node) {
            if (!children.containsKey(c)) {
                children.put(c, node);
            }
        }

        public TrieNode get(Character c) {
            return children.get(c);
        }

        public void setLast() {
            isLast = true;
        }

        public boolean isLast() {
            return isLast;
        }
    }
}

package _2023년._12월._21일_31일._27일;

import java.util.HashMap;
import java.util.Map;

public class DesignAddAndSearchWordsDataStructure {

    private TrieNode trie;

    public DesignAddAndSearchWordsDataStructure() {
        trie = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur = trie;
        for (Character c : word.toCharArray()) {
            cur.add(c);
            cur = cur.children.get(c);
        }
        cur.setEnd();
    }

    public boolean search(String word) {
        return isExist(word, 0, trie);
    }

    private boolean isExist(String word, int index, TrieNode trie) {
        if (word.length() == index) return trie.isEnd();

        if (trie.children.isEmpty()) return false;
        boolean result = false;
        if (word.charAt(index) == '.') {
            for (TrieNode value : trie.children.values()) {
                result |= isExist(word, index + 1, value);
            }
        } else {
            if (trie.children.containsKey(word.charAt(index))) {
                result = isExist(word, index + 1, trie.children.get(word.charAt(index)));
            } else {
                return false;
            }
        }
        return result;
    }

    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEnd;

        public TrieNode() {
            children = new HashMap<>();
        }

        public void add(Character c) {
            if (!children.containsKey(c)) {
                children.put(c, new TrieNode());
            }
        }

        public boolean contain(Character c) {
            return children.containsKey(c);
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void setEnd() {
            isEnd = true;
        }
    }
}

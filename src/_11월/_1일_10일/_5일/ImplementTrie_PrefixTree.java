package _11월._1일_10일._5일;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ImplementTrie_PrefixTree {

    private Set<String> set;
    public ImplementTrie_PrefixTree() {
        set = new HashSet<>();
    }

    public void insert(String word) {
        set.add(word);
    }

    public boolean search(String word) {
        return set.contains(word);
    }

    public boolean startsWith(String prefix){
        for (String s : set) {
            if(s.startsWith(prefix))return true;
        }

        return false;
    }

}

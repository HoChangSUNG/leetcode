package _7월._11일_20일._17일;

public class DesignCompressedStringIterator {
    private Node head;

    public DesignCompressedStringIterator(String compressedString) {
        head = new Node();
        Node cur = head;
        int count = 0;
        char value = compressedString.charAt(0);
        for (int i = 0; i < compressedString.length(); i++) {
            if (compressedString.charAt(i) >= '0' && compressedString.charAt(i) <= '9') {
                count = count * 10 + compressedString.charAt(i) - '0';
                if (i == compressedString.length() - 1 || (compressedString.charAt(i + 1) < '0' || compressedString.charAt(i + 1) > '9')) {
                    Node node = new Node(count, value);
                    cur.next = node;
                    cur = cur.next;
                    count = 0;
                }
            } else {
                value = compressedString.charAt(i);
            }
        }
    }

    public char next() {
        if (!hasNext()) {
            return ' ';
        }
        if (head.count == 0) {
            head = head.next;
        }
        head.count -= 1;
        return head.value;
    }

    public boolean hasNext() {
        if (head.count != 0) {
            return true;
        }
        if (head.next == null) {
            return false;
        }
        if (head.next.count != 0) return true;
        return false;
    }

    static class Node {
        private int count;
        private char value;
        private Node next;

        Node() {
        }

        Node(int count, char value) {
            this.count = count;
            this.value = value;
        }
    }
}

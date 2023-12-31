package _2023년._8월._11일_20일._18일;

public class DesignCompressedStringIterator {

    String res;
    int ptr = 0;
    int num = 0;
    char ch = ' ';

    public DesignCompressedStringIterator(String compressedString) {
        res = compressedString;
    }

    public char next() {
        if (!hasNext()) return ' ';

        if (num == 0) {
            ch = res.charAt(ptr++);
            while (ptr < res.length() && Character.isDigit(res.charAt(ptr))) {
                num = 10 * num + res.charAt(ptr++) - '0';
            }
        }
        num--;
        return ch;
    }

    public boolean hasNext() {
        return ptr != res.length() || num != 0;
    }
}

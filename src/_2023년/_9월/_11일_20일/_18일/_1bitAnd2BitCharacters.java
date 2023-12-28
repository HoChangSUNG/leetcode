package _2023년._9월._11일_20일._18일;

public class _1bitAnd2BitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;
        for (; i < n - 1; ) {
            if (bits[i] == 1) i += 2;
            else i++;
        }
        return i == n ? false : true;
    }
}

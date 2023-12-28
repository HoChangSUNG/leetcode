package _2023년._7월._11일_20일._20일;

public class _1_BitAnd2_BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) return true;
        for (int i = 0; i < bits.length; ) {
            if (i == bits.length - 1) return true;
            if (bits[i] == 0) i++;
            else i += 2;
        }
        return false;
    }
}

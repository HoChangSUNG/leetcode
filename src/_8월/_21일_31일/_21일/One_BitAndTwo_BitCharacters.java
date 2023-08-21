package _8월._21일_31일._21일;

public class One_BitAndTwo_BitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length) {
            if (bits[i] == 1) {
                if (i + 2 == bits.length) return false;
                i += 2;
            } else {
                i++;
            }
        }
        return true;
    }
}

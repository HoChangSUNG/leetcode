package _8월._21일_31일._27일;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) five++;
            else if (bills[i] == 10) ten++;

            int change = bills[i] - 5;
            if (change == 5) {
                if (five == 0) return false;
                five--;
            } else if (change == 10) {
                if (ten > 0) {
                    ten--;
                    continue;
                }
                if (five > 1) {
                    five -= 2;
                    continue;
                }
                return false;
            } else if (change == 15) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                    continue;
                }
                if (five > 2) {
                    five -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}

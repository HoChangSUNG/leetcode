package _9월._21일_30일._23일;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) five++;
            else if (bills[i] == 10) {
                five--;
                ten++;
            } else {
                five--;
                if (ten > 0) ten--;
                else {
                    five -= 2;
                }
            }
            if (five < 0 || ten < 0) return false;
        }
        return true;
    }
}

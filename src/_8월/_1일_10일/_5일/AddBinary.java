package _8월._1일_10일._5일;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0 && j >= 0) {
                sum = a.charAt(i--) - '0' + b.charAt(j--) - '0' + carry;
            } else if (i >= 0) {
                sum = a.charAt(i--) - '0' + carry;
            } else if (j >= 0) {
                sum = b.charAt(j--) - '0' + carry;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) sb.append(1);
        return sb.reverse().toString();
    }
}

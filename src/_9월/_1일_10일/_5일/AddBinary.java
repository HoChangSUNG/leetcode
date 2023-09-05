package _9월._1일_10일._5일;

public class AddBinary {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0 && j >= 0) {
                sum += a.charAt(i--) - '0' + b.charAt(j--) - '0';
            } else if (i >= 0) {
                sum += a.charAt(i--) - '0';
            } else {
                sum += b.charAt(j--) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;

        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}

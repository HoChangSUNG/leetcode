package _2023년._9월._21일_30일._26일;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        for (String email : emails) {
            String[] temp = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp[0].length(); i++) {
                if (temp[0].charAt(i) == '+') break;
                else if (temp[0].charAt(i) == '.') continue;
                else sb.append(temp[0].charAt(i));
            }
            sb.append("@");
            sb.append(temp[1]);
            result.add(sb.toString());
            System.out.println(sb.toString());
        }
        return result.size();
    }
}

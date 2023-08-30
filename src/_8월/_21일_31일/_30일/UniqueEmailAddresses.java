package _8월._21일_31일._30일;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] full = emails[i].split("@");
            for (int j = 0; j < full[0].length(); j++) {
                char local = full[0].charAt(j);
                if (local == '.') continue;
                else if (local == '+') break;
                sb.append(local);
            }

            sb.append("@");
            sb.append(full[1]);
            res.add(sb.toString());
        }
        return res.size();
    }
}

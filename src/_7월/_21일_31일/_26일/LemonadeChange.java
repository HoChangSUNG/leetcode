package _7월._21일_31일._26일;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        for (int i = 0; i < bills.length; i++) {
            map.put(bills[i], map.get(bills[i]) + 1);
            int change = bills[i] - 5;
            if (change == 15) {
                if ((map.get(10) > 0 && map.get(5) > 0) || map.get(5) > 2) {
                    if (map.get(10) > 0 && map.get(5) > 0) {
                        map.put(10, map.get(10) - 1);
                        map.put(5, map.get(5) - 1);
                    } else {
                        map.put(5, map.get(5) - 3);
                    }
                } else return false;
            } else if (change == 5) {
                if (map.get(5) > 0) {
                    map.put(5, map.get(5) - 1);
                } else return false;
            }
        }
        return true;
    }
}

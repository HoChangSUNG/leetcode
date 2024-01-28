package _2024년._1월._21일_31일._28일;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = 0;
        int total = 0;
        int cur = 0;
        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            cur += (gas[i] - cost[i]);
            if (cur < 0) {
                cur = 0;
                result = i + 1;
            }
        }
        return total >= 0 ? result : -1;
    }
}

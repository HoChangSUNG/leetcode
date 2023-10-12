package _10월._11일_20일._12일;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curGain = 0, totalGain = 0, answer = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGain += (gas[i] - cost[i]);
            curGain += (gas[i] - cost[i]);

            if (curGain < 0) {
                curGain = 0;
                answer = i + 1;
            }
        }
        return totalGain >= 0 ? answer : -1;
    }
}
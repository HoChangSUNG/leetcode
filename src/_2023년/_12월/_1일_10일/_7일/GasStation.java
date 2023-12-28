package _2023년._12월._1일_10일._7일;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGain = 0, totalGain = 0, answer = 0;

        for (int i = 0; i < gas.length; i++) {
            currGain += (gas[i] - cost[i]);
            totalGain += (gas[i] - cost[i]);
            if (currGain < 0) {
                currGain = 0;
                answer = i + 1;
            }
        }

        return totalGain >= 0 ? answer : -1;
    }
}

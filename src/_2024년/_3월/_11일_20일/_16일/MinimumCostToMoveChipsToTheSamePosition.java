package _2024년._3월._11일_20일._16일;

public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
}

package _2024년._1월._21일_31일._27일;

public class ZigzagConversion {
    private int[] dIndex = new int[]{1, -1};

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int index = 0;
        int row = 0;
        int dir = 1;

        StringBuilder[] sbList = new StringBuilder[numRows];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            sbList[i] = new StringBuilder();
        }

        while (index < s.length()) {
            sbList[row].append(s.charAt(index));
            if (row == numRows - 1 || row == 0) {
                dir = (dir + 1) % 2;
            }
            row += dIndex[dir];
            index++;
        }
        for (int i = 0; i < numRows; i++) {
            result.append(sbList[i].toString());
        }
        return result.toString();
    }
}

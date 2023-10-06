package _10월._1일_10일._6일;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) list.add(new Node(i, j));
            }
        }

        for (Node node : list) {
            for (int i = 0; i < n; i++) {
                matrix[i][node.col] = 0;
            }
            for (int j = 0; j < m; j++) {
                matrix[node.row][j] = 0;
            }
        }
    }

    static class Node {
        int row;
        int col;

        Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}

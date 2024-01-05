package _2024년._1월._1일_10일._5일;

public class ConstructQuadTree {
    public Node construct(int[][] grid) {
        return divideTree(grid, 0, 0, grid.length);
    }

    private Node divideTree(int[][] grid, int r, int c, int n) {
        if (n == 1) return new Node(grid[r][c] == 1, true);

        Node topLeft = divideTree(grid, r, c, n / 2);
        Node topRight = divideTree(grid, r, c + n / 2, n / 2);
        Node bottomLeft = divideTree(grid, r + n / 2, c, n / 2);
        Node bottomRight = divideTree(grid, r + n / 2, c + n / 2, n / 2);

        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            return new Node(topLeft.val, true);
        }

        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    ;
}


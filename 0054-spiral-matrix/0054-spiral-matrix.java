class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            //top 
            for (int i = startCol; i <=endCol; i++) {
                spiral.add(matrix[startRow][i]);
            }
            //right
            for (int i = startRow + 1; i <=endRow; i++) {
                spiral.add(matrix[i][endCol]);
            }
            //bottom
            for (int i = endCol-1; i >=startCol; i--) {
                if (startRow < endRow) {
                spiral.add(matrix[endRow][i]);
                }
            }
            //left
            for (int i = endRow-1; i >=startRow+1; i--) {
                if (startCol < endCol) {
                spiral.add(matrix[i][startCol]);
                }
            }
            startRow ++;
            endRow --;
            startCol++;
            endCol--;
        }
        return spiral;
    }
}
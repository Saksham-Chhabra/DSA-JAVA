class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // so lets take a starting point 
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col <= matrix[0].length-1) {
            if (target == matrix[row][col]) return true;
            else if (target > matrix[row][col]) col++;
            else row--;
        }
        return false;
    }
}
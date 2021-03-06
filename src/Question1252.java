/**
 * https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1252 {

    public int oddCells(int n, int m, int[][] indices) {

        int[][] matrix = new int[n][m];

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++) {
                matrix[indices[i][0]][j]++;
            }
            for (int j = 0; j < n; j++) {
                matrix[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
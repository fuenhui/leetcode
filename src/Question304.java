/**
 * https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question304 {

    int[][] matrix;

    public Question304(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = 0;

        for (int i = 0; i < row2 - row1 + 1; i++) {
            for (int j = 0; j < col2 - col1 + 1; j++) {
                sum += matrix[i + row1][j + col1];
            }
        }

        return sum;
    }
}

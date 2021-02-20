/**
 * https://leetcode-cn.com/problems/matrix-diagonal-sum/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

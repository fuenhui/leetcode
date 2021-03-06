/**
 * https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1351 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            if (grid[i][grid[i].length - 1] >= 0) {
                break;
            }
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
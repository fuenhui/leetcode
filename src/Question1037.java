/**
 * https://leetcode-cn.com/problems/valid-boomerang/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question1037 {

    public boolean isBoomerang(int[][] points) {

        if ((points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) - (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
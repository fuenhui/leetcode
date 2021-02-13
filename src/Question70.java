/**
 * https://leetcode-cn.com/problems/climbing-stairs/submissions/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question70 {

    public int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

/**
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1672 {

    public int maximumWealth(int[][] accounts) {

        int max = -9999;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}

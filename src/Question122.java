/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question122 {

    public int maxProfit(int[] prices) {

        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[j - 1]) {
                    result += prices[j - 1] - prices[i];
                    i = j - 1;
                    break;
                }
                if (j == prices.length - 1) {
                    result += prices[j] - prices[i];
                    return result;
                }
            }
        }

        return result;
    }
}
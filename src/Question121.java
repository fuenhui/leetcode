/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question121 {

    public int maxProfit(int[] prices) {

        int[] min = new int[prices.length];
        int[] max = new int[prices.length];

        int minv = 9999999;
        int mini = 0;
        int maxv = -9999999;
        int maxi = 0;

        int result = -1;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minv) {
                minv = prices[i];
                mini = i;
            }

            if (prices[i] > maxv) {
                maxv = prices[i];
                maxi = i;
            }

            min[i] = mini;
            max[i] = maxi;
        }

        for (int i = 0; i < prices.length; i++) {
            if (max[i] - min[i] >= 0) {
                if (prices[max[i]] - prices[min[i]] > result) {
                    result = prices[max[i]] - prices[min[i]];
                }
            }
            if (prices[i] - prices[min[i]] > result) {
                result = prices[i] - prices[min[i]];
            }
        }

        return result;
    }
}

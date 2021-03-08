/**
 * https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question1475 {

    public int[] finalPrices(int[] prices) {

        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int flag = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result[i] = prices[i];
            }
        }
        return result;
    }
}

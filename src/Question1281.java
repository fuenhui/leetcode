/**
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1281 {

    public int subtractProductAndSum(int n) {

        String s = "" + n;

        int product = 1;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            product *= s.charAt(i) - '0';
            sum += s.charAt(i) - '0';
        }
        return product - sum;
    }
}
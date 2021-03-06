/**
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question172 {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}

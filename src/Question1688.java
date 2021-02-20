/**
 * https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1688 {

    public int numberOfMatches(int n) {

        int count = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                count += n / 2;
                n = n / 2;
            } else {
                count += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return count;
    }
}

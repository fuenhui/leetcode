/**
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1295 {

    public int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = "" + nums[i];
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

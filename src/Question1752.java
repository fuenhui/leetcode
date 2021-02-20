/**
 * https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1752 {

    public boolean check(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count == 0 || count == 1;
    }
}

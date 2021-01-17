/**
 * https://leetcode-cn.com/problems/shuffle-the-array/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1470 {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2) {
                result[2 * i] = nums[i];
            } else {
                result[2 * (i - nums.length / 2) + 1] = nums[i];
            }
        }

        return result;
    }
}
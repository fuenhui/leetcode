/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question1 {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

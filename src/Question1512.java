/**
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1512 {

    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        return count;
    }
}

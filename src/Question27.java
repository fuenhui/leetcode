/**
 * https://leetcode-cn.com/problems/remove-element/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question27 {

    public int removeElement(int[] nums, int val) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}

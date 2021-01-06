/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question26 {

    public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return ++j;
    }
}
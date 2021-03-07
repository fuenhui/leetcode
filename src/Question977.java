import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question977 {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}

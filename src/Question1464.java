/**
 * https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1464 {

    public int maxProduct(int[] nums) {

        int max = (nums[0] - 1) * (nums[1] - 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    max = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return max;
    }
}

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question53 {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        double max = -99999999999999999999999.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) max;
    }
}

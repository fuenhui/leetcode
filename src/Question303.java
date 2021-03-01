/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 *
 * @author fuenhui
 * @date 2021/03/01
 */
public class Question303 {

    int[] nums;

    public Question303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;

        for (int k = i; k <= j ; k++) {
            sum += nums[k];
        }

        return sum;
    }
}

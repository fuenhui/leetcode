import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/array-partition-i/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question561 {

    public int arrayPairSum(int[] nums) {

        int[] n = Arrays.stream(nums).sorted().toArray();
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                sum += n[i];
            }
        }
        return sum;
    }
}

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/sum-of-unique-elements/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1748 {

    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                sum += integer;
            }
        }

        return sum;
    }
}

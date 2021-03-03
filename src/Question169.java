import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/majority-element/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question169 {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = map.get(nums[0]);
        int maxi = nums[0];

        for (Integer integer : map.keySet()) {
            if (map.get(integer) > max) {
                max = map.get(integer);
                maxi = integer;
            }
        }

        return maxi;
    }
}

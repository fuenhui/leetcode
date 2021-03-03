import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/single-number/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question136 {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                return integer;
            }
        }

        return 0;
    }
}

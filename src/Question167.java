import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question167 {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{i + 1, map.get(target - numbers[i]) + 1};
            }
        }

        return new int[]{};
    }
}

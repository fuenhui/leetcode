import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/unique-number-of-occurrences/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer value : map.values()) {
            if (map1.containsKey(value)) {
                return false;
            } else {
                map1.put(value, 1);
            }
        }
        return true;
    }
}

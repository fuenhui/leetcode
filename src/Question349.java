import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *
 * @author fuenhui
 * @date 2021/03/07
 */
public class Question349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], 1);
        }
        for (Integer integer : map1.keySet()) {
            if (map3.containsKey(integer)) {
                map3.put(integer, map3.get(integer) + 1);
            } else {
                map3.put(integer, 1);
            }
        }
        for (Integer integer : map2.keySet()) {
            if (map3.containsKey(integer)) {
                map3.put(integer, map3.get(integer) + 1);
            } else {
                map3.put(integer, 1);
            }
        }
        for (Integer integer : map3.keySet()) {
            if (map3.get(integer) == 2) {
                result.add(integer);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

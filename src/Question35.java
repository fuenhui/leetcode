import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question35 {

    public int searchInsert(int[] nums, int target) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (list.contains(target)) {
            return list.indexOf(target);
        } else {
            list.add(target);
            Collections.sort(list);
            return list.indexOf(target);
        }
    }
}

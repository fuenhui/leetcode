import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1389 {

    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
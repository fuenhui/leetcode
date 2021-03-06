import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/next-greater-element-ii/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question503 {

    public int[] nextGreaterElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[(i + j) % nums.length] > nums[i]) {
                    list.add(nums[(i + j) % nums.length]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

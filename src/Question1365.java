import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }

        temp = temp.stream().sorted().collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(temp.indexOf(nums[i]));
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

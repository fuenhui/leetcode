import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1313 {

    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}

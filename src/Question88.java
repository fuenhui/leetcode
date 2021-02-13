import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        int[] result = list.stream().sorted().mapToInt(i -> i).toArray();
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }
}

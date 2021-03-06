import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        int[] a = Arrays.stream(target).sorted().toArray();
        int[] b = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
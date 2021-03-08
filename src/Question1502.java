import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 *
 * @author fuenhui
 * @date 2021/03/08
 */
public class Question1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        int cut = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != cut) {
                return false;
            }
        }
        return true;
    }
}

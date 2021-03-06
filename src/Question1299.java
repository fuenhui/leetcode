/**
 * https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1299 {

    public int[] replaceElements(int[] arr) {

        int[] max = new int[arr.length];
        int m = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > m) {
                m = arr[i];
            }
            max[i] = m;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = max[i + 1];
        }
        result[result.length - 1] = -1;
        return result;
    }
}

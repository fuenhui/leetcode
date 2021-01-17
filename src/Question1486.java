/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1486 {

    public int xorOperation(int n, int start) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }

        int result;
        if (n == 1) {
            return start;
        } else {
            result = arr[0] ^ arr[1];
            for (int i = 2; i < n; i++) {
                result = result ^ arr[i];
            }
        }
        return result;
    }
}

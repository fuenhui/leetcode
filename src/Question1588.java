/**
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1588 {

    public int sumOddLengthSubarrays(int[] arr) {

        int length = arr.length;
        if (length % 2 == 0) {
            length--;
        }

        int now = 1;
        int sum = 0;

        while (now <= length) {
            for (int i = 0; i < arr.length - now + 1; i++) {
                for (int j = 0; j < now; j++) {
                    sum += arr[i + j];
                }
            }
            now = now + 2;
        }
        return sum;
    }
}

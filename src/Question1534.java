/**
 * https://leetcode-cn.com/problems/count-good-triplets/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question1534 {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}

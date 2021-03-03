/**
 * https://leetcode-cn.com/problems/container-with-most-water/comments/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question136 {

    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int max = -1;

        while (i != j) {

            int min = Math.min(height[i], height[j]);

            if ((j - i) * min > max) {
                max = (j - i) * min;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}

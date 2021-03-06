import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/height-checker/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1051 {

    public int heightChecker(int[] heights) {
        int[] target = Arrays.stream(heights).sorted().toArray();
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != target[i]) {
                count++;
            }
        }
        return count;
    }
}
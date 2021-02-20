/**
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 *
 * @author fuenhui
 * @date 2021/02/20
 */
public class Question1342 {

    public int numberOfSteps(int num) {

        int step = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                step++;
            } else {
                num--;
                step++;
            }
        }
        return step;
    }
}

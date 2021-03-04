/**
 * https://leetcode-cn.com/problems/robot-return-to-origin/
 *
 * @author fuenhui
 * @date 2021/03/04
 */
public class Question657 {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'U') {
                y = y + 1;
            } else if (moves.charAt(i) == 'D') {
                y = y - 1;
            } else if (moves.charAt(i) == 'L') {
                x = x - 1;
            } else {
                x = x + 1;
            }
        }

        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * https://leetcode-cn.com/problems/maximum-69-number/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1323 {

    public int maximum69Number(int num) {
        int max = num;
        StringBuilder sb = new StringBuilder("" + num);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
            } else {
                sb.setCharAt(i, '6');
            }
            if (Integer.parseInt(sb.toString()) > max) {
                max = Integer.parseInt(sb.toString());
            }
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
            } else {
                sb.setCharAt(i, '6');
            }
        }
        return max;
    }
}

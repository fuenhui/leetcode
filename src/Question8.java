/**
 * https://leetcode-cn.com/problems/string-to-integer-atoi/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question8 {

    public int myAtoi(String s) {

        int flag = 0;
        int sign = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                if (flag != 0) {
                    break;
                }
            } else if (s.charAt(i) == '+') {
                if (flag == 0) {
                    sign = 1;
                    flag = 1;
                } else {
                    break;
                }
            } else if (s.charAt(i) == '-') {
                if (flag == 0) {
                    sign = 0;
                    flag = 1;
                } else {
                    break;
                }
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                flag = 1;
                sb.append(s.charAt(i));
            } else {
                break;
            }
        }

        if (sb.toString().length() == 0) {
            return 0;
        }

        double result = Double.parseDouble(sb.toString());

        if (sign == 0) {
            result = -result;
        }

        if (result < -1 * Math.pow(2, 31)) {
            return -2147483648;
        } else if (result > Math.pow(2, 31) - 1) {
            return 2147483647;
        } else {
            return (int) result;
        }
    }
}

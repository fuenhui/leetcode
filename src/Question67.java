/**
 * https://leetcode-cn.com/problems/add-binary/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question67 {

    public String addBinary(String a, String b) {

        if ("0".equals(a) && "0".equals(b)) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                sb.append("0");
            }
            sb.append(b);
            b = sb.toString();
        } else {
            for (int i = 0; i < b.length() - a.length(); i++) {
                sb.append("0");
            }
            sb.append(a);
            a = sb.toString();
        }

        sb = new StringBuilder();

        int temp = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (temp == 0) {
                    temp = 1;
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                sb.append("" + temp);
                temp = 0;
            } else {
                if (temp == 0) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }

        if (temp == 1) {
            sb.append("" + temp);
        }

        return sb.reverse().toString();
    }
}

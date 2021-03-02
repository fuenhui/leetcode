/**
 * https://leetcode-cn.com/problems/zigzag-conversion/
 *
 * @author fuenhui
 * @date 2021/03/02
 */
public class Question6 {

    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int flag = 0;
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            sb[k].append(s.charAt(i));

            if (flag == 0) {
                if (k == numRows - 1) {
                    flag = 1;
                    k--;
                } else {
                    k++;
                }
            } else {
                if (k == 0) {
                    flag = 0;
                    k++;
                } else {
                    k--;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(sb[i]);
        }

        return result.toString();
    }
}
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/count-and-say/
 *
 * @author fuenhui
 * @date 2021/01/07
 */
public class Question38 {


    static List<String> list = new ArrayList<>();

    static {

        for (int i = 1; i <= 30; i++) {
            if (i == 1) {
                String s = "1";
                list.add(s);
            } else {
                String k = list.get(i - 2);
                char[] ks = k.toCharArray();
                char flag = ks[0];
                int count = 0;
                StringBuilder result = new StringBuilder();
                for (int j = 0; j < ks.length; j++) {
                    if (ks[j] == flag) {
                        if (j != ks.length - 1) {
                            count++;
                        } else {
                            count++;
                            result.append("" + count + "" + flag);
                        }
                    } else {
                        result.append("" + count + "" + flag);
                        if (j != ks.length - 1) {
                            flag = ks[j];
                            count = 1;
                        } else {
                            result.append("" + 1 + "" + ks[j]);
                        }
                    }
                }
                list.add(result.toString());
            }
        }
    }

    public String countAndSay(int n) {
        return list.get(n - 1);
    }

}

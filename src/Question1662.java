/**
 * https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 *
 * @author fuenhui
 * @date 2021/02/13
 */
public class Question1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
}

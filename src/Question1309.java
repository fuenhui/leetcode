/**
 * https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 *
 * @author fuenhui
 * @date 2021/03/06
 */
public class Question1309 {

    public String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String tmp = s.substring(i, i + 2);
                if ("10".equals(tmp)) {
                    sb.append("j");
                } else if ("11".equals(tmp)) {
                    sb.append("k");
                } else if ("12".equals(tmp)) {
                    sb.append("l");
                } else if ("13".equals(tmp)) {
                    sb.append("m");
                } else if ("14".equals(tmp)) {
                    sb.append("n");
                } else if ("15".equals(tmp)) {
                    sb.append("o");
                } else if ("16".equals(tmp)) {
                    sb.append("p");
                } else if ("17".equals(tmp)) {
                    sb.append("q");
                } else if ("18".equals(tmp)) {
                    sb.append("r");
                } else if ("19".equals(tmp)) {
                    sb.append("s");
                } else if ("20".equals(tmp)) {
                    sb.append("t");
                } else if ("21".equals(tmp)) {
                    sb.append("u");
                } else if ("22".equals(tmp)) {
                    sb.append("v");
                } else if ("23".equals(tmp)) {
                    sb.append("w");
                } else if ("24".equals(tmp)) {
                    sb.append("x");
                } else if ("25".equals(tmp)) {
                    sb.append("y");
                } else {
                    sb.append("z");
                }
                i = i + 2;
            } else {
                if (s.charAt(i) == '1') {
                    sb.append("a");
                } else if (s.charAt(i) == '2') {
                    sb.append("b");
                } else if (s.charAt(i) == '3') {
                    sb.append("c");
                } else if (s.charAt(i) == '4') {
                    sb.append("d");
                } else if (s.charAt(i) == '5') {
                    sb.append("e");
                } else if (s.charAt(i) == '6') {
                    sb.append("f");
                } else if (s.charAt(i) == '7') {
                    sb.append("g");
                } else if (s.charAt(i) == '8') {
                    sb.append("h");
                } else {
                    sb.append("i");
                }
            }
        }

        return sb.toString();
    }
}

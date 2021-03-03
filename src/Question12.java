/**
 * https://leetcode-cn.com/problems/integer-to-roman/
 *
 * @author fuenhui
 * @date 2021/03/03
 */
public class Question12 {

    public String intToRoman(int num) {

        String s = "" + num;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.length() - i == 1) {

                if (s.charAt(i) == '1') {
                    sb.append("I");
                } else if (s.charAt(i) == '2') {
                    sb.append("II");
                } else if (s.charAt(i) == '3') {
                    sb.append("III");
                } else if (s.charAt(i) == '4') {
                    sb.append("IV");
                } else if (s.charAt(i) == '5') {
                    sb.append("V");
                } else if (s.charAt(i) == '6') {
                    sb.append("VI");
                } else if (s.charAt(i) == '7') {
                    sb.append("VII");
                } else if (s.charAt(i) == '8') {
                    sb.append("VIII");
                } else if (s.charAt(i) == '9') {
                    sb.append("IX");
                }
            } else if (s.length() - i == 2) {

                if (s.charAt(i) == '1') {
                    sb.append("X");
                } else if (s.charAt(i) == '2') {
                    sb.append("XX");
                } else if (s.charAt(i) == '3') {
                    sb.append("XXX");
                } else if (s.charAt(i) == '4') {
                    sb.append("XL");
                } else if (s.charAt(i) == '5') {
                    sb.append("L");
                } else if (s.charAt(i) == '6') {
                    sb.append("LX");
                } else if (s.charAt(i) == '7') {
                    sb.append("LXX");
                } else if (s.charAt(i) == '8') {
                    sb.append("LXXX");
                } else if (s.charAt(i) == '9') {
                    sb.append("XC");
                }
            } else if (s.length() - i == 3) {

                if (s.charAt(i) == '1') {
                    sb.append("C");
                } else if (s.charAt(i) == '2') {
                    sb.append("CC");
                } else if (s.charAt(i) == '3') {
                    sb.append("CCC");
                } else if (s.charAt(i) == '4') {
                    sb.append("CD");
                } else if (s.charAt(i) == '5') {
                    sb.append("D");
                } else if (s.charAt(i) == '6') {
                    sb.append("DC");
                } else if (s.charAt(i) == '7') {
                    sb.append("DCC");
                } else if (s.charAt(i) == '8') {
                    sb.append("DCCC");
                } else if (s.charAt(i) == '9') {
                    sb.append("CM");
                }
            } else {

                if (s.charAt(i) == '1') {
                    sb.append("M");
                } else if (s.charAt(i) == '2') {
                    sb.append("MM");
                } else if (s.charAt(i) == '3') {
                    sb.append("MMM");
                }
            }
        }
        return sb.toString();
    }
}

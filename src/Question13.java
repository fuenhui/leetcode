/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 *
 * @author fuenhui
 * @date 2021/01/06
 */
public class Question13 {

    public int romanToInt(String s) {

        int result = 0;

        char[] chars = s.toCharArray();

        int i = 0;

        while (i != chars.length) {
            //不是最后一位
            if (i != chars.length - 1) {
                switch (chars[i]) {
                    case 'I': {
                        if (chars[i + 1] == 'V') {
                            result += 4;
                            i += 2;
                        } else if (chars[i + 1] == 'X') {
                            result += 9;
                            i += 2;
                        } else {
                            result += 1;
                            i++;
                        }
                        break;
                    }
                    case 'V': {
                        result += 5;
                        i++;
                        break;
                    }
                    case 'X': {
                        if (chars[i + 1] == 'L') {
                            result += 40;
                            i += 2;
                        } else if (chars[i + 1] == 'C') {
                            result += 90;
                            i += 2;
                        } else {
                            result += 10;
                            i++;
                        }
                        break;
                    }
                    case 'L': {
                        result += 50;
                        i++;
                        break;
                    }
                    case 'C': {
                        if (chars[i + 1] == 'D') {
                            result += 400;
                            i += 2;
                        } else if (chars[i + 1] == 'M') {
                            result += 900;
                            i += 2;
                        } else {
                            result += 100;
                            i++;
                        }
                        break;
                    }
                    case 'D': {
                        result += 500;
                        i++;
                        break;
                    }
                    case 'M': {
                        result += 1000;
                        i++;
                        break;
                    }
                }
            } else {
                switch (chars[i]) {
                    case 'I': {
                        result += 1;
                        break;
                    }
                    case 'V': {
                        result += 5;
                        break;
                    }
                    case 'X': {
                        result += 10;
                        break;
                    }
                    case 'L': {
                        result += 50;
                        break;
                    }
                    case 'C': {
                        result += 100;
                        break;
                    }
                    case 'D': {
                        result += 500;
                        break;
                    }
                    case 'M': {
                        result += 1000;
                        break;
                    }
                }
                i++;
            }
        }

        return result;
    }
}

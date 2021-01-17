/**
 * https://leetcode-cn.com/problems/goal-parser-interpretation/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1678 {

    public String interpret(String command) {

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}

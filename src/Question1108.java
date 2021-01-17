/**
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 *
 * @author fuenhui
 * @date 2021/01/17
 */
public class Question1108 {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

/**
 * https://leetcode-cn.com/problems/design-parking-system/
 *
 * @author fuenhui
 * @date 2021/02/05
 */
public class Question1603 {

    int big;
    int medium;
    int small;

    public Question1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big >= 1) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium >= 1) {
                medium--;
                return true;
            }
        } else {
            if (small >= 1) {
                small--;
                return true;
            }
        }
        return false;
    }
}

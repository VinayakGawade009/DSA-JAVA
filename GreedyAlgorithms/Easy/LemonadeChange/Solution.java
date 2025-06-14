// https://leetcode.com/problems/lemonade-change/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 10) {
                if(count5 > 0) {
                    count5--;
                } else {
                    return false;
                }
                count10++;
            } else if(bills[i] == 20) {
                if(count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                } else if(count5 > 2) {
                    count5 -= 3;
                } else {
                    return false;
                }
            } else {
                count5++;
            }
        }
        return true;
    }
}
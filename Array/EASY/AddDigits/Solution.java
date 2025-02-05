class Solution {
    public int addDigits(int num) {
        if(num/10 == 0) {
            return num;
        }

        int finalSum = addDigits(num/10) + (num%10);

        if(finalSum / 10 == 0) {
            return finalSum;
        } else {
            return addDigits(finalSum);
        }
    }
}
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int xcopy = x;
        while(x != 0) {
            int lastNumber = x % 10;
            sum += lastNumber;
            x /= 10;
        }

        if (xcopy % sum == 0) {
            return sum;
        }
        return -1;
    }
}
class Solution {
    public int addDigits(int num) {
        // int sum = 0;
        // if(num>0){
           
        //     int l = num/10;
        //     int r = num%10;
        //     sum = l + r;
        // }
        // return sum;  suitable for the single digit sum 
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}
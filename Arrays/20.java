class Solution {
    static int evenlyDivides(int n) {
        int result = 0;
        int original = n; 

        while (n > 0) {
            int rem = n % 10; 
            if (rem != 0 && original % rem == 0) {
                result++;
            }
            n /= 10; 
        }

        return result;
    }
}

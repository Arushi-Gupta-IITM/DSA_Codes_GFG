// User function Template for Java

class Solution {
    // complete the function
    public static int sumOfDigits(int n) {
        // add your code here
        int temp = n;
        int sum = 0;
        
        while(temp != 0) {
            sum += temp%10;
            temp = temp/10;
        }
        
        return sum;
    }
}

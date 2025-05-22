// User function Template for Java
class Solution {
    static int sumOfDigits(int n) {
        // code here
        int ans = 0;
        
        while(n != 0) {
            ans += n%10;
            n = n/10;
        }
        
        return ans;
    }
}

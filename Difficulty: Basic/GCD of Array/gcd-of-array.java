// User function Template for Java

class Solution {
    public static int gcdUtil(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        while(min != 0) {
            int temp = min;
            min = max%min;
            max = temp;
        }
        
        return max;
    }
    public int gcd(int n, int arr[]) {
        // code here.
        int ans = arr[0];
        
        for(int i=1; i<n; i++) {
            ans = gcdUtil(ans, arr[i]);
        }
        
        return ans;
    }
}
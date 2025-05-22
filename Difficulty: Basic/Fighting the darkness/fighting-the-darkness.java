// User function Template for Java

class Solution {
    long maxDays(int arr[]) {
        // code here
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            max = Math.max(arr[i], max);
        }
        
        return max;
    }
}
// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        int n = arr1.length;
        int m = arr2.length;
        
        for(int i=0; i<n; i++) {
            max1 = Math.max(max1, arr1[i]);
        }
        
         for(int i=0; i<m; i++) {
            min2 = Math.min(min2, arr2[i]);
        }
        
        return max1 * min2;
    }
}
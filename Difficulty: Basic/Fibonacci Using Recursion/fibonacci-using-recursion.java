class Solution {
    static int fibonacci(int n) {
        // Code here
        if(n == 0 || n == 1) return n;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

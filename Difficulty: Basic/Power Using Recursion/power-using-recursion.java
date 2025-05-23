// User function Template for Java

class Solution {
    static int RecursivePower(int n, int p) {
        // add your code here
        if(p == 0) return 1;
        return n * RecursivePower(n, p-1);
    }
}

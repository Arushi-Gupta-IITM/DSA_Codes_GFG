// User function Template for Java
class Solution {
    static void printTillN(int N) {
        // code here
        if(N == 1) {
            System.out.print("1 ");
            return;
        }
        
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
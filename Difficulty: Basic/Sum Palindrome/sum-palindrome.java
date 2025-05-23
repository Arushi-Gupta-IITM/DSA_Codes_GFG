// User function Template for Java
class Solution {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int num =0;
        
        while(temp != 0) {
            num = num*10 + (temp%10);
            temp = temp/10;
        }
        
        return num == n;
    }
    static int isSumPalindrome(int n) {
        // code here
        int temp;
        int num;
        if(isPalindrome(n)) return n;
        for(int i=0; i<5; i++) {
            temp = n;
            num = 0;
            while(temp != 0) {
                num = num*10 + (temp%10);
                temp = temp/10;
            }
            
            if(isPalindrome(num+n)) return num+n;
            else {
                n = num + n;
            }
        }
        
        return -1;
    }
}
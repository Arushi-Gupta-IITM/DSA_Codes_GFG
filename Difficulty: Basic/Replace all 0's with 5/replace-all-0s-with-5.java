/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
        // add code here.
        int num = 0;
        
        while(n != 0) {
            int last = n%10;
            if(last == 0) last = 5;
            num = num*10 + last;
            n = n/10;
        }
        
        int ans = 0;
        
        while(num != 0) {
            int last = num%10;
            ans = ans*10 + last;
            num = num/10;
        }
        return ans;
    }
}
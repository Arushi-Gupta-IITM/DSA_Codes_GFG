// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
         int n = fine.length;
           int ans = 0;
           
        if(date%2 == 0) {
            
            for(int i=0; i<n; i++) {
                if(car[i]%2 != 0) ans += fine[i];
            }
            
        } else {
            
             for(int i=0; i<n; i++) {
                if(car[i]%2 == 0) ans += fine[i];
            }
        }
        
        return ans;
    }
}
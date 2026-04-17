class Solution {
  public:
    bool isValidTime(int time, vector<int> &arr, int k) {
        int n = arr.size();
        int currTime = 0;
        int painter = 1;
        
        for(int i=0; i<n; i++) {
            
            if(arr[i] > time) return false; 
            
            if(currTime + arr[i] <= time) {
                currTime += arr[i];
            } else {
                painter++;
                currTime = arr[i];
            }
            
            if(painter > k) return false;
        } 
        
        return painter <= k;
    }
    int minTime(vector<int>& arr, int k) {
        // code here
        int n = arr.size();
        int maxTime = 0, sumTime = 0;
        
        for(int i=0; i<n; i++) {
            maxTime = max(maxTime, arr[i]);
            sumTime += arr[i];
        }
        
        int si = maxTime, ei = sumTime;
        int ans = -1;
        
        while(si <= ei) {
            int mid = si + (ei-si)/2;
            
            if(isValidTime(mid, arr, k)) {
                ans = mid;
                ei = mid-1;
            } else {
                si = mid+1;
            }
        } 
        
        return ans;
    }
};
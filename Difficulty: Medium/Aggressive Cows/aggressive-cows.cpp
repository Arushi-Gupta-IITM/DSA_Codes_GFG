class Solution {
  public:
    int isValidDistance(vector<int> &stalls, int k, int dist) {
        int n = stalls.size();
        int cows = 1;
        int minStall = stalls[0] + dist;
        
        for(int i=1; i<n; i++) {
            if(stalls[i] >= minStall) {
                cows++;
                minStall = stalls[i] + dist;
            }
        }
        return cows >= k;
    }
    int aggressiveCows(vector<int> &stalls, int k) {
        // code here
        int n = stalls.size();
        if(n < k) return -1;
        
        sort(stalls.begin(), stalls.end());
        
        int si = 1;
        int ei = stalls[n-1] - stalls[0];
        int ans = -1;
        
        while(si <= ei) {
            int mid = si + (ei-si)/2;
            if(isValidDistance(stalls, k, mid)) {
                ans = mid;
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        return ans;
    }
};
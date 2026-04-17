class Solution {
  public:
    bool isValidPlacement(int dist, vector<int> &stalls, int k) {
        int n = stalls.size();
        int cow = 1;
        int nextPos = stalls[0] + dist;
        
        for(int i=1; i<n; i++) {
            if(stalls[i] >= nextPos) {
                cow++;
                nextPos = stalls[i] + dist;
            } 
        }
        
        return cow >= k;
    }
    int aggressiveCows(vector<int> &stalls, int k) {
        // code here
        int n = stalls.size();
        sort(stalls.begin(), stalls.end());
        
        int si = 1, ei = stalls[n-1] - stalls[0];
        int ans = -1;
        
        while(si <= ei) {
            int mid = si + (ei-si)/2;
            if(isValidPlacement(mid, stalls, k)) {
                ans = mid;
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        
        return ans;
    }
};
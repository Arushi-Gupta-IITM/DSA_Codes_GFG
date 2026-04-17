class Solution {
  public:
    
    bool isValidAllocation(int maxPages, vector<int> &arr, int k) {
        int n = arr.size();
        int stu = 1, pages = 0;
        
        for(int i=0; i<n; i++) {
            if(pages+arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                stu++;
                pages = arr[i];
            }
        }
        
        return stu <= k;
    }
    
    int findPages(vector<int> &arr, int k) {
        // code here
        int n = arr.size();
        if(n < k) return -1;
        int maxPages = INT_MIN, sumPages = 0;
        
        for(int i=0; i<n; i++) {
            maxPages = max(maxPages, arr[i]);
            sumPages += arr[i];
        }
        
        //search range for binary search
        int si = maxPages, ei = sumPages;
        int ans = -1;
        
        while(si <= ei) {
            int mid = si + (ei-si)/2;
            
            if(isValidAllocation(mid, arr, k)) {
                ans = mid;
                ei = mid-1;
            } else {
                si = mid+1;
            }
        }
        
        return ans;
    }
};
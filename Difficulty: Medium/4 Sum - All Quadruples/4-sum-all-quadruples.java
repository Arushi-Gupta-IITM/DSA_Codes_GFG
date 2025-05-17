//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            // String[] nk = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(nk[0]);
            // int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int target = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            List<List<Integer>> ans = ans = sln.fourSum(a, target);
            Collections.sort(ans, (list1, list2) -> {
                for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                    int cmp = list1.get(i).compareTo(list2.get(i));
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return 0;
            });
            for (List<Integer> v : ans) {
                for (int x : v) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            if (ans.isEmpty()) {
                System.out.println(-1);
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// target : the quadruple sum required

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=n-1; i>=3; i--) {
            int tar = target - arr[i];
            for(int j=i-1; j>=2; j--) {
                int tar2 = tar - arr[j];
                
                int si = 0;
                int ei = j-1;
                
                while(si < ei) {
                    int sum = arr[si] + arr[ei];
                    
                    if(sum == tar2) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[si]);
                        list.add(arr[ei]);
                        list.add(arr[j]);
                        list.add(arr[i]);
                        set.add(list);
                        si++;
                        ei--;
                    } else if(sum < tar2) si++;
                    else ei--;
                }
            }
        }
        
        for(List<Integer> list : set) {
            ans.add(list);
        }
        
        return ans;
    }
}
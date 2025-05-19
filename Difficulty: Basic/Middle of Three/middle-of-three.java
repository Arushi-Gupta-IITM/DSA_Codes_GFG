//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int A = Integer.parseInt(read.readLine());
            int B = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.middle(A, B, C));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        
        if(a > min && a < max) return a;
        if(b > min && b < max) return b;
        else return c;
    }
}
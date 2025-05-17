//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    int countTriplet(int arr[]) {
        // code here
       Arrays.sort(arr);
       int count = 0;
       int n = arr.length;
       
       for(int i=n-1; i>=2; i--) {
           int tar = arr[i];
           
           int si = 0;
           int ei = i-1;
           
           while(si < ei) {
               int sum = arr[si] + arr[ei];
               
               if(sum == tar) {
                   count++;
                   si++;
                   ei--;
               }
               else if(sum > tar) ei--;
               else si++;
           }
       }
       
       return count;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.countTriplet(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

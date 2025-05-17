//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends


class Solution {
    public int maxProfit(int m, int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int profit = 0;
        
        for(int i=0; i<m; i++) {
            if(arr[i] > 0) break;
            profit += arr[i];
        }
        
        return -1*profit;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String[] input = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(k, arr));
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends
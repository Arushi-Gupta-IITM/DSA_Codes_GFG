//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public int minDiff(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<n-1; i++) {
            diff = arr[i+1] - arr[i];
            minDiff = Math.min(diff, minDiff);
        }
        
        return minDiff;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                arr[j] = Integer.parseInt(inputArray[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.minDiff(arr));
            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends
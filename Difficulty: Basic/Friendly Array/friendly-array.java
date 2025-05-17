//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int calculateFriendliness(int[] arr) {
        // code here
        int n = arr.length;
        int diff = Math.abs(arr[n-1] - arr[0]);
        
        for(int i=0; i<n-1; i++) {
            diff += Math.abs(arr[i+1] - arr[i]);
        }
        
        return diff;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                arr[j] = Integer.parseInt(inputArray[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.calculateFriendliness(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends
//{ Driver Code Starts
import java.io.*;
import java.util.*;

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
            System.out.println(solution.maxPerimeter(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends


class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i=n-1; i>=2; i--) {
            int s1 = arr[i];
            int s2 = arr[i-1];
            int s3 = arr[i-2];
            
            if(s2+s3 > s1) {
                return s1+s2+s3;
            }
        }
        
        return -1;
    }
}
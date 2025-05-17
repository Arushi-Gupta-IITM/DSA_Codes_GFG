//{ Driver Code Starts
import java.util.*;

// Main class to handle input/output
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int[] res = ob.mergeNsort(arr, brr);

            // Printing the result
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] mergeNsort(int[] arr, int[] brr) {
        // Write your code here
        int n1 = arr.length;
        int n2 = brr.length;
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i < n1 && j < n2) {
            if(arr[i] <= brr[j]) {
                if(list.size() == 0) list.add(arr[i]);
                else if(list.get(list.size()-1) != arr[i]) list.add(arr[i]);
                i++;
            } else {
                if(list.size() == 0) list.add(brr[j]);
                else if(list.get(list.size()-1) != brr[j]) list.add(brr[j]);
                j++;
            }
        } 
        
        while(i < n1) {
            if(list.size() == 0) list.add(arr[i]);
            else if(list.get(list.size()-1) != arr[i]) list.add(arr[i]);
            i++;
        }
        
        while(j < n2) {
            if(list.size() == 0) list.add(brr[j]);
            else if(list.get(list.size()-1) != brr[j]) list.add(brr[j]);
            j++;
        }
        
        int n = list.size();
        int[] ans = new int[n];
        
        for(i=0; i<n; i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}

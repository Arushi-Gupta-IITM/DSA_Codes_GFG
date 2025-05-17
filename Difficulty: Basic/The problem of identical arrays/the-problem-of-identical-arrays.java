//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        // Your code goes here.
        int n1 = a.size();
        int n2 = b.size();
        
        if(n1 != n2) return false;
        
        Collections.sort(a);
        Collections.sort(b);
        
        for(int i=0; i<n1; i++) {
            if(a.get(i) != b.get(i)) return false;
        }
        
        return true;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.nextLine();
            List<Integer> arr1 = new ArrayList<>();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                arr1.add(lineScanner.nextInt());
            }
            line = sc.nextLine();
            List<Integer> arr2 = new ArrayList<>();
            lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                arr2.add(lineScanner.nextInt());
            }
            Solution ob = new Solution();
            boolean ans = ob.isIdentical(arr1, arr2);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            lineScanner.close();

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends
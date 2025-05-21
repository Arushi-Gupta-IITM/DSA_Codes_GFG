

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        int n = data.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            char ch = data.charAt(i);
            if(map.containsKey(ch)) return false;
            map.put(ch, 1);
        }
        
        return true;
    }
}
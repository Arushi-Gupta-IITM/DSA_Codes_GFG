// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=10; i++) {
            list.add(n*i);
        }
        
        return list;
    }
}
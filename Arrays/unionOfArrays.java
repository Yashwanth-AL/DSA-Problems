class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       TreeSet<Integer> set = new TreeSet<>((x, y) -> {
           return Integer.compare(x, y);
       });
       
       for(int e : a) set.add(e);
       for(int e : b) set.add(e);
       return new ArrayList<>(set);
    }
}

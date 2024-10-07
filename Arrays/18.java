public class LargestNumber {

    public static String largestNumber(String[] arr) {
       Comparator<String> comp = (x, y) -> (x+y).compareTo(y+x);
       Arrays.sort(arr, comp.reversed());
       
       if(arr[0].equals("0")){
           return "0";
       }
       StringBuilder res = new StringBuilder();
       for(String x : arr){
           res.append(x);
       }
       return res.toString();
    }
}


// Input: n = 5, arr[] =  {“3”, “30”, “34”, “5”, “9”}
// Output: “9534330”
// Explanation: Given numbers are  {“3”, “30”, “34”, “5”, “9”}, the arrangement “9534330” gives the largest value.

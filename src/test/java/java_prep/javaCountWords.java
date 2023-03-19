package java_prep;

import java.util.HashMap;
import java.util.Map;

public class javaCountWords {
    //count number of words in a given string
    public String Actor(){
        return "comedy";
       // System.out.println("comedy");
    }
    public void Movie(String movname,int no) {
        System.out.println(movname+no);
    }

    public void Movie(String movname){
        System.out.println(movname);
    }



        public static void main(String[] arg) {
        String str = "I am am learning learning java java programming now now";
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 1;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

        }
        for (String x : map.keySet()) {
            System.out.println("The count of word:" + x + " = " +map.get(x));

        }

    }
}
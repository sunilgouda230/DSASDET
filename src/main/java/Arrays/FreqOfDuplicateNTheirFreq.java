package Arrays;


import java.util.HashMap;
import java.util.Map;

//Implemented a Java program to identify duplicate numbers in an array and print their frequencies.
public class FreqOfDuplicateNTheirFreq {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 2, 3, 3, 4, 4};
        Map<Integer,Integer> map = new HashMap<>();

        for(int val : input){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        System.out.println(map);

        for(Map.Entry<Integer,Integer> o : map.entrySet()){
            if (o.getValue() > 1){
                System.out.println(o.getKey()+" is the duplicate ele with freq as "+o.getValue());
            }
        }
    }
}

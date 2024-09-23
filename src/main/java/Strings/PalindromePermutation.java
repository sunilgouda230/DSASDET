package Strings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static boolean isPalindromePermutationUsingHashMap(String str){
        Map<Character,Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        boolean noOfOneMoreThanOne = false;
        
        for (Map.Entry<Character,Integer> o : freq.entrySet()) {
            if (o.getValue() % 2 == 1) {
                if (noOfOneMoreThanOne) {
                    return false;
                }
                noOfOneMoreThanOne = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePermutationUsingHashMap("nitin"));
    }

}

package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateInSortedArrays {

    public static void main(String[] args) {
        int  arr1 [] = {1, 5, 10, 20, 40, 80};
        int  arr2 [] = {6, 7, 20, 80, 100};
       int arr3 [] = {3, 4, 15, 20, 30, 70, 80, 80, 120};
       //findDuplicates(arr1,arr2,arr3);
       findDuplicatesWithoutAdditionalDataStructure(arr1,arr2,arr3);
    }

    private static void findDuplicatesWithoutAdditionalDataStructure(int[] arr1, int[] arr2, int[] arr3) {
                int i = 0, j = 0, k = 0;  // Pointers for arr1, arr2, and arr3
                List<Integer> result = new ArrayList<>();

                while (i < arr1.length && j < arr2.length && k < arr3.length) {
                    // If the current elements are equal in all arrays, add it to the result
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                            result.add(arr1[i]);
                        }
                        i++;
                        j++;
                        k++;
                    }
                    // If arr1[i] is smaller, increment i
                    else if (arr1[i] < arr2[j]) {
                        i++;
                    }
                    // If arr2[j] is smaller, increment j
                    else if (arr2[j] < arr3[k]) {
                        j++;
                    }
                    // If arr3[k] is smaller, increment k
                    else {
                        k++;
                    }
                }

                if (result.isEmpty()) {
                    result.add(-1);
                }

                System.out.print(result);
            }

    private static void findDuplicates(int[] arr1, int[] arr2, int[] arr3) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int val : arr1){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }

        for (int val : arr2){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }

        for (int val : arr3){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }

        for (Map.Entry<Integer,Integer> o:freq.entrySet()){
            if (o.getValue() >= 3){
                result.add(o.getKey());
            }
        }

        System.out.print(result);
    }
}

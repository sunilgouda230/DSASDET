package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] table = new int[arr.length+1];

        for(int val : arr){
            table[val]++;
        }

        int i = 0;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int val : table){
            if(val > max){
                max = Math.max(max,val);
                index = i;
            }
            i++;
        }

        System.out.println(index);
    }
}

package ServiceBasedQuestions;

public class ReverseAnArray {
    private static int[] reverArray(int[] arr) {
        int l = 0;
        int h = arr.length-1;

        while(l < h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {2,8};
        int [] ans = reverArray(arr);

        for(int val : ans){
            System.out.print(val+" ");
        }
    }

}

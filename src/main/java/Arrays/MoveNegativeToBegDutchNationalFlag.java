package Arrays;

public class MoveNegativeToBegDutchNationalFlag {
    public static void main(String[] args) {
        int [] arr = {-2,4,-8,3,0,-7,-6,2,3,8};
        int low = 0;
        int high = arr.length-1;
        
        while (low < high) {
            if(arr[low] < 0) {
                low++;
            } else {
                swap(arr,low,high);
                high--;
            }
        }

        for (int val : arr){
            System.out.print(val+" ");
        }
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high]= temp;
    }
}

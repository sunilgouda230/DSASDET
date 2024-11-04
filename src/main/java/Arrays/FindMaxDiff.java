package Arrays;

public class FindMaxDiff {
    public static int maxIndexDiff(int arr[], int n) {
        // code here

        int i = 0;
        int max = Integer.MIN_VALUE;
        while(i < n){
            int j = i+1;
            while(j < n) {
                if(arr[i] <= arr[j]) {
                    max = Math.max(max,j-i);
                    j++;
                } else {
                    j++;
                }
            }

            i++;

        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {34 ,8 ,10, 3, 2 ,80, 30, 33, 1};
        System.out.print(maxIndexDiff(arr,arr.length));
    }
}

package Arrays;

public class RearrangeNegativeAndPositiveNumbers {

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {-5, 10, -3, 8, -1, 6};
        int L = 0; // will track all the negative numbers
        int R = 0; // it tracks all the non-negative and swap with negative

        while (R < array.length) {
            if (array[R] < 0) {
                swap(array, L, R);
                L++;
            }
            R++;
        }

        for (int val : array) {
            System.out.print(val + " ");
        }
    }

}

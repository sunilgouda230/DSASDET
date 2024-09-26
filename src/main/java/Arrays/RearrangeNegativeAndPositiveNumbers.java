package Arrays;

public class RearrangeNegativeAndPositiveNumbers {

    public  static  void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {-5, 10, -3, 8, -1, 6};
        int L = 0;
        int R = 0;

        while (R < array.length){
            if(array[R] < 0){
                swap(array,L,R);
                L++;
                R++;
            } else {
                R++;
            }
        }
        for(int val : array){
            System.out.print(val+" ");
        }
    }

    }

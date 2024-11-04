package Arrays;

public class ProductOfArrayExceptTheTheIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int [] ans = productOfArray(arr);

        for (int val : ans){
            System.out.print(val+" ");
        }

    }

    private static int[] productOfArray(int[] arr) {
        int product = 1;
        int [] ans = new int [arr.length];

        for(int i = 0 ; i < arr.length; i++) {
            product = 1;
            for(int j = 0; j < arr.length; j++) {
                if( i !=j ) {
                    product *=arr[j];
                }
            }
            ans[i] = product;
        }

        return ans;
    }
}

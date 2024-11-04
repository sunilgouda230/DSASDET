package Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int ans [] = new int[2];
        int n = numbers.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && numbers[i] == numbers[i-1]) continue;

            int j = n-1;

            while(i < j){
                int sum = numbers[i] + numbers[j];

                if(sum < target){
                    i++;
                } else if(sum > target){
                    j--;
                } else {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        int [] ans =  twoSum(numbers,target);
        for (int val : ans){
            System.out.print(val +" ");
        }
    }
}

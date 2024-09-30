package Arrays;

public class FindDuplicates {
    // this same problem can be solved using hashmap
    public static int findDuplicate(int[] nums) {
        int table [] = new int[nums.length+1];

        for(int val : nums){
            table[val]++;
        }

        int i = 0;
        for(int val : table){
            if(val > 1){
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}

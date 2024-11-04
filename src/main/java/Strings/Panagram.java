package Strings;

public class Panagram {

    public static boolean isPalindrome(String ans){
        int [] table = new int[26];

         ans = ans.toLowerCase().replace(" ","");

        for (char ch : ans.toCharArray()){
            table[ch - 'a']++;
        }

        for (int val : table){
            if (val == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ans = "We promptly judged antique ivory buckles for the next prize";
        System.out.print(isPalindrome(ans));
    }
}

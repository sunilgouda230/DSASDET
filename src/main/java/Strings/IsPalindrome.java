package Strings;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int[] table = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        String ans = sb.toString();

        int low = 0;
        int high = ans.length()-1;

        while(low < high) {
            if (ans.charAt(low) != ans.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.print(isPalindrome(s));
    }
}

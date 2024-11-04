package Strings;

public class FindkthCharInDecodeString {
    public static char kThCharaterOfDecryptedString(String s, Long k)
    {
        // Write your code here

        long size = 0;
        int n = s.length();

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                size = size * (ch - '0');
            } else {
                size +=1;
            }
        }


        for (int i = n-1; i >=0; i--) {


            if((k % size) == 0 && Character.isAlphabetic(s.charAt(i))) {
                return s.charAt(i);
            } else if(Character.isAlphabetic(s.charAt(i))) {
                size -=1;
            } else {
                size = size / (s.charAt(i) - '0');
            }
        }

        return ' ';

    }
    public static void main(String[] args) {
        long k = 8;
        System.out.print(kThCharaterOfDecryptedString("a2b3cd3",k));
    }
}

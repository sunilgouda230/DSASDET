package Strings;

public class ReverseWordByLen {

    public static String reverseWordByLen(String str){
        String reversed = new StringBuilder(str).reverse().toString();

        String [] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String word : words){
            String substring = reversed.substring(index,index+word.length());

            index += word.length();
            sb.append(substring).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "i like water";
        String ans = reverseWordByLen(str);
        System.out.println(ans);
    }
}

package Strings;

public class IsUniqie {

    public static boolean IsUniqieString(String str){

        str = str.toLowerCase();

        boolean freq [] = new boolean[26];

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        for (char ch : str.toCharArray()) {
           
            if(ch >= 'a' && ch <= 'z') {
                if (freq[ch - 'a']) {
                    return false;
                }
            }

            freq[ch - 'a'] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "The.";
        System.out.println(IsUniqieString(str));

    }

}

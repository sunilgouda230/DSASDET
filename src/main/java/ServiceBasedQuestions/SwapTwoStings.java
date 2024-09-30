package ServiceBasedQuestions;

public class SwapTwoStings {
    public static void swap(String s1, String s2){
        String temp = "";

        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("The value of S1 "+s1);
        System.out.println("The value of S2 "+s2);
    }

    public static void swapUsingSubstring(String s1, String s2){
        s1 = s1 + s2;

        s2 = s1.substring(0,(s1.length()-s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println("The value of S1 "+s1);
        System.out.println("The value of S2 "+s2);
    }

    public static void main(String[] args) {
        String s1 = "puja";
        String s2 = "sunil";
        swapUsingSubstring(s1,s2);
    }
}

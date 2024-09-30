package Test;

public class Test {

    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }

        return reverse(str.substring(str.charAt(1))) + str.charAt(0);
    }

    public static void main(String [] args) {
        String str = "sunil";
       String ans =  reverse(str);
       System.out.println(ans);
    }
}

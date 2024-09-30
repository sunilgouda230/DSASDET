package ServiceBasedQuestions;

public class CountCapitalizedWordsInString {
    public static void main(String[] args) {
        System.out.println(getCapsWordsInString("SFJDNDJDNDJD"));
    }

    private static int getCapsWordsInString(String str) {
        int count = 0;
        for (char ch : str.toCharArray()){
            if (Character.isUpperCase(ch)){
                count++;
            }
        }
        return count;
    }
}

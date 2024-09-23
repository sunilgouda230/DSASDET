package Strings;

public class URlFy {
public static void main(String[] args) {
         char[] str = "Mr John Smith    ".toCharArray();  // String with extra buffer space
        int trueLength = 13;  // True length excluding the trailing spaces
        urlify(str, trueLength);
        System.out.println(str); 
}

private static void urlify(char[] str, int trueLength) {
    int index = 0;
    int spaceCount = 0;

    for(int i =0; i < trueLength; i++){
        if (str[i] == ' ') {
            spaceCount++;
        }
    }
    //if (trueLength < str.length) str[trueLength] = '\0';
    index = trueLength + (2 *spaceCount) ;

    for(int i = trueLength-1; i >=0; i--){
        if (str[i] == ' ') {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index = index -3;
        } else{
            str[index - 1] = str[i];
            index--;
        }
    }
   
}
}

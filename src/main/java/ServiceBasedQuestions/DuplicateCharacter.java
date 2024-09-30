package ServiceBasedQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void duplicatechars(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> o:map.entrySet()){
            if (o.getValue() > 1)
                System.out.println(o.getKey());
        }
    }
    public static void main(String[] args) {
        String str = "rahulshettyacademy";
        duplicatechars(str);
    }
}

package Test;

import java.util.ArrayList;
import java.util.List;

public class ListOrder {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        System.out.println(list2);
        list2.add(1);
        System.out.println(list2);
    }
}

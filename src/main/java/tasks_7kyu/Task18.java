
package tasks_7kyu;

//In this kata you will create a function that takes a list of non-negative integers and strings and returns a
//new list with the strings filtered out.

import java.util.ArrayList;
import java.util.List;


public class Task18 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("aaa");
        list.add(1);
        list.add(2);
        System.out.println(filterList(list));
    }


    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();
        String reg = "[0-9]+";
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof String)) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
//import java.util.*;
//        import java.util.stream.Collectors;
//
//public class Kata {
//
//    public static List filterList(final List<Object> list) {
//        return list.stream()
//                .filter(e -> e instanceof Integer)
//                .collect(Collectors.toList());
//    }
//
//}
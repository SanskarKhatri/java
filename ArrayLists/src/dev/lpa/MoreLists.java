package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk","eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries.get(0));
        groceries.remove("bananas");
        System.out.println(groceries);
        groceries.remove(3);
        System.out.println(groceries);
        groceries.removeAll(List.of("mustard","eggs"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
    }
}

package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placeToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        list.push("Alice Springs");
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator();
        System.out.println(iterator2.previous());
    }
}
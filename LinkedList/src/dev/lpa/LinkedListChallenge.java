package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    record place(String name, long distance) {

    }
    public static void main(String[] args) {
        LinkedList<place> places = new LinkedList<>();

        places.add(new place("Adelaide",1374));
        places.add(new place("Alice Springs",2771));
        places.add(new place("Brisbane",917));
        places.add(new place("Darwin",3972));
        places.add(new place("Melbourne",877));
        places.add(new place("Perth",3923));


        System.out.println(places);
        var iterator = places.listIterator();

        Scanner s = new Scanner(System.in);
        boolean contd = true;
        while (contd) {
            System.out.println("""
                    Available Actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit""");
            String option = s.nextLine();
            switch(option) {
                case "F" -> forward(iterator);
                case "B" -> backward(iterator);
                case "L" -> listPlaces(places);
                case "Q" -> contd = false;
            }
        }


    }
    public static void forward(ListIterator<place> iterator) {
        if(iterator.hasNext()) System.out.println(iterator.next());
        else System.out.println("No more places after.");
    }
    public static void backward(ListIterator<place> iterator) {
        if(iterator.hasPrevious()) System.out.println(iterator.previous());
        else System.out.println("No more places before.");
    }
    public static void listPlaces(LinkedList<place> list) {
        for(place i : list) {
            System.out.println(i.name + " " + i.distance);
        }
    }
}

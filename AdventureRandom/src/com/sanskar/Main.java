package com.sanskar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("QUIT","Q");

        Location currentLocation = locations.getLocation(64);
        while(true) {
            System.out.println(currentLocation.getDescription());
            if(currentLocation.getLocationID() == 0) {
                break;
            }
            Map<String,Integer> exits = currentLocation.getExits();
            System.out.println("Available exits are ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + " , ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String i: words) {
                    if(vocabulary.containsKey(i)) {
                        direction = vocabulary.get(i);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
        locations.close();
    }
}
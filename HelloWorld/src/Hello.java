public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Sanskar");
//
//        boolean isAlien = true;
//        if(isAlien) {
//            System.out.println("It is not an alien.");
//            System.out.println("And i am scared of aliens");
//        }
//
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than second top score and less than 100");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);

    }
}

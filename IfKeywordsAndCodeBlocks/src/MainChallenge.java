public class MainChallenge {

    public static void main(String[] args) {

//        System.out.println("Your Final score is " + calculateScore(true,800,5,100));
//
//        System.out.println("Your Final score is " + calculateScore(true,10000,8,200));

        displayHighScorePosition("Sanskar", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Tim", calculateHighScorePosition(500));
        displayHighScorePosition("John", calculateHighScorePosition(100));
        displayHighScorePosition("Mark", calculateHighScorePosition(25));
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
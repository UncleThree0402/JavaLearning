package ncku.unclethree;

public class MethodChallengeOne {
    public static void main(String[] args){
        displayHighScorePosition("Same" ,calculateHighScorePosition(1500));
        displayHighScorePosition("Tom" ,calculateHighScorePosition(900));
        displayHighScorePosition("Jerry" ,calculateHighScorePosition(400));
        displayHighScorePosition("May" ,calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        else{
            return 4;
        }
    }
}

import java.util.Scanner;

public class Logic {

    private int winNum = 27;
    private int upLimit = 50;
    private int lowLimit = 0;
    private int guess;


    public boolean isInRange(int guess) {
        if(guess >= lowLimit && guess <= upLimit){
            return true;
        }
        return false;
    }

    public String lower(int guess) {
        if(guess < winNum){
            return "too low";
        }
        return "";
    }

    public String higher(int guess) {
        if(guess > winNum){
            return "too high";
        }
        return "";
    }

    public String isWinner(int guess) { //this one call first
        if(guess == winNum){
            return "You won!";
        }
        return "";
    }

    public int getWinNum() {  //getter do we need this?
        return winNum;
    }

    public int getUpLimit() {
        return upLimit;
    }

    public int getLowLimit() {
        return lowLimit;
    }
}


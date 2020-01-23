import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Logic {

    private int winNum = 27;
    private int upLimit = 50;
    private int lowLimit = 0;
    private int guess;


    private ArrayList<Integer> arrayList = new ArrayList<>();


    public boolean isInRange(int guess) {
        if (guess >= lowLimit && guess <= upLimit) {
            return true;
        }
        return false;
    }

    public String lower(int guess) {
        if (guess < winNum) {
            return "too low";
        }
        return "";
    }

    public String higher(int guess) {
        if (guess > winNum) {
            return "too high";
        }
        return "";
    }

    public String isWinner(int guess) { //this one call first
        if (guess == winNum) {
            return "You won!";
        }
        return "";
    }


    public void genArrayList() {
        Random randomGen = new Random();
        int count = 0;
        int randomStart = randomGen.nextInt(51);
        if (randomStart != winNum) {
            arrayList.add(randomStart);
        }
        while (count < 9) {
            int randomInt = randomGen.nextInt(51);
            for (int i = 0; i <= arrayList.size(); i++) {
                if (!arrayList.get(i).equals(randomInt) && randomInt != winNum) {
                    arrayList.add(randomInt);
                }
            }
            count++;
        }
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

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

}


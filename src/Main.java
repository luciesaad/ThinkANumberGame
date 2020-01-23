import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        int guess = -1;

        Scanner scan = new Scanner(System.in);

        int count = 0;
        logic.startNumbArray();
        logic.genArrayList();
<<<<<<< HEAD
        System.out.println(logic.randomStartNum());
        do{
=======
        do {
>>>>>>> 86928ace10da4a57002d4fb5162d96caa900209e
            System.out.println("Write in number between 0 and 50: ");
            boolean isNextInt = scan.hasNextInt();
            if (isNextInt) {
                guess = scan.nextInt();
            }
            scan.next();


            logic.gameResult(guess);

            for (int i = 0; i < logic.getArrayList().size(); i++) {
                if (logic.getArrayList().get(i).equals(guess)) {
                    System.out.println("You hit a mine");
                    count++;
                    break;
                }
            }

<<<<<<< HEAD
            if(logic.isWinner(guess)){
=======
            if (logic.isWinner((guess)).equals("You won!")) {
>>>>>>> 86928ace10da4a57002d4fb5162d96caa900209e
                break;
            }
            count++;

        } while (count < 10);
        scan.close();


    }
}

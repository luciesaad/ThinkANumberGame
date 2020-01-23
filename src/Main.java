import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        int guess = -1;

        Scanner scan = new Scanner(System.in);

        int count = 0;
        logic.startNumbArray();
        logic.genArrayList();

        System.out.println(logic.randomStartNum());
        do {
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
            
            if(logic.isWinner(guess)){
                break;
            }
            count++;

        } while (count < 10);
        scan.close();


    }
}

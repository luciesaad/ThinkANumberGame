import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Logic logic = new Logic();
        int guess;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write in number between 0 and 50: ");
        guess = scan.nextInt();
        scan.close();

        
            System.out.println(logic.isWinner(guess));
            System.out.println(logic.higher(guess));
            System.out.println(logic.lower(guess));



    }
}

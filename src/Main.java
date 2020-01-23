import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Logic logic = new Logic();
        int guess;

        Scanner scan = new Scanner(System.in);

        int count = 0;
        logic.startNumbArray();
        logic.genArrayList();
        do{
            System.out.println("Write in number between 0 and 50: ");
            guess = scan.nextInt();

            System.out.println(logic.isWinner(guess));
            System.out.println(logic.higher(guess));
            System.out.println(logic.lower(guess));

          for(int i = 0; i < logic.getArrayList().size(); i++){
              if(logic.getArrayList().get(i).equals(guess)){
                  System.out.println("You hit a mine");
                  count++;
                  break;
              }
          }

            if(logic.isWinner((guess)).equals("You won!")){
                break;
            }
            //TA BORT!!!!
            System.out.println(logic.getArrayList());
            count++;

        }while(count < 10);
        scan.close();




    }
}

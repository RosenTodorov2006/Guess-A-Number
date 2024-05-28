import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerNumber=random.nextInt(100);
        while (true){
            System.out.print("Guess a number (1-100): ");
            String playerInput=scanner.nextLine();
            boolean isValid=true;
            for (int i = 0; i < playerInput.length(); i++) {
                if(playerInput.charAt(i) <48 || playerInput.charAt(i) >57){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                int playerNumber=Integer.parseInt(playerInput);
                if(playerNumber==computerNumber){
                    System.out.println("You guessed it!");
                    break;
                }else if(playerNumber>computerNumber){
                    System.out.println("Too High!");
                }else{
                    System.out.println("Too Low!");
                }
            }else{
                System.out.println("Invalid input");
            }
        }
    }
}


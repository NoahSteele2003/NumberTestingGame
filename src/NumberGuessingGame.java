import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber, guessedNumber;

        pickedNumber = (int)(Math.random()*100);

        System.out.println(pickedNumber);

        System.out.println("Pick a number between 1 and 100");
        guessedNumber = keyboard.nextInt();

        

        if (guessedNumber>pickedNumber){System.out.println("Too high! Try again.");}
        else if (guessedNumber<pickedNumber){System.out.println("Too low! Try again.");}

        if (guessedNumber==pickedNumber){System.out.println("You win!");}
        
        //make sure to use while statements





    }
}

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber, guessedNumber, tries;
        tries = 0;
        String response;

        pickedNumber = (int)(Math.random()*100);

        /*Temporary*/ System.out.println(pickedNumber);

        System.out.println("Pick a number between 1 and 100");
        guessedNumber = keyboard.nextInt();

        while (guessedNumber != pickedNumber){
            if (guessedNumber>pickedNumber){System.out.println("Too high! Try again."); tries+=1;guessedNumber = keyboard.nextInt();}
            else if (guessedNumber<pickedNumber){System.out.println("Too low! Try again."); tries+=1;guessedNumber = keyboard.nextInt();}}

        if (guessedNumber==pickedNumber){tries+=1;System.out.println("You win! And it only took you "+tries+" tries.");}

        System.out.println("test");
        response = keyboard.nextLine();
        System.out.println(response);









    }
}

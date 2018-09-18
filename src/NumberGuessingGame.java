import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber, guessedNumber, tries;
        tries = 0;
        String response;
        response = "yes";

        pickedNumber = (int)(Math.random()*100);

        /*Temporary*/ System.out.println(pickedNumber);

        System.out.println("Pick a number between 1 and 100");
        guessedNumber = keyboard.nextInt();



            while (guessedNumber!=pickedNumber){
                if (guessedNumber < pickedNumber){System.out.println("Too low! Try again");
                    guessedNumber = keyboard.nextInt(); tries+=1;}
                else if(guessedNumber>pickedNumber){System.out.println("Too high! Try again");
                    guessedNumber = keyboard.nextInt(); tries+=1;}
            }

            if(guessedNumber==pickedNumber){
                System.out.println("You Win! And it only took you "+tries+" tries.");}






















    }
}

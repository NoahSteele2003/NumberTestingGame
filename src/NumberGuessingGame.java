import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        int pickedNumber, guessedNumber, tries;
        tries = 0;
        String response;

        Scanner keyboard;
        keyboard= new Scanner(System.in);

        pickedNumber = (int)(Math.random()*100);

        //System.out.println(pickedNumber);

        System.out.println("Pick a number between 1 and 100");
        guessedNumber = keyboard.nextInt();



        while (guessedNumber!=pickedNumber){
            if (guessedNumber < pickedNumber){System.out.println("Too low! Try again");
                guessedNumber = keyboard.nextInt(); tries+=1;}
            else if(guessedNumber>pickedNumber){System.out.println("Too high! Try again");
                guessedNumber = keyboard.nextInt(); tries+=1;}}

        if (guessedNumber==pickedNumber){
            tries+=1;
            System.out.println("You Win! And it only took you "+tries+" tries.");}







    }
}


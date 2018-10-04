import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard= new Scanner(System.in);

        int pickedNumber, guessedNumber, tries;
        int difficulty, chosen;
        int average, totalTries, attempts;
        difficulty = 0;
        pickedNumber = 0;
        tries = 0;
        average= 0;
        totalTries = 0;
        attempts = 0;
        String response = "yes";



        while(response.equals("yes")){
            System.out.println("Chose one of the four difficulties.(1 being easy, 2 being normal, 3 being hard, and 4 being extreme)");
            chosen = keyboard.nextInt();
            if(chosen==1){difficulty=50;}
            if(chosen==2){difficulty=100;}
            if(chosen==3){difficulty=150;}
            if(chosen==4){difficulty=200;}
            pickedNumber = (int)(Math.random()*difficulty);
            //System.out.println(pickedNumber);
            tries = 0;
            System.out.println("Pick a number between 1 and "+difficulty);
            guessedNumber=keyboard.nextInt();
            while (guessedNumber!=pickedNumber){
                if (guessedNumber < pickedNumber){System.out.println("Too low! Try again");
                    guessedNumber = keyboard.nextInt(); tries+=1;}
                else if(guessedNumber>pickedNumber){System.out.println("Too high! Try again");
                    guessedNumber = keyboard.nextInt(); tries+=1;}}

            if (guessedNumber==pickedNumber){
                tries+=1;
                totalTries += tries;
                attempts += 1;
                System.out.println("You Win! And it only took you "+tries+" tries.");}

            System.out.println("Would you like to play again?");
            response = keyboard.next();}



        if(response.equals("no")){
            average = (totalTries/attempts);
            System.out.println("Ok, your average was "+average+" tries per attempt.");
        }
    }
}

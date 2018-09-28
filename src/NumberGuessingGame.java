import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        int pickedNumber, guessedNumber, tries, average, totalTries, attempts;
        int number, difficulty;
        tries = 0;
        average= 0;
        totalTries = 0;
        attempts = 0;
        String response;

        Scanner keyboard;
        keyboard= new Scanner(System.in);

        System.out.println("Chose one of the four difficulties.(1 being easy, 2 normal, 3 hard, 4 extreme)");
        difficulty = keyboard.nextInt();

        /*if(difficulty==1){number = 50;}
        else if(difficulty==2){number=100;}
        else if(difficulty==3){number=200;}
        else if(difficulty==4){number=500;}*/

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
            totalTries = tries;
            attempts +=1;
            System.out.println("You Win! And it only took you "+tries+" tries.");}

        System.out.println("Would you like to play again?");
        response = keyboard.next();

        while(response.equals("yes")){
            pickedNumber = (int)(Math.random()*100);
            //System.out.println(pickedNumber);
            tries = 0;
            System.out.println("Pick a number between 1 and 100.");
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
            System.out.println("Ok, your average was "+average+" tries per game.");
        }







    }
}


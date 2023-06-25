import java.sql.SQLOutput;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
//Define the variables that need to be outside of the loop
        Scanner in = new Scanner(System.in);
        String A;
        String B;
        String choice;
        boolean done= false;
        String trash;
        String trashtwo;
        //start of overall loop
        do {
            boolean doneone= false;
            boolean donetwo = false;
            A="String1";
            B="String2";
            choice="String 3";
            //Player A input Scanner
            System.out.println("Player A what is your move (R,P, or S): ");
            A=in.next();
            //loop for making sure Player A inputs the correct input
            do {
                if (A.equalsIgnoreCase("R")||(A.equalsIgnoreCase("P")||(A.equalsIgnoreCase("S")))) {
                    doneone=true;
                } else {
                    System.out.println("You said your input was: " + A);
                    System.out.println("Invalid entry, try again: ");
                    A=in.next();
                }
            } while (!doneone);
            //Player B input Scanner
            System.out.println("Player B what is your move (R,P, or S): ");
            B=in.next();
            //loop for making sure Player B inputs the correct input
            do{
                if (B.equalsIgnoreCase("R")||(B.equalsIgnoreCase("P")||(B.equalsIgnoreCase("S")))) {
                    donetwo=true;
                } else {
                    System.out.println("You said your input was: " + B);
                    System.out.println("Invalid entry, try again: ");
                    B=in.next();
                }
            }while (!donetwo);
            //conditionals for r,p,s
            if(A.equalsIgnoreCase("R")&&(B.equalsIgnoreCase("S"))){
                System.out.println("Rock breaks scissors, Player A wins!");
            } else if((A.equalsIgnoreCase("S")&&(B.equalsIgnoreCase("P")))){
                System.out.println("Scissors cuts paper, Player A wins!");
            }else if((A.equalsIgnoreCase("P")&&(B.equalsIgnoreCase("R")))){
                System.out.println("Paper covers rock, Player A wins!");
            }if((A.equalsIgnoreCase("S")&&(B.equalsIgnoreCase("R")))){
                System.out.println("Rock breaks scissors, Player B wins!");
            }else if((A.equalsIgnoreCase("P")&&(B.equalsIgnoreCase("S")))){
                System.out.println("Scissors cuts paper, Player B wins!");
            }else if((A.equalsIgnoreCase("R")&&(B.equalsIgnoreCase("P")))){
                System.out.println("Paper covers rock, Player B wins!");
            }if(A.equalsIgnoreCase("R")&&(B.equalsIgnoreCase("R"))){
                System.out.println("Rock vs Rock is a tie!");
            }else if(A.equalsIgnoreCase("P")&&(B.equalsIgnoreCase("P"))){
                System.out.println("Paper vs Paper is a tie!");
            }else if(A.equalsIgnoreCase("S")&&(B.equalsIgnoreCase("S"))){
                System.out.println("Scissors vs Scissors is a tie!");
            }
            //scanner for continuing game or not
            System.out.println("Would you like to play again (Y/N): ");
            choice=in.next();
            //conditional for continuing game or not
            if (choice.equalsIgnoreCase("Y")){
                done=false;
            }else if (choice.equalsIgnoreCase("N")){
                done=true;
            }else {
                System.out.println("Invalid input, try again: ");}
        }while(!done);
    }
}

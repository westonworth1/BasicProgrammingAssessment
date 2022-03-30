/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingassessment;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author westo
 */
public class RockPaperScissors {
    public static void main(String[] args){
        
        // Declarations
        int rounds = 0;
        int userSelection = 0;
        int compSelection = 0;
        int ties = 0;
        int userWins = 0;
        int compWins = 0;
        String choice = "y";
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        
        // game loop
        do {
        
        // Prompt for the number of rounds
        System.out.println("How many rounds (Pick a number 1-10)");
        rounds = Integer.parseInt(myScanner.nextLine());
        
        // verify rounds is within range
        while(rounds < 1 || rounds > 10){
            System.out.println("How many rounds (Pick a number 1-10)");
            rounds = Integer.parseInt(myScanner.nextLine());
        }
        while (rounds > 0){
            rounds--;
            
            System.out.println("Make a selection:\n 1=Rock\n 2=Paper\n 3= Scissors");
            userSelection = Integer.parseInt(myScanner.nextLine()) - 1;
            compSelection = randomizer.nextInt(3);
            
            // tie logic
            if (userSelection == 0 && compSelection == 0){
                ties++;
                System.out.println("It's a tie!");
            }
            if (userSelection == 1 && compSelection == 1){
                ties++;
                System.out.println("It's a tie!");
            }
            if (userSelection == 2 && compSelection == 2){
                ties++;
                System.out.println("It's a tie!");
            }
            
            // user wins logic
            if (userSelection == 0 && compSelection == 2){
                userWins++;
                System.out.println("You win the round!");
            }
            if (userSelection == 1 && compSelection == 0){
                userWins++;
                System.out.println("You win the round!");
            }
            if (userSelection == 2 && compSelection == 1){
                userWins++;
                System.out.println("You win the round!");
            }
            
            // user loses logic
            if (userSelection == 0 && compSelection == 1){
                compWins++;
                System.out.println("You lost the round!");
            }
            if (userSelection == 1 && compSelection == 2){
                compWins++;
                System.out.println("You lost the round!");
            }
            if (userSelection == 2 && compSelection == 0){
                compWins++;
                System.out.println("You lost the round!");
            }
        }
        
        // game summary
        System.out.println("You won " + userWins + " times.");
        System.out.println("You lost " + compWins + " times.");
        System.out.println("You tied " + ties + " times.");
        if (userWins == compWins){
            System.out.println("Overall, you tied the computer!");
        }
        else if (userWins > compWins){
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost to a computer...");
        }
        
        // prompt to play again
        System.out.println("Would you like to play again? (y/n)");
        choice = myScanner.nextLine();
        } while (choice == "y"); // game loop exit condition
    }
}

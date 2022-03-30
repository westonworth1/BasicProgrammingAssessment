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
public class DogGenetics {
    public static void main(String [] args){
        
        // declarations
        int percentage = 100; // upper bound for random function
        String dogName = "";
        String [] breeds = {"St. Bernard", "Chihuahua", "Pug", "Mutt", "Cat????!"};
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        
        // prompt
        System.out.println("What's your dog's name?");
        dogName = myScanner.nextLine();
        
        // report
        System.out.println("Well then, I have this highly reliable report on " + dogName + " prestigious background right here.");
        System.out.println(dogName + " is");
        // iterate through array and pick a random number from the remaining possible percentage
        for (int i = 0; i < breeds.length - 1; i++){
            int randomNumber = randomizer.nextInt(percentage);
            percentage -= randomNumber;
            System.out.println(randomNumber + "% " + breeds[i]);
        }
        // last breed % isn't random, it's the remaining percentage
        System.out.println(percentage + "% " + breeds[4]);
    }
}

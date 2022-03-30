/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingassessment;
import java.util.Scanner;

/**
 *
 * @author westo
 */
public class HealthyHearts {
    public static void main(String[] args){
        
        // declarations
        int age = 0;
        int maxHR = 0;
        Scanner myScanner = new Scanner(System.in);
        
        // prompt
        System.out.println("What is your age?");
        age = Integer.parseInt(myScanner.nextLine());
        maxHR = 220 - age;
        
        // outputs
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + (.5 * maxHR) + " - " + (.85 * maxHR) + " beats per minute.");
    }
}

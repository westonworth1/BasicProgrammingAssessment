/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingassessment;

/**
 *
 * @author westo
 */
public class SummativeSums {
    public static int addArray(int[] addThisArray){
        int sum = 0;
        for (int i : addThisArray){
            sum += i;
        }
        return sum;
    }
    public static void main(String [] args){
        // declarations
        int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] array2 = { 999, -60, -77, 14, 160, 301 };
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        // method calls
        int sum1 = addArray(array1);
        int sum2 = addArray(array2);
        int sum3 = addArray(array3);
        
        // display results
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}

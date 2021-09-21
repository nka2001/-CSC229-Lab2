/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs.csc229_lab_2;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
/**
 *
 * @author nicka
 */
public class Lab_2_Main {
    
    
    public static void main(String[]args) throws ParseException{
        
        
        Instant s = Instant.now();//timer started 
     
        Scanner input = new Scanner(System.in);//scanner for input
        
        
        Lab2_Pairwise t1 = new Lab2_Pairwise();
        
        
        System.out.println("Please enter the size of the array: ");
        int size = input.nextInt();//this will get the determine the size of the array based on user input
        
        while(size < 2){//used to validate the constraint 
            System.out.println("Please enter an array size bigger than 2");
            size = input.nextInt();
        }
        
        
        int[] pairwiseArr = new int[size];//declare and initialize the array with the size taken from the user
        
        
        System.out.println("Please enter NON NEGATIVE numbers");//filling the array
        for(int i = 0; i < pairwiseArr.length; i++){
            pairwiseArr[i] = input.nextInt();
            
        }
      
        System.out.println("The biggest product is: " + t1.calcHighestPairwise(size, pairwiseArr));//this will determine the two highest elemetns in the array and find the biggest products
        
        Instant f = Instant.now();//timer ended
        long timeElapsed = Duration.between(s, f).toMillis();//calculation finsihed 
        System.out.println("Time: " + timeElapsed);//time printed
    

    
        

    }
}
        
        
        
       
        
    
    
    
 
    
    


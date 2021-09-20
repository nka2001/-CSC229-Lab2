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
        
        System.out.println("Please enter the size of the array: ");
        int size = input.nextInt();//this will get the determine the size of the array based on user input
        
        int[] pairwiseArr = new int[size];//declare and initialize the array with the size taken from the user
        
        
        System.out.println("Please enter NON NEGATIVE numbers");//filling the array
        for(int i = 0; i < pairwiseArr.length; i++){
            pairwiseArr[i] = input.nextInt();
            
        }
        
        int maxNum1 = -1;//max num 1 for determining pairwise product
        int maxNum2 = -1;// max num 2 for determining pairwise product
        
        for(int i = 0; i < pairwiseArr.length; i++){//for loop for finding the first big element in the array
            if((maxNum1 == -1) || (pairwiseArr[i] > pairwiseArr[maxNum1])){//if the maxNum is -1 or pairwise at index i is biggert than pairwise at maxNum then...
                maxNum1 = i;//max num equals i
            }
        }
        for(int i = 0; i < pairwiseArr.length; i++){//for loop for finding the second big element in the array
            if((i != maxNum1) &&  ((maxNum2 == -1) || (pairwiseArr[i] > pairwiseArr[maxNum2]))){//if i does not equal maxNum 1 AND max num2 is -1 or pairwiseArr at index i is biggeer than pairwiseArr at index maxnum2 then...
                maxNum2 = i;//maxNum2 = i
            }
        }
        
        int finalProduct = pairwiseArr[maxNum1] * pairwiseArr[maxNum2];//this will determine the maximum product for the array
        
        System.out.println("The biggest product is: " + finalProduct);//prints the product
        
        Instant f = Instant.now();//timer ended
        long timeElapsed = Duration.between(s, f).toMillis();//calculation finsihed 
        System.out.println("Time: " + timeElapsed);//time printed
    

    
        

    }
}
        
        
        
       
        
    
    
    
 
    
    


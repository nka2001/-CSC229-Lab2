/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs.csc229_lab_2;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
/**
 *
 * @author nicka
 */
public class Lab_2_Main {
    
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the size of the array: ");
        int size = input.nextInt();
        
        int[] pairwiseArr = new int[size];
        
        
        System.out.println("Please enter NON NEGATIVE numbers");
        for(int i = 0; i < pairwiseArr.length; i++){
            pairwiseArr[i] = input.nextInt();
            
        }
        
        int maxNum1 = -1;
        int maxNum2 = -1;
        
        for(int i = 0; i < pairwiseArr.length; i++){
            if((i != maxNum1) && ((maxNum2 == -1) || (pairwiseArr[i] > pairwiseArr[maxNum2]))){
                maxNum1 = i;
            }
        }
        for(int i = 0; i < pairwiseArr.length; i++){
            if((i != maxNum1) &&  ((maxNum2 == -1) || (pairwiseArr[i] > pairwiseArr[maxNum2]))){
                maxNum2 = i;
            }
        }
        
        int finalProduct = pairwiseArr[maxNum1] * pairwiseArr[maxNum2];
        
        System.out.println("The biggest product is: " + finalProduct);
        
        
    

    
        

    }
}
        
        
        
       
        
    
    
    
 
    
    


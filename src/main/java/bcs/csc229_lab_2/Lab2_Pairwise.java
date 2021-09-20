/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs.csc229_lab_2;

/**
 *
 * @author nicka
 */
public class Lab2_Pairwise {
    public Lab2_Pairwise(){
        
        
        
        
    }
    
    public int calcHighestPairwise(int size, int[] arr ){
        int product;
        
        int maxNum1 = -1;
        int maxNum2 = -1;
        
        for(int i = 0; i < arr.length; i++){//for loop for finding the first big element in the array
            if((maxNum1 == -1) || (arr[i] > arr[maxNum1])){//if the maxNum is -1 or pairwise at index i is biggert than pairwise at maxNum then...
                maxNum1 = i;//max num equals i
            }
        }
         for(int i = 0; i < arr.length; i++){//for loop for finding the second big element in the array
            if((i != maxNum1) &&  ((maxNum2 == -1) || (arr[i] > arr[maxNum2]))){//if i does not equal maxNum 1 AND max num2 is -1 or pairwiseArr at index i is biggeer than pairwiseArr at index maxnum2 then...
                maxNum2 = i;//maxNum2 = i
            }
        }
        
        product = arr[maxNum1] * arr[maxNum2];//calculates the product
        
        return product;//returns the product
    }
}

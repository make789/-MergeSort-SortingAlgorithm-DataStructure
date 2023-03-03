package com.mikecodes.MergeSort;

import java.util.Random;
import java.util.Scanner;

public class MergeSortMain  {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("================================== Merge Sort =============================================");
        Random ran = new Random();
        System.out.print("Enter a Number Between 1-100:  ");

        try {

            Scanner scanNumber = new Scanner(System.in);
            int inNumber = scanNumber.nextInt();
            if(inNumber >100){
                return;
            }
            Integer  [] numbers = new Integer [inNumber];

            for(int h=0; h<inNumber; h++){

                numbers[h] = ran.nextInt(100);
            }
            MergeSort ms = new MergeSort();
            System.out.println("=====================================Before Sorted====================================================");
            ms.dispayArray(numbers);
            System.out.println();
            System.out.println("==================================After Sorted=========================================================");
            ms.mergeSort(numbers);
            System.out.println();
            ms.dispayArray(numbers);
         }
        catch (Exception exception){

          System.out.println();
          System.out.println(exception);

       }



    }



}

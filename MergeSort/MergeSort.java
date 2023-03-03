package com.mikecodes.MergeSort;

public class MergeSort {

    public void mergeSort(Integer[] numbers){

        int length = numbers.length;
        if(length < 2) {
            return;
        }

        int mid= length/2;
        Integer[] leftHalf= new Integer[mid];
        Integer[] rightHalf= new Integer[length-mid];  //because of odd numbers

        for (int n=0; n<mid; n++){
            leftHalf[n]=numbers[n];
        }

        for(int n=mid; n<length; n++) {

            rightHalf[n - mid] = numbers[n]; //so as it starts from right half of index [0]
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge_combine(numbers,leftHalf,rightHalf);


    }

    public void merge_combine (Integer[] numbers,Integer[] left, Integer[] right) {

        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                numbers[k] = left[i];
                i++;
            }
            else {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<leftLength){                           // to add any remaining numbers

            numbers[k]= left[i];
            k++;
            i++;
        }

        while(j<rightLength){

            numbers[k]= right[j];
            k++;
            j++;
        }

    }

    public void dispayArray(Integer [] numbers){

        for (int n=0; n<numbers.length; n++){

            System.out.print("  "+numbers[n]+" ");
        }
        System.out.println();
    }

}

package com.company;
import java.lang.Comparable;

public class Main {



//    public  void swap(int a,int b )
//    {
//        a=a^b;
//        b=a^b;
//        a=a^b;
//
//    }
    public static void printArray(Integer [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static Integer[] arrayToSort= new Integer[]{2,7,1,5,4,3};

    public static void main(String[] args) {
        System.out.println("Try at naive bubble sort:: ");
        System.out.println("Array before bubble sort:: ");
        printArray(arrayToSort);
        for(int i=0;i<arrayToSort.length;i++){
            for(int j=0;j<(arrayToSort.length-1)-i;j++)
            {
                //if(arrayToSort[j+1]<arrayToSort[j])

                {
                    int temp =arrayToSort[j];
                        arrayToSort[j]=arrayToSort[j+1];
                        arrayToSort[j+1]=temp;
                }
            }
        }
        System.out.println("Array after bubble sort:: ");
        printArray(arrayToSort);

    }
    
}

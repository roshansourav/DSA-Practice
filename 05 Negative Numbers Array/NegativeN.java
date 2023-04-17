// 05 Negative Numbers Array;

import java.util.Scanner;
public class NegativeN {

    public void sorting(int arr[]){
        int temp = 0;
        int negativeIndex = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]<0){
                temp = arr[negativeIndex];
                arr[negativeIndex] = arr[i];
                arr[i] = temp;
                negativeIndex++;
            }
        }

        System.out.println("\n\nPrinting Array After Sorting: - ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }
    }


    public static void main(String[] ar){

        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        NegativeN obj = new NegativeN();

        System.out.println("\n\nPrinting Array : - ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }

        obj.sorting(arr);


    }
    
}

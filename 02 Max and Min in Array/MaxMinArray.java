// 02 Maximum and minimum of an array

import java.util.Scanner;
class MaxMinArray{

    public int[] takeArrayInput(int[] arr, int n){
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            System.out.print(""+i+" Enter value : \t");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public void findMaxMin(int[] arr, int n){
        int max = arr[0];
        int min = arr[0];
        int temp  = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("\nMax = "+max+" \nMin = "+min);
    }

    public static void main(String ar[]){

        System.out.println("Enter the size of the array : \n");
        int n  = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        MaxMinArray obj = new MaxMinArray();
        arr = obj.takeArrayInput(arr, n); // taking input array

        System.out.println("\n\nPrinting Array : - ");
        for(int i = 0; i<n; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }
        
        obj.findMaxMin(arr, n);

        sc.close();
    }//main method closed here

}
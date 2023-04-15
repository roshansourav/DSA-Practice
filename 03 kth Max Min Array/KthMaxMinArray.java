// 03 Find the "Kth" max and min element of an array 

import java.util.Scanner;

public class KthMaxMinArray {

    
    public int[] takeArrayInput(int[] arr, int n){
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            System.out.print(""+i+" Enter value : \t");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public void sorting(int arr[], int n, int k){
        int temp = 0;

        for(int i = 0; i<n; i++){
            for(int j = 1; j<n; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n\nPrinting Array After Sorting: - ");
        for(int i = 0; i<n; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }

        System.out.println("\n"+k+"th Min = "+arr[k-1]);
        System.out.println("\n"+k+"th Max = "+arr[n-k]);


    }

    public static void main(String[] ar){
        System.out.println("Enter the size of the array : \n");
        int n  = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        KthMaxMinArray obj = new KthMaxMinArray();
        arr = obj.takeArrayInput(arr, n); // taking input array

        System.out.println("\n\nPrinting Array : - ");
        for(int i = 0; i<n; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }

        // System.out.println("\nEnter value for K :\t");
        int k = 0;
        // k = sc.nextInt();
        k = 2;


        obj.sorting(arr, n, k);


        sc.close();
    }
    
}

// 01 Write a program to reverse an array
import java.util.Scanner;
class Reverse{

    public int[] takeArrayInput(int[] arr, int n){
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            System.out.print(""+i+" Enter value : \t");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public int[] reverseArray(int[] arr, int n){
        int[] tempArr = new int[n];
        for(int i=0; i<n; i++){
            tempArr[n-1-i] = arr[i];
        }
        return tempArr;
    }

    public static void main(String ar[]){

        System.out.println("Enter the size of the array : \n");
        int n  = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        Reverse obj = new Reverse();
        arr = obj.takeArrayInput(arr, n); // taking input array

        System.out.println("\n\nBefore Reversing : - ");
        for(int i = 0; i<n; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }
        
        arr = obj.reverseArray(arr, n);
        System.out.println("\n\nAfter Reversing : - ");
        for(int i = 0; i<n; i++){
            System.out.println(""+i+"th \t" +arr[i]);
        }


        sc.close();
    }//main method closed here


}
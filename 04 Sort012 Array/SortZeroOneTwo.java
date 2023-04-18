// 04 Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.*;

public class SortZeroOneTwo{

    
public static void sort012(int a[], int n)
    {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for(int i = 0; i<n; i++)
        {
            if(a[i] == 0)
                zeroCount++;
            else if(a[i] == 1)
                oneCount++;
            else if(a[i] == 2)
                twoCount++;
        }
        int counter = 0;
        while(zeroCount>0){
            a[counter] = 0;
            counter++;
            zeroCount--;
        }
        while(oneCount>0){
            a[counter] = 1;
            counter++;
            oneCount--;
        }
        while(twoCount>0){
            a[counter] = 2;
            counter++;
            twoCount--;
        }
        System.out.println("After Sorting : -\n");
        for(int i=0; i<n; i++)
            System.out.print("\t"+a[i]);
    }


    public static void main(String[] ar){

        int[] arr = {0, 2, 1, 2, 0};

        sort012(arr, arr.length);


    }


}



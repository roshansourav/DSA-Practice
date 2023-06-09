// Find a peak element which is not smaller than its neighbours

// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
//works in c++ compiler

class PeakElement{

    public int findPeak(int arr[], int n){
        
        for(int i=0; i<n; i++){
            if(n==1 ) return 0;
            else if(i==0 && arr[i]>= arr[i+1]) return i;
            else if(i==n-1 && arr[i]>=arr[i-1]) return i;
            else if(arr[i]>=arr[i-1] && arr[i]>arr[i+1]) return i;
        }

        return 0;
                
    }

    public static void main(String arg[]) {

        int ar[] = {10, 20, 15, 2, 23, 90, 67};
        PeakElement obj = new PeakElement();
        System.out.println("Peak Index = "+obj.findPeak(ar, ar.length));
    }
}

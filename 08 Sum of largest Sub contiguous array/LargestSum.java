// 08 Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum

class LargestSum{


    // O(n3) Solution
    public int findLargestSumOfSub(int arr[], int len){
        int maxSum = 0;
        int currentSum = 0;

        for(int i=0; i<len; i++){
            for(int j = i; j<len; j++){
                currentSum = 0;
                for(int k=0; k<=j; k++){
                    currentSum = currentSum + arr[k];
                    if(maxSum < currentSum)
                        maxSum = currentSum;
                }
                
            }
           
        }

        return maxSum;
    }// O(n3) Solution ends here


    // O(n2) Solution
    public int optimizedLargestSum(int arr[], int len){
        int maxSum = 0;
        int currentSum = 0;

        for(int i=0; i<len; i++){
            currentSum = 0;
            for(int j=i; j<len; j++){
                currentSum = currentSum + arr[j];
                if(maxSum < currentSum)
                    maxSum = currentSum;
            }
        }

        return maxSum;
    }// O(n2) Solution ends here


    public static void main(String ar[]){
        int arr[] = {1,2,3,-2,5};
        LargestSum obj = new LargestSum();

        System.out.println("Maximum Sum using Bruteforce approach = "+obj.findLargestSumOfSub(arr, arr.length) +"\n");
        System.out.println("Maximum Sum using Optimized approach = "+obj.optimizedLargestSum(arr, arr.length) +"\n");


    }

}
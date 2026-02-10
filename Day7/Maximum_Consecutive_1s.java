package Day7;

public class Maximum_Consecutive_1s {
    
    static void countMax(int [] arr, int n){

        int count=0;
        int result=0;
        
        for(int i =0; i<n; i++){
            if (arr[i]==0) {
                count=0;
            }
            else{
                count++;
                result = Math.max(result, count);
            }
        }

        System.out.println(result);
    }


    public static void main(String [] args){
        int arr[] = {1,1,0,1,1,1};
        int n = arr.length;


        countMax(arr,n);
    }
}

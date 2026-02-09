package Day6;

public class Tapping_Rain_Water_Problem {

    public int findWater(int[] arr, int n){ 
        int result = 0;

        int left_max[] = new int[n];
        int right_max[] = new int[n];

        left_max[0] = arr[0];
        for (int i = 1; i < n; i++){
            left_max[i] = Math.max(left_max[i-1], arr[i]);
        }

        right_max[n-1] = arr[n-1];          
        for (int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i+1], arr[i]);
        }

        for (int i = 0; i < n; i++){
            result += Math.min(left_max[i], right_max[i]) - arr[i];
        }

        System.out.println("The total water that can be trapped is: " + result);
        return result;
    }

    public static void main(String[] args){
          int arr[] = {3,1,2,4,0,1,3,2};
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {5,4,3,2,1};
        int n = arr.length;

        Tapping_Rain_Water_Problem fw = new Tapping_Rain_Water_Problem();
        fw.findWater(arr, n);
    }
}

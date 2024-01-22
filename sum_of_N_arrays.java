public class sum_of_N_arrays{
    public static void main(String args[]){
        int[] arr = {67,34,56,78,99}; //Sum = 334
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
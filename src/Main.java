import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,8};  //3



        for(int i = 0; i < arr.length - 1; i++){

            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){

                if(min > arr[j]){
                    min = arr[j]; // 1
                    minIndex = j; // 3
                }
            }
            int temp = arr[i]; // 5
            arr[i] = min; // 1
            arr[minIndex] = temp; // 5
        }


        System.out.println(Arrays.toString(arr));

    }
}
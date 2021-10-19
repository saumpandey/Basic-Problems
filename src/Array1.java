import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    Scanner sc = new Scanner(System.in);
    public void array1(int[] arr, int N){
        int temp = 1;
        int x = 0 , y = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[x++] = temp++;
            else
                arr[y--] = temp++;

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public void zero_at_end(int arr[]){
        int temp = 0 ;
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public void rotate_array(int arr[] , int d) {
        while (d > 0) {
            int temp = 0;
            temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
            d--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int second_largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
    public void binary_search( int arr[] ){
        Arrays.sort(arr );
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int start = 0 ;
        int end = arr.length - 1;
        int mid  = 0;
        while (start <= end){
            mid = (start+end)/2;
            if (element == arr[mid]) {
                System.out.println("element founded");
                break;
            }
            else {
                if (element > arr[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
    }

    public void selection_sort(int arr[]) {
        int min_value = 999999;
        int min_index = 0 ;
        int temp1 = 0 ;
        int temp = 0;
        while (temp < arr.length  ) {
            for (int i = temp; i < arr.length; i++) {
                if (arr[i] < min_value)
                    min_value = arr[i];
                    min_index = i;
            }
            temp1 = arr[temp];
            arr[temp] = arr[min_index];
            arr[min_index] = temp1;
            temp++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        Array1 ob = new Array1();
         ob.array1(arr,n);
       // ob.zero_at_end(arr);
       // ob.rotate_array(arr,2);
       int second_largest = second_largest(arr);
      //  System.out.println(second_largest);
       // ob.binary_search(arr);
      //  ob.selection_sort(arr);
    }
}

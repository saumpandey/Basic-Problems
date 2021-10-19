import java.util.Scanner;

public class find_unique_inarray {
    public static int unique(int[] arr){
        int temp = 0;
        int number = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i] == arr[j])
                    temp++;
            }
            if (temp == 1) {
                number = arr[i];
                break;
            }
            else
                temp = 0;
        }
        return number;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6};
        int temp = unique(arr);
        System.out.println(temp);
    }
}

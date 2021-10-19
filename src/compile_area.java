import java.util.Scanner;
public class compile_area {
    public static int[] sums(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target ){
                    return new  int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[1000000];
        for(int i = 0 ; i < nums.length ;i++){
            nums[i] = sc.nextInt() ;
        }
        int target = sc.nextInt();
        sums(nums , target);
    }
}
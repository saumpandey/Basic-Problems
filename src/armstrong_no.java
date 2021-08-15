import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 , temp = 0 ;
        int k = n;
        while (n > 0){
            temp = n/10 ;
            n = n/10;
            sum = temp*temp*temp + sum ;
        }
        if (sum == k)
            System.out.println("armstrong no.");
        else
            System.out.println("not");
    }
}

import java.util.Scanner;

public class reverse_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
     /*   String length = Double.toString(n);
        System.out.println(length);
        int i = 0;
        while (n > 0){
            int temp = n % 10;
            n = n/10;
            i = temp + i*10;
        }
        System.out.println("the reverse no. is::" + i); */
        System.out.println("enter power" );
        int power = sc.nextInt();
        int sum = n ;
        while (power > 1){
            sum = sum * n;
            power--;
        }
        System.out.println("answer :: " + sum);
    }
}// 4000 + 300 + 20 + 1
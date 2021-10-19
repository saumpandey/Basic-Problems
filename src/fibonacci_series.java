import javax.script.ScriptContext;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int sum = 0;
        System.out.print(x+" " + y +" ");
        while (sum <= n){
            sum = x + y;
            System.out.print(sum +" ");
            x = y;
            y = sum ;
        }
    }
}
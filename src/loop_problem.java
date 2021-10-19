import java.util.Scanner;

public class loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 3N + 2
        for (int i = 1; i <= N; i++) {
            if ((3*i+2) % 4 != 0){
                System.out.print( 3*i+2 + " ");
            }
        }
    }
}

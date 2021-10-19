public class recursion {
    public static int power(int number, int power){
        if (power == 0)
            return 1;
        int solution = number * power(number,--power);
        return solution;
    }
    public static void natural_no(int n ){
        if (n==0)
            return;
        else {
            natural_no(--n);
            System.out.print(n+1);
        }
    }
    public static int count_no_digits(int n){
        int i = 0;
        if (n == 0)
            return 0;
        else
            return 1 + count_no_digits(n/10);
    }
    public static int factorial(int n){
        if (n == 0)
            return 1;
        else{
            int solution = n * factorial(n-1);
            return solution;
        }
    }
    public static void fibbonacci(int n){
        int x = 0;
        int y = 1;
        int sum = 0;
        System.out.print(x + y);
        for ( int i = 1; y < n; i++) {
            sum = x + y;
            System.out.print(sum);
            x = y ;
            y = sum;
        }
    }

    public static void main(String[] args) {
        int solution = power(5,4);
//        System.out.println(solution);
//        natural_no(8);
       int count = count_no_digits(100282);
        System.out.println(count);
        int fact = factorial(5);
        System.out.println(fact);
        fibbonacci(8);
    }
}

public class strong_no {
    public int factorial(int k){
        int i = 1;
        int sum = 0;
        while (i < k){
            if(k % i == 0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
    public void strongno(int n){
        int i = n ;
        int sum1 = 0;
        int temp = 0;
        while (n > 0){
             temp = n % 10;
             n = n/10;
            sum1 = sum1 + factorial(temp);
        }
        if (sum1 == i){
            System.out.println("strong no.");
        }
        else
            System.out.println("not strong no.");
    }
    public static void main(String[] args) {
        strong_no sc = new strong_no();
        sc.strongno(145);
    }
}

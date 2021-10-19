import java.util.Scanner;

public class salary_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary");
        double basic_salary = sc.nextDouble();
        System.out.println("enter grade");
        char grade = sc.next().charAt(0);
        double total_salary = 0 ;
        double hra =  (0.2 * basic_salary);
        double da = 0.5 * basic_salary;
        double pf = 0.11 * basic_salary;
        double allo = 0 ;
        if (grade == 'A')
            allo = 1700 ;
        else if (grade == 'B')
            allo = 1500 ;
        else
            allo = 1300 ;

        System.out.println(hra + " da :"+da);
        total_salary = basic_salary + hra + da + allo - pf ;
        System.out.println("total salary is :: " + total_salary);
    }
}

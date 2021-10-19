import java.util.Scanner;

public class count_no_of_ords {
    public static int count(String s){
        int temp = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                temp++;
        }
        return temp;
    }
    public static boolean ispallindrome(String s){
        boolean response = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1))
                response = true;
            else
                response = false;
        }
        return response;
    }
    public static void all_substrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() ; j++) {
                System.out.print(s.charAt(s.length() - i - 1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        //   int temp = count(sc.nextLine());
        //   System.out.println(temp);
        boolean response = ispallindrome("kanak");
        System.out.println(response);
        all_substrings("maniya");
    }
}

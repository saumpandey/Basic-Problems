import java.util.Scanner;

public class pallindrome {
    public static void all_subStrings(String s){
        for (int i = 0; i < s.length(); i++) {
            int end = i;
            while (end < s.length()){
                System.out.println(s.substring(i,end+1));
                end += 1;
            }
       }
    }
    public static void reverse_words(String s) {
        String str ="";
        String[] sr = s.split(" ");
        for (int i = 0; i < sr.length; i++) {
            System.out.print(sr[i] +" ");
        }
        System.out.println();
        for (int i = sr.length - 1 ; i >= 0; i--) {
            System.out.print(sr[i] + " ");
        }
    }
    public static void check_permutations(String s1 , String s2){
        int temp = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j))
                    temp++;
            }
        }
        if (temp == s1.length())
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void remove_consecutive_char(String s){
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i+1)){
            }
        }
        System.out.println(s);
    }
    public static void reverse_each_word(String s){
        String s1[] = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String s2[] = s1[i].split("");
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                System.out.print(s1[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public  static void most_occuring(String s){
        int max = -99999;
        char x = 'b';
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    temp++;
                }
                if (temp > max) {
                    max = temp;
                    x = s.charAt(j);
                }
            }
        }
        System.out.println(x +" "+ max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String sentence , temp;
//         sentence = sc.nextLine();
//        StringBuilder sb = new StringBuilder(sentence);
//        temp = sb.reverse().toString();
//        if (temp.equals(sentence))
//            System.out.println("string is pallindrome");
//        else
//            System.out.println("not pallindrome");
//        all_subStrings("xyz");
        reverse_words("saum is doing it wrong");
        System.out.println();
        check_permutations("aaabbccdbcdd","aaabbbcccddd");
        reverse_each_word("is it the right method");
        System.out.println();
        most_occuring("saum pandey loves sansu");
    }
}

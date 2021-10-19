import java.util.Scanner;
import java.util.Stack;

public class LCM {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void insert(int x){
        s1.push(x);
    }
    public void reverse_stack(){
        if (s1.isEmpty())
            System.out.println("Now our satck is empty");
        else{
          int x =  s2.push(s1.pop());
            System.out.println(x);
            reverse_stack();
        }
    }

    public static void main(String[] args) {
        LCM ob = new LCM();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.reverse_stack();
    }
}
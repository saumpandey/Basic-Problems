import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class sorting_stack {
  public static   Stack<Integer> stack = new Stack<>();
    public void sorting(){
        int top = -1;
        int[] arr = new int[stack.size()];
        while (!stack.isEmpty()){
            arr[++top] = stack.peek();
            stack.pop();
        }
        Arrays.sort(arr);
        top = 0 ;
        while (top < arr.length){
            stack.push(arr[top++]);
        }
    }
    public void printing_our_stack(){
        if (stack.isEmpty())
            System.out.println("stack underflow");
        else {
            int x = stack.peek();
            System.out.println(x);
            stack.pop();
            printing_our_stack();
        }
    }
    public static void main(String[] args){
        sorting_stack obj = new sorting_stack();
        stack.push(-5);
        stack.push(-35);
        stack.push(1);
        stack.push(-7);
        stack.push(60);
        obj.sorting();
        obj.printing_our_stack();
    }
}
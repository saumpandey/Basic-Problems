import java.util.Stack;

public class operations_on_middle {
   static Stack<Integer> s1 = new Stack<>();
   static Stack<Integer> s2 = new Stack<>();
    int count = 0 ;
    public int length(){
        while (!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
            count++;
        }
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return count;
    }
    public void find_middle(){
        int i = 0;
        while (i < length()/2){
            s2.push(s1.peek());
            s1.pop();
        }
        System.out.println(s1.peek());
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }

    public static void main(String[] args) {
        operations_on_middle ob = new operations_on_middle();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        ob.find_middle();
    }
}
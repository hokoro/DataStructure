import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack_init = new Stack<Integer>();

        //데이터 push
        stack_init.push(1);
        stack_init.push(2);
        stack_init.push(3);

        System.out.println(stack_init);

        //데이터 pop
        stack_init.pop();
        System.out.println(stack_init);
        stack_init.pop();
        System.out.println(stack_init);
        stack_init.pop();
        System.out.println(stack_init);

    }
}

import java.util.ArrayList;

public class stack_init<T> {
    private ArrayList<T> stack = new ArrayList<T>();
    public void stackpush(T item){
        stack.add(item);
    }
    public T stackpop()
    {
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        stack_init<Integer> s = new stack_init<Integer>();
        s.stackpush(1);
        s.stackpush(2);
        s.stackpush(3);
        System.out.println(s.stackpop());
        System.out.println(s.stackpop());
        System.out.println(s.stackpop());
    }
}

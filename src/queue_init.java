import java.util.ArrayList;

public class queue_init<T> {
    private ArrayList<T> queue = new ArrayList<T>();
    public void enqueue(T item){
        queue.add(item);
    }
    public T dequeue()
    {
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public static void main(String[] args) {
       queue_init<Integer>q = new queue_init<Integer>();
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       System.out.println(q.dequeue());
       System.out.println(q.dequeue());
       System.out.println(q.dequeue());
    }
}

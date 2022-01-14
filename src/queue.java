import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer>queue_int = new LinkedList<Integer>();
        Queue<String>queue_str = new LinkedList<String>();
        Integer[] array_int = {1,2,3,4,5};


        //데이터 추가 add or offer
        queue_int.add(3);
        queue_int.add(4);
        queue_int.add(5);
        //offer 는 추가하고 성공 했으면 True 를 리턴한다
        System.out.println(queue_int.offer(4));

        //queue 구조는 Arrays 안쓰고 변수명으로 데이터를 볼수 있음
        System.out.println(queue_int);
        System.out.println(array_int);
        System.out.println(Arrays.toString(array_int));

        //queue 삭제 poll , remove
        queue_int.poll();
        System.out.println(queue_int);
        queue_int.remove();
        System.out.println(queue_int);
    }
}

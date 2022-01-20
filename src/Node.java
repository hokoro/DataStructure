//linked list 실습
public class Node<T> {
    //data 와 다음 객체를 가르키는 next 가 있음
    T data;
    Node<T> next = null;
    //node 의 head 부분
    Node<T> head = null;

    //Node 의 생성자 만들기
    public Node(T data){
        this.data = data;
    }



    public void addNode(T data){
        //head 가 비어 있을떄는 맨 처음 데이터 이므로 해당 데이터를 node 에 집어 넣는다
        if(head == null){
            head = new Node<T>(data);
        }
        //head 가 null 이 아닐때에는 기존에 있는 데이터를 head 로 설정하고 다음 노드를 next 로 설정
        else{
            Node<T>node = this.head;
            //그 다음 노드가 존재 할때 즉 node.next 가 null 이면 노드의 맨 마지막인 것을 알수 가있다.
            while(node.next != null){
                next = node.next;
            }
            //node 연결
            node.next = new Node<T>(data);
        }

    }
    // data 출력 메소드
    public void printAll(){
        //head 가 null 이 아닌지 체크
        if(head != null){
            //시작 노드 설정
            Node<T>node = this.head;
            //head 의 데이터 출력
            System.out.println(node.data);
            //node 의 다음주소가 null = linkedlist final 이기 때문에 아닌경우만 생각해서 다음 노드를 계속 출력하는 구도
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }


    public static void main(String[] args) {
        //node 두개 만들어 보기
        Node<Integer> node1= new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);

        //node 와 node 끼리 연결
        node1.next = node2;
        //node 의 head 설정 head 라는 객체를 만들어서 node1 을 헤드로 설정
        Node head = node1;

        //single linked list test
        Node<Integer> node3= new Node<Integer>(1);
        node3.addNode(4);
        node3.addNode(5);
        node3.addNode(6);
        //data print
        node1.printAll();





    }
}


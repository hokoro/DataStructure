import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        Integer [] data_list = new Integer[10];
        Integer [] data_list1 = {1,2,3,4,5};
        Integer data_list2[] = {5,4,3,2,1};
        System.out.println(data_list2[0]);
        // Arrays 를 동해 배열 의 전체 데이터 를 출력할수 있다
        System.out.println(data_list1);
        System.out.println(Arrays.toString(data_list1));
        System.out.println(data_list2);
        System.out.println(Arrays.toString(data_list2));


        //List 와 ArrayList
        //1. List 형태로 선언 하면 중간에 ArrayList 건 LinkedList 건 변경 가능
        List<Integer>list1 = new ArrayList<Integer>();
        list1 = new LinkedList<Integer>();

        //2.but 선언을 List 형태로 하면 중간에 변경 할수가 없음
        ArrayList<Integer>list2 = new ArrayList<Integer>();
        //list2 = new LinkedList<Integer>(); -> 에러 납니다

        //3.자료형을 지정 안하는 경우
        ArrayList<Integer>list3 = new ArrayList<>();

        //4.정석으로 쓸 표현
        ArrayList<Integer>list4=new ArrayList<Integer>();


        //list 배열 추가(add) , 배열 정보 출력(get)
        //add 로 배열 에 원소 추가
        list4.add(1);
        list4.add(2);
        //get(index) index 원소에 해당하는 정보 출력
        System.out.println(list4.get(0));
        //특정 index 원소 세팅 set
        list4.set(0,5);
        System.out.println(list4.get(0));
        //원소 제거 remove 해당 index 원소를 제거하면 뒤에서부터 하나씩 땡겨짐
        list4.remove(0);
        System.out.println(list4.get(0));
        //배열 길이 측정 list.size
        System.out.println(list4.size());
        list4.add(5);
        list4.add(6);
        list4.add(7);
        list4.add(8);
        System.out.println(list4.size());

        //2차원 배열
        Integer [][] list5 = {
                {1,2,3},
                {4,5,6}
        };

        //3차원 배열
        Integer[][][] list6 = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };

        // 3차원 배열 8,10,2 출력
        System.out.println(list6[1][0][1]);
        System.out.println(list6[1][1][0]);
        System.out.println(list6[0][0][1]);

        //문자열 list 에서 대문자 M 이 몇개 있는 지 확인
        String []list7 = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };
        Integer count = 0;
        for(int i = 0; i<list7.length; i++){
            if(list7[i].indexOf("M")>0)
            {
                count +=1;
            }
        }
        System.out.println(count);


    }
}

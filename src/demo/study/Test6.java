package demo.study;


import demo.algorithm.map_.Entry;
import demo.customerdata.Member;
import org.boon.core.Sys;
import org.yaml.snakeyaml.events.MappingEndEvent;
import java.util.*;
import java.util.stream.Stream;

enum Pagenation{
    PAGE_SIZE(8);

    private final int pageSzie;
    Pagenation(int pageSzie){
        this.pageSzie = pageSzie;
    }

    public int getPageSzie() {
        return pageSzie;
    }
}

public class Test6 {


    boolean nextBlock, prevNext;                                          // 권한
    int currentPage;                                                      // 현재 페이지
    int currentBlock;                                                     // 현재 페이지가 속한 블럭
    int totalPageCount;                                                   // 전체 페이지 갯수
    int pageSize = Pagenation.PAGE_SIZE.getPageSzie();                    // 한 블럭 당 페이지 개수

    int startBlockNumber = (currentBlock * pageSize)-7;                   // 블럭 start number
    int endBlockNumber;                                                   // 마지막 페이지일 경우, 아닐 경우
    int currentPageNumberInBlock = (currentPage - startBlockNumber) +1;   // 블럭 위치
    int totalBlockCount = (int)((double) totalPageCount/pageSize) +1;     // 전체 블럭 갯수






    // 가상의 맵에다가 저장을 하는거에요
    // 3.
    // "" null 3
    // 3-4-2-5-4






    String name;
    int number;
    int test ;
    private static int z = 4;

    Test6(String name, int number){
        this.name = name;
        this.number= number;
    }


    void print(){
        System.out.println("체크");
    }
    List<Person> list = new ArrayList<>();

    Map<String, Object> map = new HashMap<>();


    // 한 번에 해버리는 것도 나쁘지 않다.
    public int test(String id) {
        Optional<String> checkId = Optional.ofNullable(id);
        if (checkId.isPresent()) {
            list.stream().filter(Person->Person.getName().contains(checkId.get()));
            return list.stream().anyMatch(Person -> Person.getName().equals(checkId.get())) ? 1 : 0;
        }
        return 2;
    }


    public int test2(String id) {
        Optional<String> checkId = Optional.ofNullable(id);
        if (checkId.isPresent()) {
            return list.stream().anyMatch(Person -> Person.getName().equals(checkId.get())) ? 1 : 0;
        }
        return 2;
    }



    public int checkPassword(String password) {
        Optional<String> checker = Optional.ofNullable(password);
        if (checker.isPresent()) {
            return (list.stream().anyMatch(Person -> Person.getName().equals(checker.get()))) ? 1 : 0;
        }
        return 2;
    }




    public static void main(String args []){
        Map<String, String> m = new HashMap<>();
        m.put("윤지연", "루비");
        m.put("정가은", "다이아몬드");
        m.put("김가영", "오팔");
        m.put("심민정", "흑진주");
        m.put("서은비", "진주");


        List<Person> list = new ArrayList<>();
        list.add(new Person("김지원", 26));
        list.add(new Person("나지원", 27));
        list.add(new Person("홍지원", 30));
        list.add(new Person("윤지원", 26));
        list.add(new Person("연지원", 32));
        list.add(new Person("라지원", 23));
        list.add(new Person("마지원", 27));

        list.stream().filter(Person->Person.age>30).sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        list.stream().filter(Person->Person.age>30).sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
        list.stream().filter(Person->Person.getName().equals("라지원")).sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);




    }
}

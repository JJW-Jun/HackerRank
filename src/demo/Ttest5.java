package demo;


import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

class Player5 {

    public static LocalDate now(Clock clock){
        return now(Clock.systemDefaultZone());
    }

    public String checkPresentId(String name){
        Optional<String> checker = Optional.ofNullable(name);
        if (checker.isPresent()) {
            return "test".equals(checker.get()) ? "FAILURE" : "SUCCESS";
        }
        return "SUCCESS";
    }





    public String checkId(String id){
        Optional<String> checker = Optional.ofNullable(id);
        if(checker.isPresent()){

        }
        return "d";
    }






    public static void main(String args []){
        final int a = 5;


        Map<String, Object> map = new HashMap<>();
        Person p = new Person("김가은", 20, 170);
        Person p1 = new Person("나경은", 25, 165);
        Person p2 = new Person("라미란", 32, 164);
        Person p3 = new Person("변자영", 32, 163);
        Person p4 = new Person("정가은", 32, 155);
        Person p5 = new Person("금정원", 32, 166);
        Person p6 = new Person("정혜주", 32, 152);
        map.put("김가은", p);
        map.put("나경은", p1);
        map.put("라미란", p2);
        map.put("변자영", p3);
        map.put("정가은", p4);
        map.put("금정원", p5);
        map.put("정혜주", p6);
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
//        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//        messageDigest.reset();




//        IntSummaryStatistics intStream = personList.stream().collect(Collectors.summarizingInt(Person::getAge));
//        intStream.getCount();
//
//
//
//
//       int sum;
//        List intList = Arrays.asList(1,2,3,4,5);
//        sum = intList.stream().mapToInt(value -> (int) value).sum();


        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2019, 10, 23);
        LocalDate localDate2 = localDate1.with(localDate.getMonth());
        System.out.println(localDate2.getMonth());
        Month february = Month.of(2);
        YearMonth date = YearMonth.of(1991, 3);
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.plusMonths(13));
//        MonthDay monthDay = MonthDay.of(3, 32);
//        System.out.println(monthDay);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String year = "2019";
        String month = "03";
        String day = "14";

        String input = year+" "+month+" "+day;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date1 = LocalDate.parse(input, formatter);



//        System.out.println(localDate1);
//        System.out.println(localDate);







    }



    // 메서드는 선언부만 알면 호출가능하므로 추상메서드도 호출 가능.

    // 상속해서 완성했을 때 호출가능



//
//    // 미완성 메서드를 가지고 있는 클래스
//    abstract void play(int pos);
//    abstract void stop();
//
//    // 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
//    // ex) Player p = new Player();
//}
//
//
//class AudioPlayer extends Player{
//    // 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가
//    void play(int pos){
//
//    }
//
//    void stop(){}
//
//    // 객체 생성 가능.
//    AudioPlayer ap =  new AudioPlayer();
//
//
//    // 미완성 메서드 : 구현부(몸통{}가 없는 메서드
//    // 주석을 통해 어떤 기능을 수행할 목적으로 만들었는지 설명한다 : 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
//
//}
//
//// 둘 다 메서드 붙이거나 앞에 추상메서드 적거나
//// 일부만 구현햏도 되고. 그때는 abstract를 써 줘야 한다.
//class AbstractPlayer extends Player{
//    void play(int pos){}
//
//    @Override
//    void stop() {
//
//    }
}

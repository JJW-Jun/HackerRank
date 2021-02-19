package demo;


import demo.customerdata.Member;

import javax.swing.text.html.Option;
import java.net.Authenticator;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;

class Player5 {

    public static LocalDate now(Clock clock) {
        return now(Clock.systemDefaultZone());
    }
        public static void main(String args []){
            // 제목 + 내용
            // 공백이면 한 글자 이상 입력해주세요.
            // 글 작성에 제목을 작성해주세요.
            // 일정 글자 넘어가면 일정 글자 이하로 입력해주세요.
            // 로그인이었으면 이미 있는 아이디입니다.
            // 작성자 검색
            // 최신순
            // 평점 부여기능(소숫점 둘째짜리)
            // 제품 추가
            // 리스트에 띄우고
            // 정보 수정하고
            // 검색은 없ㅅ고
            //

            List<String> a = Arrays.asList("zz", "bb", "cc", "fc");
            a.contains("a");
            String regx = "[a-z]";
            Pattern pattern = Pattern.compile(regx);
            for (int i = 0; i < a.size(); i++) {
                System.out.println(pattern.matcher(a.get(0)).matches());
            }
            System.out.println(a.contains("a"));

        }



































    enum Messenger{
        SUCCESS, FAILURE
    }

//    final Map<String,Object> hashMap;

    Player5 (){}
//
//    public Map<String,Object> findById(String id){
//        Optional<String> checkNullMember = Optional.ofNullable(id);
//        hashMap.clear();
//        hashMap.put("RESULT", (checkNullMember.isPresent()) ? Messenger.SUCCESS : Messenger.FAILURE); // Messenger 은 Enum
//        return hashMap;
//    }

    Function<String, Object> nullChecker = x->Optional.ofNullable(x);




}
    // 1-2.비밀번호 체크

//    List<Person> al = new List<Person>();
//
//    public void test() {
//        List<?> items = new ArrayList<>();
//        for (String item : items) {
//
//        }
//    }

    // 제네릭이 되면 T타입으로 하면 T하면 이 자리에다가
    // 확장성 면에서 구리다.
    // 람다 자체가 단일성.

//    Function<String, Object> nullChecker = x -> Optional.ofNullable(x);
//
//    public String checkId2(String id) {
//        if (nullChecker.apply(id).isPresent()) {
//            return l.stream().anyMatch(Person -> Person.getName()
//                    .contains(nullChecker.apply(id).get())) ? "ok" : "no";
//        }
//        return "올바른 회원을 입력하세요";
//    }
//
//
//    Map map = new HashMap<>();

////     2-2.비밀번호 체크
//    public Map<String, Object> checkPassword(String password) {
//        Optional<String> passwordNullChecker = Optional.ofNullable(password);
//        if (passwordNullChecker.isPresent()) {
//            return map;
//        }
//    }}
    // 2-1.아이디 체크
//    public Map<String, Object> checkId(String password){
//        Optional<String> passwordNullChecker = Optional.ofNullable(password);
//        if(passwordNullChecker.isPresent()){
//            return
//        }
//
//    }

    // 들어오는 값을 널체크를 하고 그냥 같은지 비교해서 문자를 리턴하는 건데 음.. 조금 저질코드같아요 느낌상
    // 변경에 유연하려면 캡슈ㅜㄹ화로 싸야하는데 캡슐화가아니라 값이 다이렉트로 들어와서





//      void npe () throws NullPointerException, ArithmeticException {
//          System.out.println("NPE");
//
//    }
//
//    void trow(int number){
//        try {
//            if (number == 0) {
//                throw new ArithmeticException("Can't by zero");
//            } else {
//                System.out.println("Good");
//            }
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }
//    }






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


//        LocalDate localDate = LocalDate.now();
//        LocalDate localDate1 = LocalDate.of(2019, 10, 23);
//        LocalDate localDate2 = localDate1.with(localDate.getMonth());
//        System.out.println(localDate2.getMonth());
//        Month february = Month.of(2);
//        YearMonth date = YearMonth.of(1991, 3);
//        YearMonth yearMonth = YearMonth.now();
//        System.out.println(yearMonth.plusMonths(13));
//
//
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localDate);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        String year = "2019";
//        String month = "03";
//        String day = "14";
//
//        String input = year + " " + month + " " + day;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//        LocalDate date1 = LocalDate.parse(input, formatter);



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


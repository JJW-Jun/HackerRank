package demo.customerdata;


import demo.book.javainaction.chapter11.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.hamcrest.CoreMatchers.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class TestCode {
    public static void main(String args []){

    }

    /**
    GenderGenerator(성별생성기) : 성별 생성 메서드
        - manGenerator : 남자 생성
        - womanGenerator : 여자 생성
        - randomGenerator : 무작위 생성
    */

    private static List<Person> storage;
    static Random random = new Random();
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();

    // 에러와 오류의 차이
//    @Test
//    public void 테스트() throws Exception{
//        String k = null;
//        assertThat("a", is(k.getClass().getName()));
//
//        String a = "b";
//        assertThat(a, is("c"));
//    }
//
    @BeforeAll
    static void 시작메시지_testStartMessage() {
        // TEST_CODE_001
        System.out.println("\"Let's start the test!\"");
        LocalDateTime start = LocalDateTime.now();
        storage = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            Person person = new Person();
            person.setName(String.format("person%s", i));
            person.setAge(random.nextInt(30) + 20);
            storage.add(person);
        }
        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.getSeconds());


    }


    @Test
    void 직렬스트림_속도테스트_streamSpeedTest() {
        // TEST_CODE_002
        Instant startTime = Instant.now();
        for (int k = 0; k < 10; k++) {
            Long start = System.currentTimeMillis();

            IntStream intStream = storage.stream().filter(Person -> Person.getAge() < 30).mapToInt(Person::getAge);
            int result = (int) intStream.count();

            Long end = System.currentTimeMillis();
            System.out.println("    Stream test: " + (end - start) + ",  result: " + result);
        }


    }
//
//
    @Test
    void for_속도_테스트_streamSpeedTest() {
        // TEST_CODE_003

        for (int k = 0; k < 10; k++) {
            int count = 0;
            Long start = System.currentTimeMillis();

            for (int j = 0; j < 10000000; j++) {
                if (storage.get(j).getAge() < 30) {
                    ++count;
                }
            }

            Long end = System.currentTimeMillis();
            System.out.println("    for문 test: " + (end - start) + ",  result: " + count);
        }
    }
//
//
//    @Test
//    void 병렬스트림_속도_테스트_streamSpeedTest() {
//        // TEST_CODE_004
//
//        for (int k = 0; k < 10; k++) {
//            Long start = System.currentTimeMillis();
//
//            IntStream intStream = storage.stream().parallel()
//                    .filter(Person -> Person.getAge() < 30).mapToInt(Person::getAge);
//            int result = (int) intStream.parallel().count();
//
//            Long end = System.currentTimeMillis();
//            System.out.println("    Stream 병렬 1처test: " + (end - start) + ",  result: " + result);
//        }
//    }
//
//
//    @Test
//    void 병렬1스트림_속도_테스트_streamSpeedTest() {
//        //
//        for (int k = 0; k < 10; k++) {
//            Long start = System.currentTimeMillis();
//
//            int result = (int) storage.stream().parallel()
//                    .filter(Person -> Person.getAge() < 30).mapToInt(Person::getAge).count();
//
//            Long end = System.currentTimeMillis();
//            System.out.println("    Stream test: " + (end - start) + ",  result: " + result);
//        }
//    }
//
//
//    @Test
//    void 중복체크_테스트_streamSpeedTest() {
//        // TEST_CODE
//        Long start = System.currentTimeMillis();
//
//        Optional<String> idNullCheck = Optional.ofNullable("person9999999");
//        storage.stream().parallel().anyMatch(Person -> Person.getName().equals(idNullCheck.get()));
//
//        Long end = System.currentTimeMillis();
//        System.out.println("    stream result: " + (end - start));
//    }
//
//
//    @Test
//    void 중복체크_for문_테스트_streamSpeedTest() {
//
//        Long start = System.currentTimeMillis();
//
//        Optional<String> idNullCheck = Optional.ofNullable("person9999999");
//        for (int i = 0; i < 10000000; i++) {
//            if (storage.get(i).getName().equals("person99999999")) {
//                System.out.println("Find!");
//            }
//        }
//
//        Long end = System.currentTimeMillis();
//        System.out.println("    for문 : result: " + (end - start));
//    }
//
//
//    @AfterAll
//    static void 테스트종료메시지_testEndMessage() {
//        System.out.println("\"Test code verification complete\n\n\"");
//    }
//
//
//    @Test
//    void 남자생성_manGenerator() {
//        // CODE_001 : 내가 입력한 number(1)와 result(1)이 같은 값인지 알아보는 테스트
////        String man = Gender.MAN.getGender();
////
////        String result = "남자";
////
////        assertThat(man, equalTo(result));
//    }
//
//
//    @Test
//    void 여자생성_womanGenerator() {
//        // CODE_002
//        System.out.println("CODE_002");
//
//    }
//
//    @Test
//    void 무작위_성별_생성_randomGenderGenerator() {
//        // CODE_003
//        String man = "남자";
//        String woman = "여자";
//        GenderGenerator genderGenerator = new GenderGenerator();
//        String result = genderGenerator.randomGenderGenerator();
//
//        System.out.println("CODE_003");
//    }
//
//
//    /**
//     * CityGenerator(거주지 생성기) : 거주지역 생성 메서드
//     * - CityType : 행정구역
//     * - CityName : 도시명 (행정구역 별 도시 선택)
//     * - randomCitySelectCheck : 무작위 도시 생성
//     */
//    @Test
//    void 도시명_참조_cityGenerator(){
//        // CODE_004
//    }
//
////    @Test
////    void 행정구역별_도시참조_연관데이터_(){
////        // CODE_005
////        System.out.println("광역시는:"+ CityType.SPECIAL_CITY.getCityNameList().get(0).getKoreanCityName()+"입니다.");
////        assertTrue(CityName.SEOUL.getKoreanCityName().equals
////                (CityType.SPECIAL_CITY.getCityNameList().get(0).getKoreanCityName()));
////    }
//
//
//    @Test
//    void 무작위_지역_생성_randomCitySelectCheck() {
//        // CODE_006
//        CityGenerator cityGenerator = new CityGenerator();
//        List<String> koreaCities = Arrays.asList("서울", "부산", "대구", "인천", "제주", "광주", "대전", "울산", "세종", "경기도",
//                "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주도");
//
//
//
//        assertTrue(koreaCities.contains("서울"));
//        System.out.println("TEST_06");
//    }
//
//
//    @Test
//    void nullChecker(){
//        // CODE_007
//        List<String> stringNullChecker = Arrays.asList("HanNA", "SoHyuen", "DoYoon");
//        System.out.println("CODE_007");
//
//
//    }

}
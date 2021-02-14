//package demo.customerdata.personaldata;
//
//import demo.book.javainaction.chapter11.Person;
//import org.apache.commons.lang.time.StopWatch;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.openjdk.jmh.annotations.Benchmark;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.MatcherAssert.*;
//
//
//
//class CityGeneratorTest {
//    Map<String, Object> storage;
//    StopWatch stopWatch;
//    Random random = new Random();
//
//    @Test @BeforeAll
//    void testCase(){
//
//        stopWatch.start();
//        storage = new HashMap<>();
//        for (int i=0; i<1000000; i++) {
//            Person person = new Person();
//            person.setName(String.format("person%s", i));
//            person.setAge(random.nextInt(30)+10);
//        }
//        stopWatch.stop();
//
//
//    }
//
//
//    @Test
//    void test(){
//
//    }
//
//
//
//
//
//}
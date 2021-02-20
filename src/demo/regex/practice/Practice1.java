package demo.regex.practice;

import demo.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practice1 {
    public boolean checkId(String email) {
        Optional<String> checkEmail = Optional.ofNullable(email);
        if (checkEmail.isPresent()) {
            String reg2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
            return Pattern.compile(reg2).matcher(checkEmail.get()).matches();
        }
        return false;
    }


    public static void main(String args[]) {
        String reg = "[\\d+]";
        String reg1 = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        String reg2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";


        /**
         1. 이메일 형식 체크
         String regex = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";

         2. 숫자만 입력 체크
         String regex = "^[0-9]+$";  // 정수형만 체크
         String regex = "^[+-]?\\d*(\\.?\\d*)$";  //실수형까지 체크

         3. 아이디 형식 체크
         String regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$";
         예) 시작은 영문으로만, '_'를 제외한 특수문자 안되며 영문, 숫자, '_'으로만 이루어진 5 ~ 12자 이하


         4. HTML 걷어내기

         String regex = "<(\\/)?[^>]+>";
         */


        // 정수형 체크
        String reg3 = "^[0-9]+$";
        String ff = "\\d{6}+\\d";
//        String emailChecker = "\\w+@\\w+.\\";
        String emailChecker = "^\\w+@\\w+.\\";
        String englishAlph = "^[a-zA-Z]*$";
        String number = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
        String phoneNumber = "^01[0-9]-\\d{3,4}-\\d{4}$";
        String iHaveNoIdea = "[a-z0-9]";
        String slash = "\\\\";

        String blankOverTwo = "\\s{2,}";

        String blank = "";
        System.out.println("blank:" + blank);

        System.out.println(slash);

        Pattern pattern = Pattern.compile(phoneNumber);
        System.out.println("전화번호:" + pattern.matcher("010-4059-3401").matches());
        System.out.println(pattern.matcher("g").matches() + "This");
        System.out.println(pattern.matcher("jj9w1@naver.com").matches());
        System.out.println(pattern.matcher("4").matches());

        System.out.println("-------------------");


        // stream 정규표현식
        // https://howtodoinjava.com/java8/regex-predicate-using-pattern-compile/
        // https://www.geeksforgeeks.org/regular-expressions-in-java/
        // https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

        List<Customer> personList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName("금정원");
        customer.setDatee(String.format("%s", (LocalDate.of(2010, 10, 11))));
        personList.add(customer);

        Customer customer1 = new Customer();
        customer1.setName("가은선");
        customer1.setDatee(String.format("%s", (LocalDate.of(2070, 10, 11))));
        personList.add(customer1);

        Customer customer2 = new Customer();
        customer2.setName("정가은");
        customer2.setDatee(String.format("%s", (LocalDate.of(2017, 10, 11))));
        personList.add(customer2);

        Customer customer3 = new Customer();
        customer3.setName("윤가은");
        customer3.setDatee(String.format("%s", (LocalDate.of(2010, 8, 11))));
        personList.add(customer3);

        Customer customer4 = new Customer();
        customer4.setName("정가은");
        customer4.setDatee(String.format("%s", (LocalDate.of(2043, 10, 11))));
        personList.add(customer4);

        // foreach의 경우 notnull 지정.
        personList.stream().sorted(Comparator.comparing(Customer::getDate)).forEach(System.out::println);
        System.out.println(customer.getDate().substring(0, 5));





        String city = "^[\\w\\s]+시$";
        Pattern pattern1 = Pattern.compile(city);
        System.out.println(pattern1.matcher("서울시").matches());

        System.out.println("--");


//        System.out.println("Here");
//        personList.stream().sorted(Comparator.comparing(Customer::getName))
//                .filter(Objects::).forEach(System.out::println);
//        System.out.println("End");


        String keyword = "정원";
        String search = String.format("\\%s+", keyword);
        Predicate<String> searchPattern = Pattern.compile(search).asPredicate();
        System.out.println("여 텧스트");
        System.out.println(searchPattern.test("가은이"));
        Pattern searchPattern1 = Pattern.compile(search);

        // 이름검색
        System.out.println("search name");
//        List<Customer> test22 = personList.stream().filter(Customer -> Customer.getName().contains("가은")).collect(Collectors.toList());
        List<Customer> test33 = personList.stream().filter(Customer->searchPattern.test(Customer.getName())).collect(Collectors.toList());

//        List<Customer> test33 = personList.stream().sorted(Comparator.comparing(Customer::getAge)).collect(Collectors.toList());
//        List test2 = personList.stream().filter(Person -> Person.getName().contains("가은")).collect(Collectors.toList());
        System.out.println("아놔 저새끼");
        for (int i = 0; i < test33.size(); i++) {
            System.out.println(test33.get(i).getName());
        }

        String citys = "^\\w+시$";
        Pattern pattern2 = Pattern.compile(citys);
        System.out.println(pattern1.matcher("서울시").matches());

        LocalDate localDateB = LocalDate.of(2010, 10, 30);
        System.out.println(localDateB);
        List<String> dateList = new ArrayList<>();


        Comparator<String> comparatorDate = Comparator.comparing(LocalDateTime::parse);
        System.out.println(comparatorDate+"이거");



        boolean localDate = LocalDate.now().isAfter(localDateB);
        System.out.println(localDate);



        // 바로 앞의 문자가 없거나 하나 이상
        String zeroOrOverOne = "ss+a";
        String dontCareCapital = "^[(?!)\\w]+\\b$";
        boolean captialChecker = Pattern.compile(dontCareCapital).matcher("This is").matches();
        System.out.println(captialChecker);





    }
}

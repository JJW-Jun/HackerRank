package demo.regex.practice;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practice2 {

    public List<Customer> search(String customer){
        String keyword = "가은";
        String searchRegex = String.format("^[가-힣\\s]{0,}[%s\\s]$", keyword);
        Predicate<String> searchPattern = Pattern.compile(searchRegex).asPredicate();
        return Collections.emptyList();
    }

    public static void main(String args []){
        //https://enzycut.tistory.com/entry/JAVA-%ED%8C%A8%EC%8A%A4%EC%9B%8C%EB%93%9C-%EC%A0%95%EA%B7%9C%EC%8B%9D-Regex
        // https://hee-kkk.tistory.com/22
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
        customer4.setName("김가은");
        customer4.setDatee(String.format("%s", (LocalDate.of(2043, 10, 11))));
        personList.add(customer4);



        String keyword = "가은";
        String search = "^[가-힣\\s]+";
        // *의 의미
        String searchEngine = String.format("^[가-힣\\s]?%s\\s[가-힣\\s]?$", keyword);
        Predicate<String> searchPattern = Pattern.compile(searchEngine).asPredicate();

        // 이름검색
        List<Customer> test33 = personList.stream()
                .filter(Customer->searchPattern.test(Customer.getName())).collect(Collectors.toList());

        System.out.println(test33.size());
        for (int i=0; i<test33.size(); i++){
            System.out.println(test33.get(i));
        }

//
//        String word = "금정원  ";
//        String reg = "^[가-힣\\s]+";
//        boolean result = Pattern.compile(reg).matcher(word).matches();
//        System.out.println(result);

    }
}

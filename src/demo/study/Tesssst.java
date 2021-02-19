package demo.study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

enum Message {
    SUCCESS("로그인에 성공하셨습니다."), FAILURE("로그인에 실패하셨습니다.");
    private final String message;

    Message(String message) {
        this.message = message;
    }

}

// 따로 검색 되도록
//
class Tesssst {


    public static void main(String args[]) {
        List<Product> lst = new ArrayList<>();
        Product product = new Product();
        product.setName("치약");
        lst.add(product);

        Product product1 = new Product();
        product1.setName("b");
        lst.add(product1);

        Product product2 = new Product();
        product2.setName("a");
        lst.add(product2);


        String regex = "[a-zA-Z]";
        List aaar = lst.stream().filter(Product -> Product.getName().matches(regex)).collect(Collectors.toList());
        for (int i = 0; i < aaar.size(); i++) {
            System.out.println(aaar.get(i));
        }


        String rege = "[a-z가-나]";
        boolean pattern = Pattern.compile(rege).matcher("다").matches();
        System.out.println(pattern);



        // 많이 검색한 키워드
        //


    }


}

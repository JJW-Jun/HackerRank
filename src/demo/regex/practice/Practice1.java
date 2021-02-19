package demo.regex.practice;

import java.util.Optional;
import java.util.regex.Pattern;

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
        String emailChecker = "\\w+@\\w+.\\";
        String englishAlph = "^[a-zA-Z]*$";
        Pattern pattern = Pattern.compile(englishAlph);
        System.out.println(pattern.matcher("g").matches()+"This");
        System.out.println(pattern.matcher("jj9w1@naver.com").matches());
        System.out.println(pattern.matcher("4").matches());
    }
}

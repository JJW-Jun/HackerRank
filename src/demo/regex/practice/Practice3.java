package demo.regex.practice;

import java.util.regex.Pattern;

public class Practice3 {
    public static void main(String args[]){
        String rex = "\\w";
        Pattern pattern = Pattern.compile(rex);
        boolean result = pattern.matcher("t").matches();


    }
}

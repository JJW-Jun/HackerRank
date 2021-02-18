package demo.customerdata;

import java.time.LocalDate;

public class Member {
    private String name;
    private String city;
    private String flowPath;
    private String gender;
    private String ages;
    private String a;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    void test() throws ArithmeticException{
        int  b = 0;;
        int a =100;
        System.out.println(a/b);


    }
    public static void main(String args []){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());



    }
}

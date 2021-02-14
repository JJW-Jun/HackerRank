package demo.study;

public class ExamplePure implements AbstTest{
    int number = 0;
    public void plusNumber(){
        number += 1;
    }


    public static void main(String args []){


    }

    @Override
    public void printName() {
        System.out.println("This is the Test");
    }
}

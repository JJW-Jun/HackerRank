package demo;


public class TestPractice {

    public static void main(String args []){
        Print printer = x -> x.length();
        System.out.println(printer.stringLength("채한나임소현이도윤"));

        TrueOrFalse trueOrFalse = x-> x<30;
        System.out.println(trueOrFalse.isThisTrue(20));


    }
}


interface Print{public int stringLength(String str);}
interface TrueOrFalse{public boolean isThisTrue(int i);}
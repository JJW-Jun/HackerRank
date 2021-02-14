package demo.customerdata;

import java.util.Scanner;
abstract class A{
    //
    // 본체가 있는 메서드는 abstract 키워드를 가질 수 없다.
//    추상 클래스 내에는 추상 메서드가아닌 메서드가 존재할 수 있다/
    // 추상클래스는 상속을 강제하기 위한 것. 즉, 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은
    // 이 멤버를 상속받은 하위 클래스의 책임으로 위임.
    public abstract int b();
    public void d(){
        System.out.println("aa");

    }
}
public class AbstractDemo {
    //abstract는 반드시 상속해서 상속해서 사용하도록 강제하는 것을 말한다.
//    A obj = new A();
    B obj = new B();

}
class B extends A{

    // 무조건 상속해야 한다.
    @Override
    public int b() {
        return 0;
    }
}











abstract class CalCulator{
    int left, right;
    public void seOprands(int left, int right){
        this.left =left;
        this.right= right;
    }

    // default 는 같은 패키지.
    int _sum(){
        return this.left+this.right;
    }

    public abstract void avg();

    // 순서에 대한 로직. 부모메서드가 가지고 있다. 하위가 알아서 강제하도록 틀만
   public void run(){
        sum();
        avg();
    }

class CalculatorDecoPlus extends CalCulator{

       // 반드시 상속해야 하는지?
    @Override
    public void avg() {

    }

    public void sum(){
           System.out.println("+"+this.left+this.right);
       }

}

    // 사용자가 직ㅈ버 디자인 해야하는 것들에 사
    public abstract void sum();
}


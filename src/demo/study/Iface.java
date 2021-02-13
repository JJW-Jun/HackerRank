package demo.study;

public interface Iface {

    static Iface getInstance(){
        return new A();
    }


     default void defaultMethod(){
        System.out.println("이건 구현 안 해도 된다.");
    }

}

class A implements Iface{



    public void test(){
        System.out.println("이게 된다고? ");
    }


//
//    @Override
//    public void calcurator(int first, int second, int third) {
//    }
//
//    @Override
//    public int sum() {
//        return 0;
//    }
//
//    @Override
//    public int avg() {
//        return 0;
//    }
}


    // abstract, final과 함께 대표적인 규제.
    // 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 메서드 구현해야 한다. 인터페이스에서 강제하고 있는 메서드를 구현하지 않으면
    // 컴파일도 ㅇㄴ도ㅚㅁ}

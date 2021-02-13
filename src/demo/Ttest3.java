package demo;

public class Ttest3 {

    // private으로 이렇게 지정하면 생성자를 반드시 만들어 줘야 한다.
    private final String a;
    private final String p;
    private final String l;
    private final String e;

    // 딱 이 생성자만 만들 수 있다. 왜?
    Ttest3 (String a, String p, String l, String e) {
        this.a = a;
        this.p = p;
        this.l = l;
        this.e = e ;
    }


    // 정확히 여기서 this가 가리키는게 무엇인지?
    public Ttest3 test(String a){

        return this;
    }


    public static void alphaTest(String str1, Ttest3 ttest3){
        System.out.println(ttest3.a+ttest3.p + ttest3.p+ ttest3.l+ttest3.e);
        Ttest3.alphaTest(str1, ttest3);
    }


    public static void main(String args []){


    }
}

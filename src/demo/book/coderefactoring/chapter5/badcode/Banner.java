package demo.book.coderefactoring.chapter5.badcode;

public class Banner {
    private final String _content;
    public Banner(String content){
        _content = content;
    }

    public void print(int times){
        System.out.println("+");
    }
}

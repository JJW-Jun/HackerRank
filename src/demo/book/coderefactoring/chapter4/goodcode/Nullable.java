package demo.book.coderefactoring.chapter4.goodcode;

public class Nullable extends LabelG{
    public Nullable() {
        super("(none)");
    }

    @Override public void display(){ }
    @Override public boolean isNull(){ return true; }
}

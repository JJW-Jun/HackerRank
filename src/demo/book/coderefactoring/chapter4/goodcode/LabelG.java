package demo.book.coderefactoring.chapter4.goodcode;

public class LabelG {
    private final String _label;
    public LabelG(String label){
        _label = label;
    }

    public void display(){ System.out.println("display: "+_label); }

    @Override
    public String toString() {
        return "LabelG{" +
                "_label='" + _label + '\'' +
                '}';
    }

    public boolean isNull(){ return false; }
}
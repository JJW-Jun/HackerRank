package demo.book.coderefactoring.chapter4.badcode;

public class LabelB {
    private final String _label;

    public LabelB(String label) {
        _label = label;
    }

    @Override
    public String toString() {
        return "LabelB{" +
                "_label='" + _label + '\'' +
                '}';
    }

    public void display() {
        System.out.println("dsplay: " + _label);
    }
}

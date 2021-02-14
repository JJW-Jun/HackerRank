package demo.book.coderefactoring.chapter4.goodcode;

public class PersonG {
    private final LabelG _name;
    private final LabelG _mail;

    public PersonG(LabelG name, LabelG mail) {
        _name = name;
        _mail = mail;
    }

    public PersonG(LabelG name) {
        this(name, new Nullable());
    }

    public void display() {
        _name.display();
        _mail.display();
    }

    @Override
    public String toString() {
        return "PersonG{" +
                "_name=" + _name +
                ", _mail=" + _mail +
                '}';
    }
}

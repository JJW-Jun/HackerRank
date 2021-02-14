package demo.book.coderefactoring.chapter4.badcode;

public class PersonB {
    private final LabelB _name;
    private final LabelB _mail;

    public PersonB(LabelB name, LabelB mail) {
        _name = name;
        _mail = mail;
    }

    public PersonB(LabelB name) {
        this(name, null);
    }

    public void display() {
        if (_name != null) {
            _name.display();
        }
        if (_mail != null) {
            _mail.display();
        }
    }

    public String toString() {
        String result = "[Person:";
        if (_name == null) {
            result += "\"(none)\"";
        } else {
            result += _name;
        }
        result += "mail=";
        if (_mail == null) {
            result += "\"(none)\"";
        } else {
            result += _mail;
        }
        result += "]";
        return result;
    }

}

package demo.book.coderefactoring.chapter2.badcode.others;

public class Something {
    private Object _value = null;
    public void set_value(Object value){
        if(_value != null) { throw new RuntimeException("value is already set"); }
        _value = value;
    }
}

class SomethingRefactoring{
    private final Object _value;
    public SomethingRefactoring(Object value){
        _value = value;
    }
}

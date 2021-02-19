package demo.study.generic.code;

public class GenericContainer<T> {
    private T element;


    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
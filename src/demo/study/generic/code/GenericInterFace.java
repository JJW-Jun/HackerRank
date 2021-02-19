package demo.study.generic.code;

public interface GenericInterFace<T1, T2> {
    T1 firstOperation(T2 t);
    T2 secondOperation(T1 t);
}

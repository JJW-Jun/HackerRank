package demo.study.generic.code;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void main(String args[]) {
        method01((Supplier<String> & Printable & Makeable & Movable) () -> "LichKing", t -> {
            System.out.println(t.print());
            System.out.println(t.make());
            System.out.println(t.move());
        });
    }

    public static <T extends Supplier<U>, U> void method01(T operator, Consumer<T> consumer) {
        consumer.accept(operator);
    }
}

interface Printable extends Supplier<String> {
    default String print() {
        return "Hello Printable " + get();
    }
}

interface Makeable extends Supplier<String> {
    default String make() {
        return "Hello Makeable ";
    }
}

interface Movable extends Supplier<String> {
    default String move() {
        return "Hello Movable ";
    }
}
package demo.study.generic.code;

import java.util.Optional;
import java.util.function.Function;

public class Box<T, R> {
    Function<String, Optional<String>> checker = x -> Optional.ofNullable(x);
}

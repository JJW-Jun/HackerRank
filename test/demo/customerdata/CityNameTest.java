package demo.customerdata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


class CityNameTest {

    @AfterEach
    @Test
    void print() {
        System.out.println("--------");
    }
    @Test
    void 테스트1_() {
        assertThat(1, is(22));
    }

    @Test
    void values() {
        System.out.println("통과!");
    }

    @Test
    void valueOf() {
    }
}
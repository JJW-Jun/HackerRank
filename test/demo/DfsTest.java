package demo;

import com.google.common.base.Stopwatch;
import org.apache.commons.lang.time.StopWatch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DfsTest {
    private StopWatch stopwatch;

    @BeforeAll
    void 초기화_init(){

    }

    @Test
    void bidirectionalPut() {


        int a=0;
        for (int i=0; i<500000; i++){
            ++a;
        }

        Long end = stopwatch.getSplitTime();

    }

    @Test
    void unidirectionalPut() {
    }
}
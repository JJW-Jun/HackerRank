package demo.customerdata;

import java.util.Arrays;
import java.util.List;


enum LeapYear{
    LEAP_YEAR, THE_NORMAL_YEAR;
}



enum DayGenerator {
    DECEMBER(12), JANUARY(1), FEBURARY(2),

    MARCH(3), APRIL(4), MAY(5),

    JUN(6), JULY(7), AUGUST(8),

    SEPTEMBER(9), OCTOBER(10), NOVEMBER(11);

    private final int numberOfMonth;
    DayGenerator(int numberOfMonth) { this.numberOfMonth = numberOfMonth; }
    public int getNumberOfMonth() { return numberOfMonth; }
}


enum Season{

    SPRING(Arrays.asList(DayGenerator.MARCH, DayGenerator.APRIL, DayGenerator.MAY)),

    SUMMER(Arrays.asList(DayGenerator.JUN, DayGenerator.JULY, DayGenerator. AUGUST)),

    FALL(Arrays.asList(DayGenerator.SEPTEMBER, DayGenerator.OCTOBER, DayGenerator.NOVEMBER)),

    WINTER(Arrays.asList(DayGenerator.DECEMBER, DayGenerator.JANUARY, DayGenerator.FEBURARY));

    private final List<DayGenerator> seasonList;

    Season(List<DayGenerator> seasonList){
        this.seasonList = seasonList;
    }
}
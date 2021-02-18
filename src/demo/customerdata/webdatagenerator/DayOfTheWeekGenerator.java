package demo.customerdata.webdatagenerator;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum WeekorWeekend{
    WEEKDAYS("주중", Arrays.asList(DayOfTheWeek.MONDAY, DayOfTheWeek.TUESDAY, DayOfTheWeek.WEDNESDAY,
            DayOfTheWeek.THURSDAY, DayOfTheWeek.FRIDAY)),

    WEEKEND("주말", Arrays.asList(DayOfTheWeek.SATURDAY, DayOfTheWeek.SUNDAY));

    String weekOrWeekend;
    List<DayOfTheWeek> weekorWeekendList;

    WeekorWeekend(String weekOrWeekend, List<DayOfTheWeek> weekOrWeekendList) {
        this.weekOrWeekend = weekOrWeekend;
        this.weekorWeekendList = weekOrWeekendList;
    }
}


enum DayOfTheWeek{
    MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"),
    FRIDAY("금요일"), SATURDAY("토툐일"), SUNDAY("일요일");

    private final String dayOfTheWeek;

    DayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}

public class DayOfTheWeekGenerator {

    public String randomDayOfTheWeek(){
        List<DayOfTheWeek> dayOfTheWeekList = Arrays.asList(DayOfTheWeek.values());
        Collections.shuffle(dayOfTheWeekList);
        return dayOfTheWeekList.get(0).getDayOfTheWeek();
    }
}
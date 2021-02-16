package demo.customerdata;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

enum MonthGenerator {
    JANUARY(1), FEBURARY(2), MARCH(3), APRIL(4),
    MAY(5), JUN(6), JULY(7), AUGUST(8),
    SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private final int numberOfMonth;

    MonthGenerator(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    LocalDate localDate = LocalDate.of(1,1,1);
    LocalDateTime localDateTime = LocalDateTime.now();
    public static void main(String args []){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toLocalDate().atTime(LocalTime.now()));
        System.out.println(localDateTime.getHour()+localDateTime.getMinute());
        LocalDate localDate = LocalDate.now();
        String b = String.format("%s", localDate);
        String a = String.format("%s시 %s분", localDateTime.getHour(), localDateTime.getMinute());
        System.out.println(b+" "+a);



    }
}

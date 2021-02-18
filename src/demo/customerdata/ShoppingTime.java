package demo.customerdata;

import org.joda.time.DateTime;

import java.awt.print.Pageable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ShoppingTime {

    LocalDate localDate = LocalDate.now();
    Random random = new Random();
    public LocalDate shoppingDate(){
        LocalDate localDate = LocalDate.of(1,1,1);
        return localDate;
    }


    public boolean checkLeapYear() {
        int year = 40002;
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
    }

    public String getMonth() {
        String.format("%s", LocalDate.of(random.nextInt(13), 1, 1));
        return "dd";
    }

}
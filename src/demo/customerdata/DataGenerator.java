package demo.customerdata;


import demo.customerdata.personaldata.CityGenerator;
import demo.customerdata.personaldata.GenderGenerator;

import java.time.LocalDate;
import java.util.Random;

public class DataGenerator{
    LocalDate localDate = LocalDate.now();
    Random random = new Random();

    public String shoppingDate() {
        return String.valueOf(localDate.getYear());
    }


    public boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
    }

    public String getMonth() {
        String.format("%s", LocalDate.of(random.nextInt(13), 1, 1));
        return "dd";
    }




}

package demo.customerdata.personaldata;

import demo.customerdata.DataGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


enum Age{
    TEENAGER("10대"), _20S("20대"), _30S("30대"), _40S("40대"),
    _50S("50대"), _60S("60대"), OVER_70S("70대이상");

    private final String age;
    Age(String age) { this.age = age; }
    public String getAge() { return age; }
}


public class AgeGenerator {
    public String randomAgeGenerator(){
        List<Age> ageList = Arrays.asList(Age.values().clone());
        Collections.shuffle(ageList);
        return ageList.get(0).getAge();
    }
}

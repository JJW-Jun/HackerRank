//package demo.customerdata;
//
//import java.util.Random;
//
//public class Test {
//    enum Month {
//        JANUARY(Day.DAY_31), FEBURARY(Day.DAY_28), MARCH(Day.DAY_31), APRIL(Day.DAY_30),
//        MAY(Day.DAY_31), JUN(Day.DAY_30), JULY(Day.DAY_31), AUGUST(Day.DAY_31),
//        SEPTEMBER(Day.DAY_30), OCTOBER(Day.DAY_31), NOVEMBER(Day.DAY_30), DECEMBER(Day.DAY_31);
//        private final Day day;
//        Month(Day day) {this.day = day;}
//    }
//
//    enum Day {
//        DAY_28(random.nextInt(31) + 1),
//        DAY_30(random.nextInt(30) + 1),
//        DAY_31(random.nextInt(31) + 1);
//
//        private final int date;
//        Day(int date){
//            this.date = date;
//        }
//
//        public int getDate() {
//            return date;
//        }
//    }
//    public String getRandomDate(){
//        return "2021-"+Month.AUGUST.day;
//
//    }
//
//
//
//
//}
//package demo.enum2;
//
//enum PayrollDay {
//    MON(PayType.WEEKDAY), TUE(PayType.WEEKDAY), WED(PayType.WEEKDAY), THUR(PayType.WEEKDAY), FRI(PayType.WEEKDAY),
//    SAT(PayType.WEEKEND), SUN(PayType.WEEKEND);
//
//    private final PayType payType;
//
//    PayrollDay(PayType payType) {
//        this.payType = payType;
//    }
//
//    int pay(int minutesWorked, int payRate) {
//        return payType.pay(minutesWorked, payRate);
//
//    }
//    enum PayType {
//        WEEKDAY {
//            int overtimePay(int minsWorked, int payRate) {
//                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
//            }
//        },
//        WEEKEND {
//            int a = 0;
//            int overtimePay(int minsWorked, int payRate) {
//                return minsWorked * payRate / 2;
//            }
//
//        };
//
//        abstract int overtimePay(int mins, int payRate);
//
//        private static final int MINS_PER_SHIFT = 8 * 60;
//
//        int pay(int minsWorked, int payRate) {
//            int basePay = minsWorked * payRate;
//            return basePay + overtimePay(minsWorked, payRate);
//        }
//
//    }
//    public static void main(String args []){
//        System.out.println(PayType.WEEKDAY.getClass().getName());
//        System.out.println(PayType.WEEKDAY.getDeclaringClass());
//
//    }
//
//}



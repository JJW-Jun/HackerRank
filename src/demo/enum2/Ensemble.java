package demo.enum2;


enum Ensemble {
    JANUARY(1), FEBURARY(2), MARCH(3), APRIL(4),
    MAY(5), JUN(6), JULY(7), AUGUST(8),
    SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private final int numberOfMonth;

    Ensemble(int numberOfMonth) { this.numberOfMonth = numberOfMonth; }
    public int getNumberOfMonth() { return numberOfMonth; }
}


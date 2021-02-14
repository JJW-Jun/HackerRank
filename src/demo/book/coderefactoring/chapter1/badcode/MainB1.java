package demo.book.coderefactoring.chapter1.badcode;

public class MainB1 {
    public static void main(String args []) {
        RobotB robotB = new RobotB("Test");
        robotB.order(0);
        robotB.order(1);
        robotB.order(2);
        robotB.order(4);
    }
}

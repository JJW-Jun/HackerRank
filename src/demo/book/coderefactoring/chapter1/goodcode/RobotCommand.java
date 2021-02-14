package demo.book.coderefactoring.chapter1.goodcode;

public class RobotCommand {
    private final String _name;
    public RobotCommand(String name){
        _name=name;
    }
    public String toString(){
        return "[RobotCommand: " + _name +"]";
    }
}

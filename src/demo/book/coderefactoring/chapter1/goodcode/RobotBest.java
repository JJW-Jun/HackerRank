package demo.book.coderefactoring.chapter1.goodcode;

public class RobotBest {

    public enum Command{ WALK, STOP, JUMP;}
    private final String _name;
    public RobotBest(String name){
        this._name = name;
    }


    public void order(Command command) {
        if(command== Command.WALK){ System.out.println(_name + " walks."); }
        else if (command==Command.STOP) { System.out.println(_name + " stops."); }
        else if (command == Command.JUMP) { System.out.println(_name+" jumps."); }
        else { System.out.println("Command error. command = "+command); }
    }
}

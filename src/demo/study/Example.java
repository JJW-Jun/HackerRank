package demo.study;
import org.junit.jupiter.api.Test;

import java.util.Random.*;
import static org.hamcrest.CoreMatchers.*;

public class Example{
    String name;
    int number;

    Example(String name, int number){
        this.name = name;
        this.number = number;

    }



    public static void main(String args []){
        Example e = new Example("또치", 3);


    }

}

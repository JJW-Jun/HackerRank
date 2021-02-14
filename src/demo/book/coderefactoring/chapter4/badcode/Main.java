package demo.book.coderefactoring.chapter4.badcode;

import demo.book.javainaction.chapter11.Person;

import java.awt.*;

public class Main {
    public static void main(String args[]) {
        PersonB[] people = {
                new PersonB(new LabelB("Alice"), new LabelB("alice@example.com")),
                new PersonB(new LabelB("Bobby"), new LabelB("bobby@example.com")),
                new PersonB(new LabelB("Chris"))};

        for (PersonB p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println();

        }
    }
}

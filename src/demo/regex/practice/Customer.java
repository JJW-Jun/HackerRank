package demo.regex.practice;

import org.codehaus.jackson.map.util.Comparators;

public class Customer {
    String name;
    int age;
    String date;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", datee='" + date + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDatee(String datee) {
        this.date = datee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

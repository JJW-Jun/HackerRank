package demo.study;

public class Person implements Comparable<Person>{
    String name;
    int age;


    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person person) {
        return Integer.valueOf(age).compareTo(person.getAge());
    }
}

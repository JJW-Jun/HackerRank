package demo.book.javainaction.chapter11;

import java.util.Optional;

public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Optional<Car> car;
    public Optional<Car> getCar(){ return car; }
    public class Car{
        private Optional<Insurance> insurance;
        public Optional<Insurance> getInsurance(){
            return insurance;
        }}

    public class Insurance{
        private String name;
        public String getName(){
            return name;
        }
    }

    public static void main(String args []){
        Person p = new Person();
        Optional<Car> optionalCar = Optional.empty();

    }
}

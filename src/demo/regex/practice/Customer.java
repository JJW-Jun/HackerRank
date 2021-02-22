package demo.regex.practice;

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

    public void setDate(String datee) {
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

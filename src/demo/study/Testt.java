package demo.study;

enum c{
    EEE;
}
interface BehaviorParameterization {
    boolean checker(Customer customer);
}

class CustomerWeightChecker implements BehaviorParameterization {
    @Override
    public boolean checker(Customer customer) {
        return (customer.getAge() < 30) ? true : false;
    }
}


class CustomerHeightChecker implements BehaviorParameterization {
    @Override
    public boolean checker(Customer customer) {
        return (customer.getHeight() > 180) ? true : false;
    }
}

public class Main {
    public static List<Customer> checkCustomer(List<Customer> customerList, BehaviorParameterization bp) {
        List<Customer> checkedList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (bp.checker(customer)) {
                checkedList.add(customer);
            }
        }
        return checkedList;
    }

    public static void main(String args[]) {
        Main main = new Main();

        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Kevin", 182, 30);
        customerList.add(customer);

        Customer customer1 = new Customer("Alias", 165, 30);
        customerList.add(customer1);

        Customer customer2 = new Customer("John", 170, 26);
        customerList.add(customer2);

        Customer customer3 = new Customer("Ally", 172, 34);
        customerList.add(customer3);

        List<Customer> lst = checkCustomer(customerList, Customer->Customer.getHeight()>30);
//        List<Customer> lst2 = checkCustomer(customerList, Cus);
        List<Customer> test = customerList.stream().filter(Customer->Customer.getHeight()>30).collect(Collectors.toList());


    }

}




class Customer {
    private String name;
    private double height;
    private int age;

    Customer(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getAge() {
        return age;
    }
}
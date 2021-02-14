package demo.study;


class Fruit {


    public void eatFruit() {
        System.out.println("Eat Fruit");
    }
    public static void main(String args []){




        //i.defaultMethod();
        Iface i = Iface.getInstance();


//        i.test();

    }

}

class Apple extends Fruit {



}



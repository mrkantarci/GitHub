package constructor.overloadingexample01;

public class Cat {

    String name;
    int age;
    String color;

    Cat(){
        System.out.println("no-arg constructor");

    }
    Cat(String name) {
        System.out.println("1 String constructor :" + name );
    }

    Cat(int age){

    }

    Cat (String color, String name, int age) {
        System.out.println("2 String 1 int args constructor :" + color + " "+ name + "  " + age);
    }

    Cat(String color, int age, String name) {
        System.out.println("2 string 1 int args constructor:" + color + " "+ age + "  " + name);
    }
}

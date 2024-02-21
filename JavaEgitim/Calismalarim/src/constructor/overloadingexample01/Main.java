package constructor.overloadingexample01;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new  Cat("garfield");
        Cat cat3 = new Cat("blue", "tekir" , 5);
        Cat cat4 = new Cat ("tekir" +" " + 5 + " "  + "blue");


    }

}

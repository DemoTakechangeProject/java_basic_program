//abstract class Animal{
//    void eat(){
//        System.out.println("Animal is eating!!");
//    }
//    abstract void sound();
//}
//class Dog extends Animal{
//    @Override
//    void sound(){
//        System.out.println("Dog is barking");
//    }
//}
//class Cat extends Animal{
//    @Override
//    void sound(){
//        System.out.println("Cat says maow");
//    }
//}
//public class AbstractExample{
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sound();
//
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sound();
//    }
//}

abstract class Bank{
    abstract void displayBankName();
    abstract void interestRate();
}

class BOI extends Bank{
    @Override
    void displayBankName(){
        System.out.println("Bank of India");
    }

    @Override
    void interestRate(){
        System.out.println("7.8% interest rate");
    }
}

class ICICI extends Bank{
    void displayBankName(){
        System.out.println("ICICI Bank");
    }

    void interestRate(){
        System.out.println("10.5% interest rate");
    }
}

public class AbstractExample{
    public static void main(String[] args) {
        BOI boi = new BOI();
        boi.displayBankName();
        boi.interestRate();

        ICICI icici = new ICICI();
        icici.displayBankName();
        icici.interestRate();
    }
}

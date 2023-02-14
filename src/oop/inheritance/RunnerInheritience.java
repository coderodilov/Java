package oop.inheritance;
//27.11.2022
//Coder Odilov


public class RunnerInheritience {
    public static void main(String[] args) {
        Grandfa garandfa = new Grandfa();
        Dad dad = new Dad();
        Son son = new Son();
        GrandSon grandson = new GrandSon();


        garandfa.breathe("John Grandfa");

        System.out.println("========================");

        dad.breathe("Jack dad");

        System.out.println("========================");

        son.breathe("Andrew son");
        son.eating("Banana");

        System.out.println("========================");

        grandson.breathe("Lisa grandson");
        grandson.eating("Burger");
        grandson.playing("Tennis");
        grandson.countMethods(4);
    }
}

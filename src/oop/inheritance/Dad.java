package oop.inheritance;

public class Dad extends Grandfa {
    public String food;
    public void eating(String food) {
        this.food = food;
        System.out.printf("I'm eating %s \n", food);
    }
}

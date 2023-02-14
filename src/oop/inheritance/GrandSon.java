package oop.inheritance;

public class GrandSon extends Son {
    public int methodSum;

    public void countMethods(int methodSum) {
        this.methodSum = methodSum;
        System.out.printf("I have %d methods but just 1 mine others extends \n", methodSum);
    }
}

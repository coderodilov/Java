package oop.polimofism.sample1;

public class RunnerPolimofism {
    public static void main(String[] args) {
        Grandfa person[] = new Grandfa[4];

        person[0] = new Grandfa();
        person[1] = new Dad();
        person[2] = new Son();
        person[3] = new GrandSon();

        for (int i = 0; i < person.length; i++){
            person[i].breather();
        }

    }
}

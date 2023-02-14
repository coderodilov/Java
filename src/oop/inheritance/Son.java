package oop.inheritance;

public class Son extends Dad {
    private String game;

    public void playing(String game) {
        this.game = game;
        System.out.printf("I'm playing %s \n", game);
    }
}

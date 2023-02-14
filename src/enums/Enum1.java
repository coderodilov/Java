package enums;

public class Enum1 {
    enum day {Dushanba, seshanba, Chorshanba, Payshanba, Juma, Shanba, yakshanba}

    public static void main(String[] args) {
        day yesterday = day.Shanba;
        day today = day.yakshanba;
        day tomorrow = day.Dushanba;

        System.out.println("Kecha " + yesterday + " edi");
        System.out.println("Bugun " + today);
        System.out.println("Ertaga " + tomorrow + " bo'ladi");
    }
}

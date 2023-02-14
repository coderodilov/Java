package oop.incapsulation;/*
 * Creator Coder Odilov
 * Created on 14/02/23
 */
public class Coder {
    public static void main(String... args) {
        Person coder = new Person("Abdugaffor", 23, "Coding");
        formatPrint(coder);
    }

    public static void formatPrint(Person data){
        System.out.printf("Name: %s \nAge: %s \nHobby: %s", data.getName(), data.getAge(), data.getHobby());
    }
}

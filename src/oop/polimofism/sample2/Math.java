package oop.polimofism.sample2;/*
 * Creator Coder Odilov
 * Created on 14/02/23
 */

public  class Math {
    public  int getMax(int a, int b){
        return a > b ? a : b;
    }
    public  int getMax(int a, int b, int c){
        return c > getMax(a, b) ? c : getMax(a, b);
    }

}

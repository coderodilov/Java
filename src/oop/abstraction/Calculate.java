package oop.abstraction;/*
 * Creator Coder Odilov
 * Created on 14/02/23
 */

public class Calculate extends AbstractSample implements InterfaceSample{
    @Override
    public int getMax(int a, int b) {
        return a > b ? a : b;
    }
}

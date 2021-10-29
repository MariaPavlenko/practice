package ru.ssau.tk.way1.practice;

public class ResettableIntGenerator implements Resettable, IntGenerator{
    private int n = -1;

    @Override
    public void reset() {
        n=-1;
    }

    @Override
    public int nextInt() {
        n++;
        return n;
    }
}

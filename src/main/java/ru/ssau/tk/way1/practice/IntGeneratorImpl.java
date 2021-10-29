package ru.ssau.tk.way1.practice;

public class IntGeneratorImpl implements IntGenerator {
    private int n = -1;
    @Override
    public int nextInt(){
        n++;
        return n;
    }
}

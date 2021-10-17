package ru.ssau.tk.way1.practice;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double x) {
        return apply(apply(apply(x)));
    }

}

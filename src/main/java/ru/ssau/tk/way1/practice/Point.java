package ru.ssau.tk.way1.practice;

public class Point {
    final double x;
    final double y;
    final double z;


    protected Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double Length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

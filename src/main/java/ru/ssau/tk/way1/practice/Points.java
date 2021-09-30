package ru.ssau.tk.way1.practice;

public class Points  {

    static Point sum (Point u, Point v){
        double n= u.x + v.x;
        double m =u.y + v.y;
        double l= u.z+ v.z;
        Point t = new Point(n,m,l);
        return new Point(n, m, l);
    }
    static Point subtract(Point u,  Point v){
        double n= v.x - u.x;
        double m =v.y - u.y;
        double l= v.z - u.z;
        Point t = new Point(n,m,l);
        return new Point(n, m, l);
    }
    static Point multiply(Point u, Point v){
        double n= u.x * v.x;
        double m =u.y * v.y;
        double l= u.z * v.z;
        Point t = new Point(n,m,l);
        return new Point(n, m, l);
    }
    static Point divide (Point u, Point v){
            double n = u.x / v.x;
            double m = u.y / v.y;
            double l = u.z / v.z;
            Point t = new Point(n, m, l);
            return new Point(n, m, l);
    }
    static Point enlarge (Point u, double v){
        double n = u.x * v;
        double m = u.y * v;
        double l = u.z * v;
        Point t = new Point(n, m, l);
        return new Point(n, m, l);
    }
}

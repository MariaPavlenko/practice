package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.*;
import static java.lang.Math.*;

public class PointsTest {
    public final double accuracy = 0.0005;

    private boolean equalsApproximately(double firstValue, double secondValue) {
        return (isNaN(firstValue) && isNaN(secondValue)) || isInfinite(firstValue) && isInfinite(secondValue) || (abs(firstValue) - abs(secondValue)) < accuracy;
    }

    private boolean equalsApproximately(Point firstPoint, Point secondPoint) {
        return equalsApproximately(firstPoint.x, secondPoint.x) && equalsApproximately(firstPoint.y, secondPoint.y) && equalsApproximately(firstPoint.z, secondPoint.z);
    }

    Point firstPoint = new Point(3., 4., 5.);
    Point secondPoint = new Point(0., -1., 1.);

    @Test
    public void testSum() {
        Assert.assertTrue(equalsApproximately(Points.sum(firstPoint, secondPoint), new Point(3., 3., 6.)));
    }

    @Test
    public void testSubtract() {
        Assert.assertTrue(equalsApproximately(Points.subtract(firstPoint, secondPoint), new Point(3., 5., 4.)));
    }

    @Test
    public void testMultiply() {
        Assert.assertTrue(equalsApproximately(Points.multiply(firstPoint, secondPoint), new Point(0., -4., 5.)));
    }

    @Test
    public void testDivide() {
        Assert.assertTrue(equalsApproximately(Points.divide(firstPoint, secondPoint), new Point(POSITIVE_INFINITY, -4., 5.)));
    }

    @Test
    public void testEnlarge() {
        Assert.assertTrue(equalsApproximately(Points.enlarge(firstPoint, 5.), new Point(15., 20., 25.)));
    }

       @Test
     public void testLength() {
     Assert.assertEquals(Points.length(firstPoint), Math.sqrt(50.), accuracy);
    }

    @Test
    public void testOpposite() {
        Assert.assertTrue(equalsApproximately(Points.opposite(secondPoint), new Point(0., 1., -1.)));
    }

    @Test
    public void testInverse() {
        Assert.assertTrue(equalsApproximately(Points.inverse(secondPoint), new Point(POSITIVE_INFINITY, -1., 1.)));
    }
}
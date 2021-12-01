package ru.ssau.tk.way1.practice;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Arrays {
    public int[] arr(int n) {
        return new int[n];
    }

    public int[] arrOneTwo(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                arr[i] = 2;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public int[] arrEven(int n) {
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n - i] = i * 2;
        }
        return arr;
    }

    public int[] arrSqr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * i;
        }
        return arr;
    }

    public double[] arrQuadraticEquation(double a, double b, double c) {
        double[] arr = new double[]{0};
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            arr = new double[1];
            arr[0] = -b / 2 * a;
        }
        if (discriminant < 0) {
        }
        if (discriminant > 0) {
            arr = new double[2];
            arr[0] = -b + sqrt(discriminant) / 2 * a;
            arr[1] = -b - sqrt(discriminant) / 2 * a;
        }
        return arr;
    }

    public int[] arrWithoutThreeA(int n) {
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if ((i + c) % 3 != 0) {
                arr[i] = i + c;
            } else {
                c++;
                arr[i] = i + c;
            }
        }
        return arr;
    }

    public Integer[] arr12(int n) {
        int c;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                arr.add(i);
            }
        }
        Integer[] result = arr.toArray(new Integer[arr.size()]);
        return result;
    }
}

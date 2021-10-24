package ru.ssau.tk.way1.practice;

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
}

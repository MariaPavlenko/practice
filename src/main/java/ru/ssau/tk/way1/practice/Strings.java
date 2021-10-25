package ru.ssau.tk.way1.practice;

public class Strings {
    public void stringByChara(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public void stringByteArr(String s) {
        byte[] b = s.getBytes();
        for (byte i : b
        ) {
            System.out.println(i);
        }
    }
}

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

    public void stringEquals() {
        String s = new String("a b s d");
        String s2 = new String(s);
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}

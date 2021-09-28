package ru.ssau.tk.way1.practice;

public class test {
    public static void main(String[] args){
        Person personFirst= new Person();
        Person personSecond= new Person();
        personFirst.setFirstName("Bob");
        personFirst.setLastName("Kot");
        personFirst.setPassportId(101);
        System.out.println(personFirst.getFirstName());
        System.out.println(personFirst.getLastName());
        System.out.println(personFirst.getPassportId());
        personSecond.setFirstName("Gaga");
        personSecond.setLastName("Dog");
        personSecond.setPassportId(202);
        System.out.println(personSecond.getFirstName());
        System.out.println(personSecond.getLastName());
        System.out.println(personSecond.getPassportId());
    }
}

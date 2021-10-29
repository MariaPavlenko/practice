package ru.ssau.tk.way1.practice;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        this(0., 0., 0., "Origin");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}

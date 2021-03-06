package ua.lviv.iot.creativity.model;

public class Needle extends CreativityGood {
    private int diameter;

    public Needle() {
    }

    public Needle(String name, int price, Type type, int diameter) {
        super(name, price, type);
        this.diameter = diameter;
    };

    public String toString() {
        return super.toString() + " Diameter : " + diameter;
    };
    

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    

}
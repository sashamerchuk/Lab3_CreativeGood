package ua.lviv.iot.creativity.model;

public class Thread extends CreativityGood {

    private int length;

    public Thread() {

    }

    public Thread(String name, int price, Type type, int length) {
        super(name, price, type);
        this.length = length;
    }

    public String toString() {
        return super.toString() + " Length : " + length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
package main.java.net.proselyte.patterns.creational.builder;

public class Building {
    private String type;
    private Floors numberOfFloors;
    private int price;

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfFloors(Floors numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", price=" + price +
                '}';
    }
}

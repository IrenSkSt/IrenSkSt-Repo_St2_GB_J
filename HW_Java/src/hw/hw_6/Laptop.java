public class Laptop {
    public Brand brand; // значения по списку
    public Color color; // значения по списку
    // public String model;
    // public Double diagonal; //в дюймах
    public Integer ram; // в Гб
    // public String processor;
    // public Integer harddisc; // в Гб
    // public String videocard;

    public Laptop(Brand brand, Color color, Integer ram) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;

    }

    @Override
    public String toString() {

        return String.format("Ноутбук %s (%s) RAM - %s Гб %n", brand, color, ram);
    }
}

import java.util.Objects;

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
    public boolean equals(Object obj) {
        var t = (Laptop) obj;
        boolean result = ram == t.ram && color.equals(t.color) && brand.equals(t.brand);
        // System.out.println(ram == t.ram); // для проверки
        // System.out.println(color.equals(t.color)); // для проверки
        // System.out.println(brand.equals(t.brand)); // для проверки
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + brand.hashCode();
        result = prime * result + color.hashCode();
        result = prime * result + ram;
        return result;
    }

    @Override
    public String toString() {

        return String.format("Ноутбук %s (%s) RAM - %s Гб", brand, color, ram);
    }
}

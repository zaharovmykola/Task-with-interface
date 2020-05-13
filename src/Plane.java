public class Plane implements Comparable<Plane> {

    @Override
    public int compareTo(Plane o) {
        if (o == null) {
            return 1;
        }
        else {
            return this.year - o.getYear();
        }
    }

    private int year;
    private String brand;
    private String model;
    private String color;

    public Plane() {
    }

    public Plane(int year, String brand, String model, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}' + System.lineSeparator();
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

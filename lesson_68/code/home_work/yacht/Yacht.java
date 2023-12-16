package home_work.yacht;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class Yacht implements Comparable<Yacht> {

    private String name;
    private String manufacturer;
    private int yearOfIssue;
    private double length;
    private String bodyMaterial;
    private double price;

  public Yacht(String name, String manufacturer, int yearOfIssue, double lenght, String bodyMaterial, double price) {
      this.name = name;
      this.manufacturer = manufacturer;
      this.yearOfIssue = yearOfIssue;
      this.length = lenght;
      this.bodyMaterial = bodyMaterial;
      this.price = price;
  }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getLength() {
        return length;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yacht yacht = (Yacht) o;
        return Objects.equals(name, yacht.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", lenght=" + length +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(@NotNull Yacht o) {
      return -Double.valueOf(this.price).compareTo(Double.valueOf(o.price));
//        return -(Double.compare(this.price, o.price));
    }
}

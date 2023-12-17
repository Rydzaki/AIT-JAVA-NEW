package home_work.temperature;

import java.time.LocalDate;
import java.util.Objects;

public class Temperature {

    private LocalDate date;
    private double indications;

    public Temperature(LocalDate date, double indications) {
        this.date = date;
        this.indications = indications;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getIndications() {
        return indications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "date=" + date +
                ", indications=" + indications +
                '}';
    }
}

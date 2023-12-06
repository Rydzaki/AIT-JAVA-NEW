package home_work.logistic;

import java.awt.desktop.AboutEvent;

public class Parcel{
    double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                '}';
    }
}

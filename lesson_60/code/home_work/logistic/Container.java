package home_work.logistic;

import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Container> {
    String label;
    List<Container> packageList;

    public Container(String label, List<Container> packageList) {
        this.label = label;
        this.packageList = packageList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Container> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Container> packageList) {
        this.packageList = packageList;
    }

    @Override
    public String toString() {
        return "Container{" +
                "label='" + label + '\'' +
                ", packageList=" + packageList +
                '}';
    }

    @Override
    public Iterator<Container> iterator() {
        return packageList.iterator();
    }
}

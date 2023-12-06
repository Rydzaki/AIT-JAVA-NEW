package home_work.logistic;

import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Container>  {
    List<Container> listOfParcelBoxes;

    public Box(List<Container> listOfParcelBoxes) {
        this.listOfParcelBoxes = listOfParcelBoxes;
    }

    public List<Container> getListOfParcelBoxes() {
        return listOfParcelBoxes;
    }

    public void setListOfParcelBoxes(List<Container> listOfParcelBoxes) {
        this.listOfParcelBoxes = listOfParcelBoxes;
    }

    @Override
    public String toString() {
        return "Box{" +
                "listOfParcelBoxes=" + listOfParcelBoxes +
                '}';
    }

    @Override
    public Iterator iterator() {
        return listOfParcelBoxes.iterator();
    }
}

package fibonachi;

import java.util.Iterator;

public class Fibonacchi implements Iterable<Integer> {

    private int quantity; // колличство числе в последовательности

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Fibonacchi(int quantity) {
        this.quantity = quantity;


    }

    @Override
    public Iterator<Integer> iterator() {
        return null; //todo
    }
}

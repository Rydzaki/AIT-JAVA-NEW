package fibonachi;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Fibonacchi implements Iterable<Integer> {

    int quantity; // колличство числе в последовательности

    public Fibonacchi(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(quantity); //todo
    }
}

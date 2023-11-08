package fibonachi;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    @Override
    public boolean hasNext() {
        return false; //todo проерка на колличесиво чисел в ряду
    }

    @Override
    public Integer next() {
        return null; // todo как получить следующее числло в ряду (предыдущее плюс текущее)
    }

}

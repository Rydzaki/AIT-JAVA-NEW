package fibonachi;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    int current;
    int start;
    int size;

    public FibonacciIterator(int size) {
        this.current = 1;
        this.start = 0;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return current <= size; //todo проерка на колличесиво чисел в ряду
    }

    @Override
    public Integer next() {
        int res = current;
        int nextNum = current + start;
        start = current;
        current = nextNum;

        return res; // todo как получить следующее числло в ряду (предыдущее плюс текущее)

    }

    public int[] toMakeFibo(){

        int[] arrFib = new int[size];
        arrFib[0] = start;
        arrFib[1] = current;

        for (int i = 1; i < size; i++) {
            arrFib[i] = arrFib[i] + arrFib[i-1];
        }
        return arrFib;
    }



}

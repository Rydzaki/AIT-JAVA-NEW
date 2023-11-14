package practice_1411.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

// поля
    private StringBuilder str;
    private int size;
    private int currPosition;

    // конструктор
    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPosition = currPosition;
    }


    @Override
    public boolean hasNext() {
        return currPosition < size; // логическое выражение TRUE значит есть еще элементы
    }

    // вернуть этот метод который должен вернуть моножество
    @Override
    public Character next() {
        Character curCharacter = str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }
    // метод удаления элемента строки
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}

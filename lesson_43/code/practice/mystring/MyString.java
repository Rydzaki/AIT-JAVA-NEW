package practice.mystring;

import practice.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {

    // fields

    private StringBuilder str; // StringBuilder встроенный в джава класс


    // constructor


    public MyString(StringBuilder str) {
        this.str = str;
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    // метод добавления символа

    public void addChar (char ch){
        str.append(ch);

    }

    // метод удаления символов
    public void removeChar(char ch){
        int index = str.indexOf(Character.toString(ch)); // нашли индекс слево направо.
        str.deleteCharAt(index); // удалили это индекс

    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}

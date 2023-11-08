package practice.mystring;

import java.util.Iterator;

public class MyStringAppl {



    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("to be or not to be");
        MyString myString = new MyString(str);

        Iterator<Character> iterator = myString.iterator();

        while (iterator.hasNext()){ // пробежались по строке
            char ch = iterator.next();
            if(ch == 'e'){
                iterator.remove(); // удалили все буквы ев строке
            }
        }
        System.out.println(myString);

//        myString.addChar('!');
//
//        System.out.println(myString);
//for
//        myString.removeChar('r');
//        System.out.println(myString);
//
//        // напечатаем всю строку большими буквами
//        printMyString(myString, "напечатаем всю строку большими буквами");
//        StringBuilder builder = myString.getStr(); // в переменную билдер забрали содержимое
//
//        for (int i = 0; i < builder.length(); i++) {
//            char c = builder.charAt(i);
//            c = Character.toUpperCase(c);
//            System.out.print(c);
//
//        }
//
//        System.out.println();
//        builder.setLength(5); // оставили только 5 символов
//        System.out.println(builder);
//        System.out.println(myString); // изменилась материнская строка - это плохо















    }

    public static void printMyString (MyString o, String str){
            System.out.println("============="+ str+ "============");
            System.out.println(o);
        }

    }

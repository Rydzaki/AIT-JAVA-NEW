package practice_1411.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_1411.comparator_urils.ArrayTools;

import java.util.function.Predicate;

class ArrayToolsTest {

    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @Test
    void printArrayTest() {
        System.out.println("-----------------printArrayTest-----------------");
        ArrayTools.printArray((arrNum));
        ArrayTools.printArray(arrStr);
    }

    @Test
    void searchTest() {
        System.out.println("-----------------searchTest-----------------");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("Index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("Index = " + index);

        index = ArrayTools.search(arrNum, 4);
        System.out.println("Index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("Index = " + index);
    }

    @Test
    void testFindByPredicate(){
        System.out.println("-----------------testFindByPredicate-----------------");
        Predicate <Integer> predicate = new Predicate<Integer>() { // аннонимный класс, вызов конструктора
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        };
        Integer num = ArrayTools.findByPredicate(arrNum, predicate);
        System.out.println(num);
    }

    @Test
    void FindByPredicateTest(){
        System.out.println("-----------------testFindByPredicate-----------------");
//        Predicate <Integer> predicate = n -> n < 5; // предикат эта функция которая принимает N и возвращает true или false{ return n <{ return n < 5;
//        }

        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(num);

        num = ArrayTools.findByPredicate(arrNum, n -> n% 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4); // сокращенная версия Предиката
        System.out.println(str);
    }
    @Test
    void testBubbleSort(){
        System.out.println("-----------------testBubbleSort-----------------");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr); //отсортировал по алфавиту
    }
    @Test
    void BubbleSortComparatorTest(){
        System.out.println("-----------------testBubbleSort-----------------");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 - n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length()); //обратная сортировка
        ArrayTools.printArray(arrStr); //отсортировал по алфавиту
    }

}
package practice49.lincedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeListImplTest {

    NodeList nodeList;
    LinkedList nodes = new LinkedList<>();

    @BeforeEach
    void setUp() {
        nodes.add("First");
        nodes.add("Second");
    }
    @Test
    void clearTest() {
        for (Object o : nodes) {
            System.out.print(o + " | ");
        }
        System.out.println(nodes.size());
        nodes.clear();
//        System.out.println(nodes.size());
        assertEquals(0, nodes.size());
    }
}
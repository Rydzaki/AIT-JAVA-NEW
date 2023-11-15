package practice.lincedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

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
        nodes.clear();
//        System.out.println(nodes.size());
        assertEquals(0, nodes.size());
    }
}
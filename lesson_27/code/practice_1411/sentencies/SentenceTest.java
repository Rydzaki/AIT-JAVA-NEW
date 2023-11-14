package practice_1411.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence; // поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence(); // вызвали пустой конструктор который есть по умолчанию у всех объектов

    }

    @Test
    void countWords() {
        String str = "One tho – three , four.";
        assertEquals(4, Sentence.countWords(str));
    }


    @Test
    void countSimbols() {
        String str = " One Two Three   !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪¢£¤¦§¨©ªº«»¬®¯°‰´µ¶·¸¹¿←↑→↓↔⇒⇐⇔⇑⇓↵♠♣♥♦◊○●◄▼►▲■▪▫♀♂™•";
        assertEquals(11, sentence.countSimbols(str));
    }
}
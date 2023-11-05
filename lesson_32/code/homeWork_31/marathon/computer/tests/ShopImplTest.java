package homeWork_31.marathon.computer.tests;

import homeWork_31.marathon.computer.dao.Shop;
import homeWork_31.marathon.computer.dao.ShopImpl;
import homeWork_31.marathon.computer.model.Computer;
import homeWork_31.marathon.computer.model.Laptop;
import homeWork_31.marathon.computer.model.SmartPhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest {

    Shop shop;
    Computer[] c;


    @BeforeEach
    void setUp() {

        shop = new ShopImpl(7 );
        c = new Computer[7];
        c[0] = new Laptop(101, "i7", 16, 512, "Dell", 600, 10,5, 1.5);
        c[1] = new Laptop(102, "AMD 6800", 16, 1024, "HP", 1000, 15,4, 1.2);
        c[2] = new Laptop(103, "Baykal", 8, 512, "Zarya", 550, 30,3, 2.5);
        c[3] = new SmartPhone(104, "Pixel Tensor", 12, 256, "Google Pixel", 800, 5,8, 0.4, "Android", 6.7, 20);
        c[4] = new SmartPhone(105, "SnapDragon 8 gen 1", 12, 256, "One plus", 750, 7,7, 0.45, "Android", 6.7, 48);
        c[5] = new SmartPhone(106, "Kirin", 16, 128, "Huawei", 900, 0,8, 0.38, "HarmonyOS", 6.6, 50);
        for (int i = 0; i < c.length; i++) {
            shop.addComp(c[i]);

        }
    }

    @Test
    void addCompTest() {
        assertFalse(shop.addComp(null));
        assertFalse(shop.addComp(c[1]));
        Computer comp1 = new Laptop(107, "AMD Ryzen 7", 32, 1024, "Xiaomi", 880, 12, 5, 1.45);
        assertTrue(shop.addComp(comp1)); // добавляет компьютнр
        assertEquals(7, shop.quantity());
        Computer comp2 = new Laptop(108, "AMD Ryzen 5", 8, 512, "HP", 450, 15, 4, 2.0);
        assertFalse(shop.addComp(comp2)); // выдаст ошибку если свыше сопасити
    }

    @Test
    void removeComp() {
    }

    @Test
    void findComp() {
    }

    @Test
    void quantity() {
        assertEquals(6, shop.quantity());
    }

    @Test
    void findDiscount() {
    }

    @Test
    void sortDiscount() {
    }

    @Test
    void printArrayCompTest() {
        shop.printArrayComp();
    }
}
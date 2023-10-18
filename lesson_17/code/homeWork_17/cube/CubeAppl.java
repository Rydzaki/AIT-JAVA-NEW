package homeWork_17.cube;

import homeWork_17.cube.model.Cube;

import java.util.Random;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(10);
        cube1.display();

        Cube cube2 = new Cube(15);
        cube2.display();

        Random random = new Random();
        Cube cube3 = new Cube(random.nextInt(99));
        cube3.display();
    }
}

package practice.recursy;

public class RobotAppl {
    public static void main(String[] args) {

        int steps = 10;
        int count = 0;
        moveForward(steps,count);
        System.out.println("Робот дошел");
    }

    private static void moveForward(int steps, int count) {
        if (steps > 0) { //останавливать рекурсию надо IF()!!!
            count++;
            System.out.println("Robot be step " + count + " шаг" +" осталось " + steps + " шагов");
            moveForward(steps - 1, count);
        }
    }
}

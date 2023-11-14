package practice_1411;

//Задача 4. (*) Напечатайте на экране шахматную доску размером 8х8. 0 - белая клеточка,
//        1 - черная. Левая верхняя клеточка должна быть 0, левая нижняя - 1.

public class HomeWork_09_4 {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int boardX = 1;
        int boardY = 1;

        while (boardX < 9) {
            while (boardY <= 4){
                System.out.print((x)+ " | " + (y) + " | ");
                ++boardY;
            }
            System.out.println(); //переход на следующую строку
            boardY = 1;
            x = 1 - x; //меняем местами значения переменных
            y = 1 - y;
            ++boardX; // увеличиваем на 1
        }
    }
}

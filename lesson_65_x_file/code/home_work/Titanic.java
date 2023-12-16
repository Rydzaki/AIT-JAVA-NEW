package home_work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Задание 1. Подсчитайте общую стоимость проезда (выручка от рейса).
//Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.
//Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.
//Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).
public class Titanic {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(new FileReader("train.csv"))) {
            String str = reader.readLine();
            String[] cells = str.split(",");
            printCells(cells);

            double totalRevenue = 0.0;
            double average1 = 0;
            int passengers1Pc = 0;
            double average2 = 0;
            int passengers2Pc = 0;
            double average3 = 0;
            int passengers3Pc = 0;
            int totalPassengers = 0;
            int survived = 0;
            int survivedMen = 0;
            int survivedWomen = 0;
            int survivedChildren = 0;
            int ageUnknown = 0;

            str = reader.readLine();
            while (str != null) {
                totalPassengers++;
                cells = str.split(",");

                if (Integer.parseInt(cells[1]) == 1) {
                    survived++;
                    if (isNumeric(cells[6]) && Double.parseDouble(cells[6]) < 18) {
                        survivedChildren++;
                    }
                    if ("male".equalsIgnoreCase(cells[5]) && isNumeric(cells[6]) && Double.parseDouble(cells[6]) >= 18) {
                        survivedMen++;
                    }
                    if ("female".equalsIgnoreCase(cells[5]) && isNumeric(cells[6]) && Double.parseDouble(cells[6]) >= 18) {
                        survivedWomen++;
                    } else if (!isNumeric(cells[6])) {
                        ageUnknown++;
                    }
                }
                totalRevenue += (Double.parseDouble(cells[10]));

                int pcClass = (Integer.parseInt(cells[2]));
                    if (pcClass == 1) {
                        average1 += (Double.parseDouble(cells[10]));
                        passengers1Pc++;
                    }
                    if (pcClass == 2) {
                        average2 += (Double.parseDouble(cells[10]));
                        passengers2Pc++;
                    }
                    if (pcClass == 3) {
                        average3 += (Double.parseDouble(cells[10]));
                        passengers3Pc++;
                    }

                printCells(cells);
                str = reader.readLine();
            }
            int totalSur = survivedMen + survivedWomen + survivedChildren+ ageUnknown;
            int totalDe = (totalPassengers - totalSur);

            System.out.println("Общая стоимость проезда: " + totalRevenue);
            System.out.println("Средний тариф для 1 класса: " + average1 / passengers1Pc);
            System.out.println("Средний тариф для 2 класса: " + average2 / passengers2Pc);
            System.out.println("Средний тариф для 3 класса: " + average3 / passengers3Pc);
            System.out.println("Общее количество выживших: " + totalSur);
            System.out.println("Общее количество погибших: " + totalDe);
            System.out.println("Выжившие мужчины: " + survivedMen);
            System.out.println("Выжившие женщины: " + survivedWomen);
            System.out.println("Выжившие дети: " + survivedChildren);
            System.out.println("Возраст не известен: " + ageUnknown);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (String cell: cells) {
            System.out.print(cell + " | ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------");
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            // В случае ошибки преобразования в double, пропускаем значение и возвращаем false
            return false;
        }
    }

}

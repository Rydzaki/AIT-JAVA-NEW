package home_work;

import java.util.ArrayList;

public class ArrayListAlpfabet {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        for (char i = 65; i < 91; i++) {
            characters.add(i);
        }
        for (Character c : characters) {
            System.out.print(c+ "|");
        }
        System.out.println();
        System.out.println("=============Задача 5=============");
        ArrayList<Integer> num = new ArrayList<>();
        int a = 1;
        int b = 10;
        for (int i = 0; i <=20; i++) {
            int random = (int) (Math.random()* (b - a) + a);
            num.add(random);
        }
        for (Integer n : num) {
            System.out.print(n + " | ");
        }
        for (int i = 0; i < num.size() - 1; i++) {
            for (int j = num.size() - 1; j >= 0; j--) {
                if (num.get(j).equals(num.get(i)) && i != j){
                    num.remove(j);
                }
            }
        }
        System.out.println();
        System.out.println("============без дублей=============");
        for(Integer n : num){
            System.out.print(n + " | ");
        }
        System.out.println();
        System.out.println("========size======");
        System.out.println(num.size());
    }
}

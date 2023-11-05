package homeWork_31.marathon.computer.dao;

import homeWork_31.marathon.computer.model.Computer;

public class ShopImpl implements Shop {

    private Computer[] computers;
    private int quantity;

    public ShopImpl(int capacity){
        computers = new Computer[capacity]; // максимальное колличество компьютеров в наличии

    }

    @Override
    public boolean addComp(Computer computer) {
        if (computer == null || quantity == computers.length || findComp(computer.getBarcode()) != null) {
            return false;
        }
        computers[quantity++] = computer;
        //quantity++;
        return true;
    }

    @Override
    public Computer removeComp(int barcode) {
        return null;
    }

    @Override
    public Computer findComp(int barcode) {
        for (int i = 0; i < quantity; i++) {
            if (computers[i].getBarcode() == barcode){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public Computer[] findDiscount(int discount) {
        return new Computer[0];
    }

    @Override
    public Computer[] sortDiscount() {
        return new Computer[0];
    }

    @Override
    public void printArrayComp() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(computers[i]);
        }

    }



}

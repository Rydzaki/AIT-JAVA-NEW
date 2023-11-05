package homeWork_31.marathon.computer.dao;

import homeWork_31.marathon.computer.model.Computer;

public interface Shop {

    boolean addComp (Computer computer);
    Computer removeComp (int barcode);
    Computer findComp (int barcode);
    int quantity();
    Computer[] findDiscount (int discount);
    Computer[] sortDiscount ();
    public void printArrayComp();




}


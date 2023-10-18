package homeWork.product;

import homeWork.product.model.Food;
import homeWork.product.model.MeetFood;
import homeWork.product.model.MilkFood;
import homeWork.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {

        Product [] product = new  Product[4];

        product [0] = new Product("Onion", 123452, 2.36);
        product [1] = new Food("Cookie", 23244111, 3.14, "23.12.2023");
        product [2] = new MeetFood("Fresh meet", 24324121, 8.0, "30.10.2023", "Beef" );
        product [3] = new MilkFood("Old Amsterdam", 23442342, 14.23, "12.01.2024","Cheese", 48);

       System.out.println(product[0]);
       System.out.println("==============================================");

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
            System.out.println("-------------------------------------");

        }
        int sumPrice = 0;
        for (int i = 0; i < product.length; i++) {

            sumPrice += product[i].getPrice();

        }

        System.out.println(sumPrice);
        System.out.print("-------------------------------------");
        System.out.println("==============================================");

    }


}

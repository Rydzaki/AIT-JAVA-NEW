package project.dao;

import project.model.Product;

import java.util.List;

public interface Calorie {

     List <Product> readProductsFromCSV();

     void saveFood(List<Product> products);

}

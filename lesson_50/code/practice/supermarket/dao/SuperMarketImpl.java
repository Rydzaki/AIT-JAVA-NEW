package practice.supermarket.dao;

import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SuperMarketImpl implements Supermarket {

    private Collection<Product> products = new ArrayList<>();


    @Override
    public boolean addProduct(Product product) {
        if(product == null || products.contains(product)){ // уже содержит
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product removed = findByBarCode(barCode); // нашли продукт по баркоду и удалили его
        products.remove(removed);
        return removed; // вернули из метода
    }

    @Override
    public Product findByBarCode(long barCode) {
        for(Product p : products){
            if(p.getBarCode() == barCode){
                return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase(p.getCategory())); //
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase(p.getBrand()));
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter(p.getDate())); // после даты
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        List<Product> res = new ArrayList<>();
        // перебираем весь список, находим те которые удовлетворют условию пердиката
        for (Product p : products){
            if(predicate.test(p)){
               res.add(p);
            }
        }
        return res;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator(); // у arrayLIST есть встроенный метод итератор
    }
}

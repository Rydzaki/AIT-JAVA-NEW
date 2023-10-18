package homeWork.product.model;

public class Food extends Product {

    private String expDate;

    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Food{" +
                "expDate='" + expDate + '\'' +
                '}';
    }
}

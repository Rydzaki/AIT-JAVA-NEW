package practice_1411.coffee;

public enum Coffee {
    ESP("Espresso", 3.25), AMR("Americano", 3.85), CAP("Capuccino", 4.5), LAT("Latte", 4.84);

    // поля
    private String type;
    public Double price;

    // конструктор


    Coffee(String type, Double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

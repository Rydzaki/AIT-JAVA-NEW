package home_work.currency;

public enum CurrencyName {

    USD("United States Dollar", 0.9155), CNY("Chinese Yuan", 0.1274),EUR("Euro", 1.0), JPY("Japanese Yen", 0.006145), GBP("British Pound Sterling", 1.14);
    ;

    private String name;
    private Double exchange;

    CurrencyName(String name, Double exchange) {
        this.name = name;
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getExchange() {
        return exchange;
    }

    public void setExchange(Double exchange) {
        this.exchange = exchange;
    }
    public static Double convertToEuro(CurrencyName name, Double d){
        return d * name.exchange;

    }
}

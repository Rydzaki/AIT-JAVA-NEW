package practice_1411.bank_account.model;

public class BankAccount {

    //поля класса

    private long id; // номер счета, он уникален
    private String owner; //владелец счета ...
    private String bankName;
    private int branch; //номер филиала
    private double balance; //текущий баланс

    // тип счета, тип валют, - такие поля тоже полезны и необходимы
    // адрес, контактные данные, возраст > 18, паспортные данные

    // конструктор(Ы) класса

    // конструктор на все поля
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    // конструктор без поля balance
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }

    // конструктор когда клиент без имени (аноним)
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }
    // конструктор без баланса и без имени
    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
    }
    public void display (){
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // положить деньги
    public boolean deposit(double sum){
        balance = balance + sum;
        return true;
    }
    // снять деньги со счета
    public boolean withdraw(double sum){
        if(sum <= balance){
            balance = balance - sum;
            return true;
        }
        return false;

    }


}

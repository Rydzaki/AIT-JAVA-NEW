package prictice.computer.model;

public class Computer1 {

    protected String cpu;
    protected int ram;
    protected int ssd; // убрал privat и стало видно в наследуемомо классе, не видно в других пакетах
    protected String brand; // protected модификатор который помогает увидеть элемент в другом пакете
    public Computer1(){

    }

    public Computer1(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    public void display (){
//        System.out.println("Brand: "+ brand + " CPU: "+ cpu+" RAM: "+ ram+ " SSD: "+ ssd);

 //   }

    @Override
    public String toString() { // всегда пишем метод toString он более гибкий он может возвращать нам значения
        return "Brand: "+ brand + " CPU: "+ cpu+" RAM: "+ ram+ " SSD: "+ ssd;
    }
}

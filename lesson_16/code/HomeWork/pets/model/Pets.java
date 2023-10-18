package HomeWork.pets.model;

public class Pets {

    private int id;
    private String type;
    private int ege;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pets(int id, String type, int ege, String name) {
        this.id = id;
        this.type = type;
        this.ege = ege;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", ege=" + ege +
                ", name='" + name + '\'' +
                '}';
    }
    public void displey (){
        System.out.println("Id: "+ id+ " | Type: "+ type+ " | Ege: "+ ege+ " | Name: "+ name);
    }
    public void sleep (){
        System.out.println("The pet is sleeping");
    }
    public void eat (){
        System.out.println("The pet is eating");
    }
    public void sound (){
        System.out.println("The pet makes a sound");
    }
    public void play (){
        System.out.println(this.name + "The pet is playing");
    }
    public void walk (){
        System.out.println("The pet is walking");
    }
}

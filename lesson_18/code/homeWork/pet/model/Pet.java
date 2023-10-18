package homeWork.pet.model;

public class Pet {

    private int id ;
    private String type;
    private int ege;
    private String name;

    public Pet(int id, String type, int ege, String name) {
        this.id = id;
        this.type = type;
        this.ege = ege;
        this.name = name;
    }

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

    public void displey (){
        System.out.println("Id: "+ id+ " | Type: "+ type+ " | Ege: "+ ege+ " | Name: "+ name);
    }
    public void sleep (){
        System.out.println("The "+ getType() +" "+ getName() + " is sleeping");
    }
    public void eat (){
        System.out.println("The "+ getType() +" "+ getName() + " is eating");
    }
    public void sound (){
        System.out.println("The "+ getType() +" "+ getName() + " makes a sound");
    }
    public void play (){
        System.out.println(this.name + " is playing");
    }
    public void walk (){
        System.out.println("The "+ getType() +" "+ getName() + " is walking");
    }

}

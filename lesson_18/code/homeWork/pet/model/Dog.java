package homeWork.pet.model;

public class Dog extends Pet {

    private String breed;
    private int height;
    private int weight;

    public Dog(int id, String type, int ege, String name, String breed, int height, int weight) {
        super(id, type, ege, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void voice (){
        System.out.println(getName() + " Say  гав-гав");

    }
    public void toPrint(){
        System.out.println("Id: "+ getId()+ " | Type: "+ getType()+ " | Ege: "+ getEge()+
                " | Name: "+ getName()+ " | Breed: "+ getBreed() +
                " | Height: "+ getHeight()+ " | Weight: "+ getWeight());
    }
}

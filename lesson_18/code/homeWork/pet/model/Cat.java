package homeWork.pet.model;

public class Cat extends Pet {

    private String breed;
    private int height;
    private double weight;

    public Cat(int id, String type, int ege, String name, String breed, int height, double weight) {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void voice(){
        System.out.println(getName() + " say - Мяу!");
    }

    public void toPrint(){
        super.displey();
        System.out.println(" | Breed: "+ getBreed() +
                " | Height: "+ getHeight()+ " | Weight: "+ getWeight());
    }
}

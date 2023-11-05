package practice.cats;

public class Cat implements Comparable<Cat> {

    private int id;
    private String name; // кличка
    private String bread;
    private int age;
    private double weight;

    // конструктор


    public Cat(int id, String name, String bread, int age, double weight) {
        this.id = id;
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
        // этот метод позволяет проволдить сравнения объектов этого класса
    // он сравнивает текущий объект (this) с "Cat o"
    // и возвращет целое число всегда. Если оно больше нуля, то предписано объекты поменять местами, в остальных случаях остаются как есть

    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age; // сравниваем года 2х обхектов this и О
        return res;
    }

}

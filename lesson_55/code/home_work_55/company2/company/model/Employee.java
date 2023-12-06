package home_work_55.company2.company.model;

public abstract class Employee implements Comparable<Employee> {
    // поля класса
    protected final int id; // протектед защищено в рамках пакета
    protected String firstName;
    protected String lastName;
    protected int ege;
    protected double hours;
    protected int experience;
    protected int education; // todo

    // конструктор
    public Employee(int id, String firstName, String lastName, int ege, double hours, int experience, int education) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ege = ege;
        this.hours = hours;
        this.experience = experience;
        this.education = education;
    }


    // гетеры и сетеры

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        String educationStr;
        switch (education) {
            case 1:
                educationStr = "Высшее образование";
                break;
            case 2:
                educationStr = "Профессиональное образование";
                break;
            case 3:
                educationStr = "Среднее образование";
                break;
            default:
                educationStr = "Неизвестный уровень образования";
        }
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ege=" + ege +
                ", hours=" + hours +
                ", experience=" + experience +
                ", education='" + educationStr + '\'' +
                '}';

    }

    public abstract double calcSalary(); // метод не содержит тела, но есть имя

    @Override
    public int compareTo(Employee e){
        int res =  -(this.experience - e.experience);
        return res != 0 ? res : Integer.compare (this.education, e.education);

    }
}

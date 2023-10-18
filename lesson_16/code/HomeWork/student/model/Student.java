package HomeWork.student.model;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int born;
    private String faculty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student(int id, String firstName, String lastName, int born, String faculty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.born = born;
        this.faculty = faculty;
    }

    public void display (){
        System.out.println("Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", born=" + born +
                ", faculty='" + faculty + '\'' +
                '}');
    }
    public void study (){
        System.out.println("Student is study");
    }
    public void vocation (){
        System.out.println("Student took a vacation");
    }
    public void exam (){
        System.out.println("Student passed exams");
    }


}

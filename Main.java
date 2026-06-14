class Student {
    String name;
    int id;
    double gpa;

    Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ahmed", 101, 3.5);
        Student s2 = new Student("Mona", 102, 3.8);

        s1.displayInfo();
        s2.displayInfo();
    }
}
package java.oop;

public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student("John", 20, "123 Main St");
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Address: " + student.address);
    }
}

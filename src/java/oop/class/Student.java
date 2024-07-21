package java.oop;

public class Student{
    //attr
    String name;
    int age;
    String address;

    //constructor()
    public Student (String name, int age, String address) {
        this.name = name; //name refer to the param, this.name refer to attri
        this.age = age;
        this.address = address;
    }

    //get and set
    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setAge (String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

//Class
    public String toString() { //class to print out something
        return ("Student name is " + this.getName() + ", age is: " + this.getAge() + " and address is: " + this.getAddress());
    }

//    public static void main(String[] args) { //main class
//        Student student1 = new Student("Sopheak Saing", 20, "St 2002 Sen Sok" );
////        System.out.println(student1.toString());
//        System.out.println(student1.getName());
//        System.out.println(student1.getAge());
//        System.out.println(student1.getAddress());
    }
}
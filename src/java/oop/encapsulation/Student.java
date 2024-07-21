package java.oop.encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;
    //with this, won't be able to access outside class, but what if other need to use it, that's why we need getter & getter
    public Student (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge (String address){
        this.address = address;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
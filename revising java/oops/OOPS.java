package oops;
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("pen is writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
    
    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    Student(){

    }

    public void printInfo(){
        System.out.println("printing nothing!");
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "ball";

        pen1.printColor();
        pen1.printType();

        Student s1 = new Student("s1", 20);
        s1.printInfo();

        Student s2 = new Student();
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();

        // this is compile time polymorphism
        s3.printInfo("s3_name");
        s3.printInfo(20);
        s3.printInfo("s3_name", 20);


    }
}

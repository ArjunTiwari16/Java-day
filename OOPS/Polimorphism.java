// Compile Time (Method Overloading) polimorphism Example,
class Student{
    public void Topper(String name){
        System.out.println(name);
    }

    public void Topper(String name, int age){
        System.out.println(name+" "+age);
    }
 }

public class Polimorphism{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Topper("Shyam");
        obj.Topper("Arjun",21);
        
    }
}
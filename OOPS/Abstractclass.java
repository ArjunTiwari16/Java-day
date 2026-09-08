abstract class Student{
   abstract void Name();
}

class Student1 extends Student{
    public void Name(){
        System.out.println("My name is Arjun");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Student obj = new Student1();
        obj.Name();
    }
}

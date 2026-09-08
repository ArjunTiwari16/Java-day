// Interface
interface Student {
    void Name();   // abstract method (by default in interface)
    void Study();  // another abstract method
}

// Class implementing interface
class CollegeStudent implements Student {
  
    public void Name() {
        System.out.println("My name is Arjun");
    }

   
    public void Study() {
        System.out.println("I study Computer Science in college");
    }
}

// Another class implementing interface
class SchoolStudent implements Student {
   
    public void Name() {
        System.out.println("My name is Shyam");
    }

   
    public void Study() {
        System.out.println("I study Mathematics in school");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Student s1 = new CollegeStudent();  
        Student s2 = new SchoolStudent();  

        s1.Name();
        s1.Study();

        s2.Name();
        s2.Study();
    }
}

// Run time polimorphism (Method Override)
class Student {
    public void Topper() {
        System.out.println("Topper is decided by marks");
    }
}

class CollegeStudent extends Student {
    // @Override
    public void Topper() {
        System.out.println("Topper is decided in college exams");
    }
}

class SchoolStudent extends Student {
    // @Override
    public void Topper() {
        System.out.println("Topper is decided in school exams");
    }
}

public class Polymorphism_2 {
    public static void main(String[] args) {
        Student s1 = new CollegeStudent();  // reference type = Student, object type = CollegeStudent
        Student s2 = new SchoolStudent();   // reference type = Student, object type = SchoolStudent

        s1.Topper();  // runtime pe CollegeStudent ka method call hoga
        s2.Topper();  // runtime pe SchoolStudent ka method call hoga
    }
}

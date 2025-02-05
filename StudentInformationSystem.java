import java.util.Scanner;

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add Student:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Age: ");
        int studentAge = sc.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 

        Student student = new Student(studentName, studentAge, rollNumber);

        System.out.println("\nAdd Teacher:");
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Age: ");
        int teacherAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Subject: ");
        String subject = sc.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAge, subject);

        System.out.println();
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();

        sc.close();
    }
}

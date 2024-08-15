import java.util.Scanner;
import java.util.Calendar;

class Person {
    String name;
    int birthday;
    int birthmonth;
    int birthyear;
    double height;
    double weight;
    String address;

    Person() {
    }

    Person(String name, int birthday, int birthmonth, int birthyear, double height, double weight, String address) {
        this.name = name;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public int calculateAge() {
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - birthyear;
        if (now.get(Calendar.MONTH) + 1 < birthmonth || 
            (now.get(Calendar.MONTH) + 1 == birthmonth && now.get(Calendar.DAY_OF_MONTH) < birthday)) {
            age--;
        }
        return age;
    }
}

class Student extends Person {
    int roll_no;
    double math_marks;
    double sci_marks;
    double eng_marks;

    Student(String name, int birthday, int birthmonth, int birthyear, double height, double weight, String address,
            int rno, double math, double sci, double eng) {
        super(name, birthday, birthmonth, birthyear, height, weight, address);
        this.roll_no = rno;
        this.math_marks = math;
        this.sci_marks = sci;
        this.eng_marks = eng;
    }

    double calculateAvg() {
        return (math_marks + sci_marks + eng_marks) / 3.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday + "/" + birthmonth + "/" + birthyear);
        System.out.println("Age: " + calculateAge());
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Roll no.: " + roll_no);
        System.out.println("Math marks: " + math_marks);
        System.out.println("Science marks: " + sci_marks);
        System.out.println("English marks: " + eng_marks);
        System.out.println("Average marks: " + calculateAvg());
    }
}

class Employee extends Person {
    int id;
    int salary;

    Employee(String name, int birthday, int birthmonth, int birthyear, double height, double weight, String address,
            int id, int salary) {
        super(name, birthday, birthmonth, birthyear, height, weight, address);
        this.id = id;
        this.salary = salary;
    }

    double calculateTax() {
        return this.salary * 0.10;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday + "/" + birthmonth + "/" + birthyear);
        System.out.println("Age: " + calculateAge());
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}

public class InheritClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;
        String name;
        int birthday;
        int birthmonth;
        int birthyear;
        double height;
        double weight;
        String address;
        int id;
        int salary;
        int roll_no;
        double math_marks;
        double sci_marks;
        double eng_marks;

        System.out.println("1. Student\n2. Employee\nEnter choice:");
        ch = s.nextInt();
        s.nextLine(); // Consume newline

        switch (ch) {
            case 1:
                System.out.println("Enter your name: ");
                name = s.nextLine();
                System.out.println("Enter your birthday (day month year): ");
                birthday = s.nextInt();
                birthmonth = s.nextInt();
                birthyear = s.nextInt();
                System.out.println("Enter your height: ");
                height = s.nextDouble();
                System.out.println("Enter your weight: ");
                weight = s.nextDouble();
                s.nextLine(); // Consume newline
                System.out.println("Enter your address: ");
                address = s.nextLine();
                System.out.println("Enter your Roll no.:");
                roll_no = s.nextInt();
                System.out.println("Enter your Marks for following subjects:");
                System.out.println("Maths:");
                math_marks = s.nextDouble();
                System.out.println("Science:");
                sci_marks = s.nextDouble();
                System.out.println("English:");
                eng_marks = s.nextDouble();
                Student stud1 = new Student(name, birthday, birthmonth, birthyear, height, weight, address, roll_no,
                        math_marks, sci_marks, eng_marks);
                stud1.display();
                break;

            case 2:
                System.out.println("Enter your name: ");
                name = s.nextLine();
                System.out.println("Enter your birthday (day month year): ");
                birthday = s.nextInt();
                birthmonth = s.nextInt();
                birthyear = s.nextInt();
                System.out.println("Enter your height: ");
                height = s.nextDouble();
                System.out.println("Enter your weight: ");
                weight = s.nextDouble();
                s.nextLine(); // Consume newline
                System.out.println("Enter your address: ");
                address = s.nextLine();
                System.out.println("Enter your Employee ID: ");
                id = s.nextInt();
                System.out.println("Enter your Salary: ");
                salary = s.nextInt();
                Employee emp1 = new Employee(name, birthday, birthmonth, birthyear, height, weight, address, id, salary);
                emp1.display();
                break;

            default:
                System.out.println("Enter a valid choice: 1 or 2");
                break;
        }

        s.close();
    }
}

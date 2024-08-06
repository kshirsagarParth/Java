import java.util.Scanner;

interface Client
{
    public void input();
    void output();
}

class exp6Interface implements Client {
    String name;
    double salary;
    public void  input()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();
     }
    
    
     public void output()
     {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
     }
    public static void main(String[] args) {
        Client c= new exp6Interface();
        c.input();
        c.output();
    }
}

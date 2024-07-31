class Employee
{
    String fname;
    String lname;
    double salary;

    public Employee() {
    }
    
    Employee(String f, String l, double s)
    {
        this.fname=f;
        this.lname=l;
        this.salary=s;
    }
   void setFname(String f)
    {
        fname= f;
    }
    String getFname()
    {
        return fname;
    }
 void  setLname(String l)
    {
        lname= l;
    }
 String   getLname()
    {
        return lname;
    }
   void  setSalary(double s)
    {
        salary =s;

    }
  double  getSalary()
    {
        return salary;
    }
}
class EmployeeTest
{   
    static double raiseSal(double s)
    {
     return  s + (s*0.1); 
    }
    public static void main(String[]args)
    {   
        

        Employee e1= new Employee("Avishkar","Nalawade",1000000);
        System.out.println("Firstname: "+e1.fname);
        System.out.println("Lastname: "+e1.lname);
        System.out.println("Salary: "+e1.salary);

        Employee e2= new Employee();
        e2.setFname("Parth");
        e2.setLname("Kshirsagar");
        e2.setSalary(1000000);

        System.out.println("Name"+e2.getFname()+e2.getLname());
        System.out.println("Salary"+e2.getSalary());
        double sal= e2.getSalary();

        System.out.println("Salary after increment= "+raiseSal(sal));

    }
}
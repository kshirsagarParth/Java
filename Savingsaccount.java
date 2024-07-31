
import java.util.Scanner;

class Savingsaccount {
    public double savingbalance;
    static double monthlyinterest;

    Savingsaccount(double balance) {
        this.savingbalance = balance;
    }

    public void calmonthlyinterest() {
        monthlyinterest = (savingbalance * monthlyinterest) / 12;
        savingbalance += monthlyinterest;

    }

    void print_savingbalance() {

        System.out.println("total saving balance" + savingbalance);
    }

};

class Main {
    public static void main(String[] args) {
        System.out.println("enter the first saving balance");
        Scanner sc= new Scanner(System.in);
     double s1=sc.nextDouble();
        Savingsaccount s1 = new Savingsaccount(s1);
        System.out.println("enter the second saving balance");
double s2=sc.nextDouble();
        Savingsaccount s2 = new Savingsaccoun(s2);

        Savingsaccount.monthlyinterest = 4;
        System.out.println("after 4% interest");

        s1.calmonthlyinterest();
        s1.print_savingbalance();
        Savingsaccount.monthlyinterest = 5;

        System.out.println("\t");

        System.out.println("after 5% interest");

        s2.calmonthlyinterest();
        s2.print_savingbalance();
    }

}

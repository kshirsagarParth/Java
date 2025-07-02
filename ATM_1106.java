import java.util.*;
import java.text.*;

class Account {
    Scanner sc1 = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##,###.00 'Rupee'");
    DecimalFormat f1 = new DecimalFormat("##,###.00 'Dollar'");

    private int CN, pn;
    double CB = 2000;
    double SB = 1000;

    void setCustomerNumber(int cn) {
        CN = cn;
    }

    void setPinNumber(int pn) {
        this.pn = pn;
    }

    int getCustomerNumber() {
        return CN;
    }

    int getPinNumber() {
        return pn;
    }

    void getCurrentBalance() {
        System.out.println("Your Current Balance : " + f.format(CB));
    }

    void getSavingBalance() {
        System.out.println("Your Saving Balance : " + f1.format(SB));
    }

    void getCurrentWithdrawInput() {
        try {
            System.out.println("Your Current Balance : " + f.format(CB));
            System.out.print("Enter the Amount you want to withdraw : ");
            double amount = sc1.nextDouble();

            if ((CB - amount) >= 0) {
                calcCurrentWithdraw(amount);
                System.out.println("Transaction Successful");
                System.out.println("New Current Account Balance : " + f.format(CB));
            } else {
                System.out.println("Insufficient Balance");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
            sc1.nextLine();
            getCurrentWithdrawInput();
        }
    }

    void getCurrentDepositInput() {
        try {
            System.out.print("Enter the amount to deposit in Current Account: ");
            double amount = sc1.nextDouble();
            if (amount > 0) {
                CB += amount;
                System.out.println("Deposit Successful");
                System.out.println("New Current Account Balance : " + f.format(CB));
            } else {
                System.out.println("Amount must be greater than zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
            sc1.nextLine();
            getCurrentDepositInput();
        }
    }

    double calcCurrentWithdraw(double amt) {
        CB = CB - amt;
        return CB;
    }
}

class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void getLogin() {
        while (true) {
            try {
                data.put(11111, 111);
                data.put(11112, 222);
                data.put(11113, 333);
                data.put(11114, 444);
                data.put(11115, 555);

                System.out.println("\n####### Welcome To DKTE ATM #######");
                System.out.print("Enter Account Number : ");
                setCustomerNumber(sc.nextInt());

                System.out.print("Enter Pin Number : ");
                setPinNumber(sc.nextInt());

                int P = getCustomerNumber();
                int Q = getPinNumber();

                if (data.containsKey(P) && data.get(P) == Q) {
                    runMenuLoop();
                    break;
                } else {
                    System.out.println("Wrong Account Number or Pin.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Only numbers are allowed.");
                sc.nextLine();
            }
        }
    }

    void runMenuLoop() {
        while (true) {
            if (!getAccountType()) {
                break;
            }
        }
    }

    boolean getAccountType() {
        while (true) {
            try {
                System.out.println("\nSelect the ACCOUNT TYPE:");
                System.out.println("1. Current Account");
                System.out.println("2. Saving Account");
                System.out.println("3. Exit");
                System.out.print("Choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        getCurrent();
                        return true;
                    case 2:
                        getSaving();
                        return true;
                    case 3:
                        System.out.println("\nThank you for visiting! Visit Again.");
                        return false;
                    default:
                        System.out.println("Invalid Choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }

    void getCurrent() {
        while (true) {
            try {
                System.out.println("\nCurrent Account:");
                System.out.println("1. View Balance");
                System.out.println("2. Withdraw Funds");
                System.out.println("3. Deposit Funds");
                System.out.println("4. Exit to Account Type Menu");
                System.out.print("Choice: ");
                int ch1 = sc.nextInt();

                switch (ch1) {
                    case 1:
                        getCurrentBalance();
                        break;
                    case 2:
                        getCurrentWithdrawInput();
                        break;
                    case 3:
                        getCurrentDepositInput();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }
    }

    void getSaving() {
        while (true) {
            try {
                System.out.println("\nSaving Account:");
                System.out.println("1. View Balance");
                System.out.println("2. (Coming Soon) Withdraw Funds");
                System.out.println("3. (Coming Soon) Deposit Funds");
                System.out.println("4. Exit to Account Type Menu");
                System.out.print("Choice: ");
                int ch1 = sc.nextInt();

                switch (ch1) {
                    case 1:
                        getSavingBalance();
                        break;
                    case 2:
                    case 3:
                        System.out.println("This feature is coming soon!");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
}

public class ATM_1106 {
    public static void main(String[] args) {
        OptionMenu om = new OptionMenu();
        om.getLogin();
    }
}

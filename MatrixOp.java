import java.util.Scanner;

class Matrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);

    public void getElement() {
        System.out.println("Enter the Elements of 1st matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of 2nd matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("A matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("B matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }
    
    }
    public void addMatrix() {
        int sum[][] = new int[2][2];
        System.out.println("Addition: ");  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
                }
                System.out.println();
                }
    }
    public void subtractMatrix()
    {
        int diff[][] = new int[2][2];
        System.out.println("Subtraction: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(diff[i][j] + " ");
                }
                 System.out.println();
                 }
                 }
    public void multipleMatrix()
    {
        int mul[][] = new int[2][2];
        System.out.println("Multiplication: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = a[i][j] * b[i][j];
                System.out.print(mul[i][j] + " ");
                }
                System.out.println();
                }

    }
    public void divideMatrix()
    {
        int mul[][] = new int[2][2];
        System.out.println("Division: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = a[i][j] / b[i][j];
                System.out.print(mul[i][j] + " ");
                }
                System.out.println();
                }
        
    }
            
}

public class MatrixOp {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.getElement();
        m.display();
        m.addMatrix();
        m.subtractMatrix();
        m.multipleMatrix();
        m.divideMatrix();
    }
}

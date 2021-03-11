import java.lang.Math;
import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        while(bool)
        {
            System.out.print("Select the operation to be performed from below options\n");
            System.out.println("1.Square Root\n 2.Exit");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number: ");
                    double x = input.nextDouble();
                    System.out.println("Square root of "+x+" = "+sqrt(x));
                    break;
                case 2:
                    System.out.println("Exiting the program");
                    bool = false;
                    break;
                default:
                    System.out.println("Please enter from given options.");
                    break;
                }
        }
        
    }

    String name;

    // Calculator(String name)
    // {
    //     this.name = name;
    // }

    public static double sqrt(double x)
    {
        double answer = Math.sqrt(x);
        return answer;
    }
}
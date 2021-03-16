import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator 
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        while(bool)
        {
            System.out.print("Select the operation to be performed from below options\n");
            System.out.println("1.Square Root\n Any other number to Exit");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number: ");
                    double x = input.nextDouble();
                    System.out.println("Square root of "+x+" = "+sqrt(x));
                    break;
                default:
                    System.out.println("Exiting the program");
                    bool = false;
                    break;
                }
        }
        
    }

    String name;

    public static double sqrt(double x)
    {
        double square_root = 0;
        try {
            logger.info("[SQUARE_ROOT] - "+x);
            if(x<0)
            {
                square_root = Double.NaN;
                throw new IllegalArgumentException("Input cannot be negative");
            }
            else square_root =  Math.sqrt(x);
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - SQUARE_ROOT] - INVALID INPUT "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - SQUARE_ROOT] - "+square_root);
        }
        return square_root;
    }  
    
    public static double factorial(double x)
    {
        double fact = 1;
        try {
            logger.info("[FACTORIAL] - "+x);
            if(x<0)
            {
                fact = Double.NaN;
                throw new IllegalArgumentException("Input cannot be negative");
            }
            else if(x==0 || x==1)
            {
                fact =  1;
            }
            else
            {
                for(int i=2;i<=x;i++)
                {
                    fact = fact * i;
                }
            }
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - FACTORIAL] - INVALID INPUT "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - FACTORIAL] - "+fact);
        }
        return fact;
    }
}
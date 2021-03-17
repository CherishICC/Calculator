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
            System.out.print("Select the operation to perform\n");
            System.out.print("1.Square Root  2.Factorial  3.Logarithm  4.Power\nAny other number to Exit: ");
            n = input.nextInt();
            double x;
            switch (n) {
                case 1:
                    System.out.print("Enter a number: ");
                    x = input.nextDouble();
                    System.out.println("Square root of "+ x +" is "+ sqrt(x) + "\n");
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    x = input.nextDouble();
                    System.out.println("Factorial of "+ x + " is " + factorial(x) + "\n");
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    x = input.nextDouble();
                    System.out.println("Logarithm of "+ x + " is " + ln(x) + "\n");
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    x = input.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double y = input.nextDouble();
                    System.out.println(x + " raised to the power of " + y + " is "+ power(x,y) + "\n");
                    break;
                default:
                    System.out.println("Exiting");
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
            if(x < 0)
            {
                square_root = Double.NaN;
                throw new IllegalArgumentException("Input cannot be negative");
            }
            else square_root =  Math.sqrt(x);
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - SQUARE_ROOT] - INVALID INPUT - "+error.getLocalizedMessage());
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
            if(x < 0)
            {
                fact = Double.NaN;
                throw new IllegalArgumentException("Input cannot be negative");
            }
            else if(x == 0 || x == 1)
            {
                fact =  1;
            }
            else
            {
                for(int i = 2; i <= x; i++)
                {
                    fact = fact * i;
                }
            }
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - FACTORIAL] - INVALID INPUT - "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - FACTORIAL] - "+fact);
        }
        return fact;
    }

    public static double ln(double x)
    {
        double logarithm = 0;
        try {
            logger.info("[LOGARITHM] - "+x);
            if(x <= 0)
            {
                logarithm = Double.NaN;
                throw new IllegalArgumentException("Input should be positive");
            }
            else logarithm =  Math.log(x);
        } 
        catch (IllegalArgumentException error) {
            logger.error("[EXCEPTION - LOGARITHM] - INVALID INPUT - "+error.getLocalizedMessage());
        }
        finally
        {
            logger.info("[RESULT - LOGARITHM] - "+logarithm);
        }
        return logarithm;
    }

    public static double power(double x,double y)
    {
    	double solution = 1;
    	logger.info("[POWER] - "+ x +","+ y);
    	solution = Math.pow(x,y);
    	logger.info("[RESULT - POWER] - "+solution);
    	return solution;
    }
}

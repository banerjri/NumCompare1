import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Num1;
        double Num2;
        System.out.print("Enter your First number :");
        System.out.println("\nEnter Your Second Number :");
        if (in.hasNextDouble())
        {
            Num1 = in.nextDouble();
            in.nextLine();
            Num2 = in.nextDouble();
            in.nextLine();
            if (Num1 == Num2)
            {
                System.out.print("The numbers are equal");
            }
            else if (Num1 > Num2)
            {
                System.out.println("The Second number " + Num2 + "is less");
            }
            else
            {
                System.out.println("The First number " + Num1 + "is less");
            }

        }
        else
        {
            System.out.println("\nYou must enter valid number");
            System.out.println("try again");
            System.exit(0);
        }



    }
}
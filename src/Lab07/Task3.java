package Lab07;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter a third number: ");
        double num3 = input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1, double num2,double num3)
    {  double temp ;
        if (num1 > num2)
        {
           temp = num1;
           num1 =num2;
           num2 = temp;
        }
       if (num2>num3) 
       {   
           temp = num2;
           num2 = num3;
           num3 = temp;
       }
       if (num1 > num2)
        {
           temp = num1;
           num1 = num2;
           num2 = temp;
        } 
        System.out.println("the numbers in increasing order: "+num1+","+num2+","+num3);
    }

}

//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        //declare variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        double average = 0;
        //ask for input
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter a number(1/4) ");
        num1 = numScanner.nextInt();
        System.out.println("Enter a number(2/4) ");
        num2 = numScanner.nextInt();
        System.out.println("Enter a number(3/4) ");
        num3 = numScanner.nextInt();
        System.out.println("Enter a number(4/4) ");
        num4 = numScanner.nextInt();
        //compute
        sum = num1 + num2 + num3 + num4;
        average = sum/4.0;
        //print results
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("\nThe average of the numbers is " + average);
    }
}

//Paste console output below:
/*
Enter a number(1/4) 
475
Enter a number(2/4) 
821
Enter a number(3/4) 
369
Enter a number(4/4) 
562
The sum of the numbers is 2227

The average of the numbers is 556.75

*/

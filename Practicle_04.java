// Write a java program to display the employee details using Scanner class.
import java.util.Scanner;
public class Practicle_04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Employee Details\n");
        System.out.print("Enter Employee ID : ");
        int Emp_ID = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String Name = sc.nextLine();

        System.out.print("Enter Gender : ");
        String Gender = sc.next();

        System.out.print("Enter Age : ");
        int Age = sc.nextInt();

        System.out.print("Enter Employee Height : ");
        double Height = sc.nextDouble();

        System.out.print("Enter Position : ");
        String Position = sc.next();

        System.out.print("Enter City : ");
        String City = sc.next();

        
        System.out.println("\nDispalying Employee Details");
        System.out.println("Emp_ID = "+Emp_ID);
        System.out.println("Name = "+Name);
        System.out.println("Gender = "+Gender);
        System.out.println("Age = "+Age);
        System.out.println("Height = "+Height);
        System.out.println("Position = "+Position);
        System.out.println("City = "+City);

        
        sc.close();
    }
}

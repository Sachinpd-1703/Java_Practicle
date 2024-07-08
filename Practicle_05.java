/*Write a Java program that prints allrealsolutionsto the quadratic equation ax2+bx+c = 0. Read in a, b, c and use the quadratic
formula. If the discriminate b2-4ac is negative, display a message stating that there are no realsolutions?
 */
import java.util.Scanner;
public class Practicle_05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a,b,c to find to all real solutions to the quadratic equation ax^2+bx+c = 0");
        System.out.print("Value of a : ");
        double a = sc.nextInt();
        System.out.print("Value of b : ");
        double b = sc.nextInt();
        System.out.print("Value of c : ");
        double c = sc.nextInt();

        double D = b*b-4*a*c;

        if(D>0){
            double R1 = (-b+D)/(2*a);
            double R2 = (-b-D)/(2*a);
            System.out.println("Real Roots are");
            System.out.println("Root 1 = : "+R1);
            System.out.println("Root 2 = : "+R2);
        }else{
            System.out.print("There are no realsolutions");
        }


        sc.close();
    }
}
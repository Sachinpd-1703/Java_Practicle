//Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;
class Practicle_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();
        System.out.print("Prime Number between (1 to "+range+") : ");
        for(int i=2;i<=range;i++){
            int count=0;
            for(int j=1;j<=range;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(" "+i);
            }else{
                count =0;
            }
        }
    }
}

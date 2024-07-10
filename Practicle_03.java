// Write a program to perform arithmetic and bitwise operations by creating individual methods and classes than create an
//  object to execute the individual methods of each operation.
class Arithmetic{
    public int sum(int a,int b){
        return a+b;
    }
    public int difference(int a,int b){
        return a-b;
    }
    public int Multiplication(int a,int b){
        return a*b;
    }
    public int Division(int a,int b){
        if(b==0){
            System.out.println("Division by 0 is undefined");
        }
        return a/b;
    }
    public int Remainder(int a,int b){
        if(b==0){
            System.out.println("Division by 0 is undefined");
        }
        return a%b;

    }
    
}

class Bitwise{
    public int AND(int a,int b){
        return a&b;
    }
    public int OR(int a,int b){
        return a|b;
    }
    public int XOR(int a,int b){
        return a^b;
    }
    public int NOT(int a){
        return ~a;
    }
    public int LeftShift(int a){
        return a<<1;
    }
    public int RightShift(int a){
        return a>>1;
    }
}



public class Practicle_03{
    public static void main(String[] args){
        Arithmetic Arith = new Arithmetic();
        Bitwise Bit = new Bitwise();
        int a=10 , b=2;

        System.out.println("Arithmetic Operation");
        System.out.println(a+" + "+b+" = "+ Arith.sum(a,b));
        System.out.println(a+" - "+b+" = "+ Arith.difference(a,b));
        System.out.println(a+" * "+b+" = "+ Arith.Multiplication(a,b));
        System.out.println(a+" / "+b+" = "+ Arith.Division(a,b));
        System.out.println(a+" % "+b+" = "+ Arith.Remainder(a,b));



        System.out.println("\nBitwisi Operation");
        System.out.println("AND ("+a+" & "+b+") : " + Bit.AND(a,b));
        System.out.println("OR ("+a+" || "+b+") : " + Bit.OR(a,b));
        System.out.println("XOR ("+a+" ^ "+b+") : " + Bit.XOR(a,b));
        System.out.println("Left Shift ("+a+" << 1) : " + Bit.LeftShift(a));
        System.out.println("Right Shift ("+a+" >> 1) : " + Bit.RightShift(a));
        System.out.println("NOT ( ~ "+a+") : " + Bit.NOT(a));
    }
}

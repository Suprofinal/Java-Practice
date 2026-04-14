package supro;

import java.util.Scanner;

public class Interest_Calculation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter principle amount");
        int p= input.nextInt();
        System.out.println("Enter time");
        int t= input.nextInt();
        System.out.println("Enter interest rate");
        double r=input.nextDouble();
        double i=(p*t*r)/100;
        System.out.println("Your simple interest is: "+i);
    }
}

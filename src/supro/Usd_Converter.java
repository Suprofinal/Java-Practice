package supro;

import java.util.Scanner;

public class Usd_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        int inr =input.nextInt();
        double usd=inr/93.16;
        System.out.println("The USD value of your amount is : "+usd);
    }
}

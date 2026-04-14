package supro;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int fn= input.nextInt();
        System.out.println("Enter second number");
        int sn= input.nextInt();
        if(fn>sn){
            System.out.println(fn + "is largest");
        }
        else {
            System.out.println(sn + " is largest");
        }
    }
}

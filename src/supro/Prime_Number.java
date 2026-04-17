package supro;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=in.nextInt();
        double sqrt= Math.sqrt(num);
        if(num>2) {
            for(int i = 2; i <= sqrt; i++) {
            if(num%i != 0) {
                System.out.println(num +" is Prime Number");
                break;
            }
            else {
                System.out.println(num +" is Not Prime Number");
                break;
            }
            }
        } else if (num==0) {
            System.out.println(num +" is number is Prime Number");


        }
        else {
            System.out.println(num +" is Not Prime Number");
        }
    }
}

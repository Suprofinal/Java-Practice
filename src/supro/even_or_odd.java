package supro;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        byte num=input.nextByte();
        int finnum=(int) (num);
        if(finnum%2==0){
            System.out.println("This number is even");

        }
        else{
            System.out.println("This number is odd");
        }
    }
}

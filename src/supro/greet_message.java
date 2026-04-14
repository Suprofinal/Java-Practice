package supro;

import java.util.Scanner;

public class greet_message {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter you name");
        String name=input.next();
        System.out.println("Hi! Good Afternoon "+ name);

    }
}

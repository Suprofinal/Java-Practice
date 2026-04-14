import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int f=0;
        int i=1;
        while(f<=n){
            System.out.println("Fibonacci number : "+f);
            int sn=f+i;
            f=i;
            i=sn;


        }
    }
}

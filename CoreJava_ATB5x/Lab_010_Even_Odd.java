package CoreJava_ATB5x;

import java.util.Scanner;

public class Lab_010_Even_Odd {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if(a%2==1) {
            System.out.println("This is a Odd number");
        }
        else{
            System.out.println("This is a Even number");
        }

    }
}

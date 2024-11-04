package oops;

import java.util.Scanner;

public class Method_Overloading {
    public static void overload(int a){
        System.out.println(a);
    }
    public static void overload(double a){
        System.out.println(a);
    }
    public static void overload(int a ,int b){
        System.out.println(a + " " + b);
    }
    public static void overload(int a , double b){
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        double n1 = sc.nextDouble();
        overload(n);
        overload(n1);
        overload(n , n1);
        overload(n , n);
    }
}

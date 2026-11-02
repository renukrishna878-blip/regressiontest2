package org.example;
import java.util.Scanner;
public class MainTest {
    public static String check(int marks) {
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        System.out.println("Result: " + check(marks));
    }
}
/*
 * 1 - Write a simple String program to take input from user.
 */

import java.util.Scanner;

public class InputString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string input: ");
        String str = sc.nextLine();
        System.out.println("Your String: " + str);
    }
}
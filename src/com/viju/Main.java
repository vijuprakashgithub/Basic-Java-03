package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1;
	byte number2;
	short number3;
	long number4;
	float number5;
	double number6;
	char letter;
	Boolean bool;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer number please");
	number1 = input.nextInt();
	System.out.println("Enter a byte integer number please");
	number2 = input.nextByte();
	System.out.println("Enter a short integer number please");
	number3 = input.nextShort();
	System.out.println("Enter a long integer number please");
	number4 = input.nextLong();
	System.out.println("Enter a float number please");
	number5 = input.nextFloat();
	System.out.println("Enter a double number please");
	number6 = input.nextDouble();
	System.out.println("Enter a single character please");
    letter = input.next().charAt(0);
    System.out.println("Enter a boolean value please");
    bool = input.nextBoolean();

        System.out.println("The provided integer number is "+number1);
        System.out.println("The provided byte integer is "+number2);
        System.out.println("The provided short integer is "+number3);
        System.out.println("The provided long integer is "+number4);
        System.out.println("The provided float number is "+number5);
        System.out.println("The provided double number is "+number6);
        System.out.println("The provided single character is "+letter);
        System.out.println("The provided boolean value is "+bool);
    }
}

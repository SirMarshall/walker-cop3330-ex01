package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Necessary variable declarations
        String nameInput;
        Scanner input = new Scanner(System.in);

        //Name Query
        System.out.println( "What is your name? " );

        //Input Read
        nameInput = input.next();

        //Final print
        System.out.println("Hello, " + nameInput + ", nice to meet you!");
    }
}

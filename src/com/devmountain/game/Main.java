package com.h2;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Cowabunga" );
    };

    public static int doubleTheNumber(int number) {
        System.out.println("In second function");
        return ((number)*2);
    };

    private static int add(int[] number){
        int sum = 0;
        for (int i=0; i < number.length ; i++) {
            sum = sum + number[i];
        };
        return sum;

    };
}

//javac src/main/java/com/h2/App.java
//java src/main/java/com/h2/App.java

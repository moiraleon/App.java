package com.h2;
import java.util.Map;
import java.util.Scanner;

public class BestLoanRates
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears;
        loanTermInYears = scanner.nextInt();

    };
    public static final Map<Integer, Float> bestRates =  Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static float getRates(int loanTermInYears){

        if (bestRates(Map.of()).containsKey(loanTermInYears)){
            return(loanTermInYears);
                else{
                return 0.0f;
            };

        };
    };


}

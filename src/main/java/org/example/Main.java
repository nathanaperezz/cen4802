package org.example;

//Nathan Perez
//Nth element of Fibonacci Sequence for CEN4802C
//19 August 2024

public class Main {
    public static void main(String[] args) {

        int n = 10;
        System.out.println("The " + n + "th element of the Fibonacci sequence is " + Fibonacci(10) + ".");
    }


    public static int Fibonacci(int n) {

        // first & second element of fib are always 0 & 1
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);
    }

}


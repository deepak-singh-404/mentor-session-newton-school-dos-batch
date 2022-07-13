package com.ujjwal;

public class PrimeNumber {
    public static boolean primeNumber(int n) {

        int y = 1;
        while(n/2>y)
        {
            if(n==2)
            {
                return true;
            }
            y++;
            if(n%y == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while(n>2)
        {
            n--;
            boolean a = primeNumber(n);
            if(a==true)
            {
                System.out.println(n);
                count++;
            }
        }
        System.out.println(count);
    }
}
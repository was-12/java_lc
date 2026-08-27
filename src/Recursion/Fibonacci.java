package Recursion;

public class Fibonacci {

    public static int fibancciOfNumber(int number) {

if(number<=1){
    return number;
}

        return fibancciOfNumber(number-1)+fibancciOfNumber(number-2);
    }

    public static void main(String[] args) {
        int number=50;
        int ans=fibancciOfNumber(number);
        System.out.println(ans);
    }



}

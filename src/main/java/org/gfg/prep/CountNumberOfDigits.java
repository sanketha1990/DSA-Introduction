package org.gfg.prep;

public class CountNumberOfDigits {

    private static int countDigitsRecursive(int number){

        if(number == 1){
            return 1;
        }
        String num=String.valueOf(number);
        return num.length()+countDigitsRecursive(number-1);

    }
    private static int countDigitIterative(int n){
        int num_digit=0;
        for(int i=1;i<=n;i*=10){
            num_digit+=(n-i+1);
        }
        return num_digit;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println(countDigitsRecursive(n));
        System.out.println(countDigitIterative(n));
    }
}

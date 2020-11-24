package org.gfg.prep;

public class SumOfNaturalNumberM1 {

    public static int sumOfNaturalNumber(int n){
        return n*(n+1)/2; //O(1) constant time
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNaturalNumber(n));
    }
}

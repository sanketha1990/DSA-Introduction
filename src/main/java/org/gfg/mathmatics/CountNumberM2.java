package org.gfg.mathmatics;

//Recursion technique
public class CountNumberM2 {

    public static long countNumber(long n){
        if(n==0){
            return 0;
        }
        return 1+countNumber(n/10);
    }

    public static void main(String[] args) {
        long n=123;
        System.out.println(countNumber(n));
    }
}

package org.gfg.mathmatics;

// Iterative method
public class CountNumberM1 {

    public  static long countNumber(long n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long n=123;
        System.out.println(countNumber(n));
    }
}

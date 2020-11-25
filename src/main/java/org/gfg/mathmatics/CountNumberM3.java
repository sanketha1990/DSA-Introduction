package org.gfg.mathmatics;
//Logorithemic technique
public class CountNumberM3 {
    public static long countNumber(long n){
        return (int)Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args) {
        long n=1234;
        System.out.println(countNumber(n));
    }
}

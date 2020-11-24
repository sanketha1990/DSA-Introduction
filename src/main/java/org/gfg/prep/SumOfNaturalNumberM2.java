package org.gfg.prep;

public class SumOfNaturalNumberM2 {

    public static int sumOfNaturalNum(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result+=i; //O(n) linear
        }
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNaturalNum(n));
    }
}

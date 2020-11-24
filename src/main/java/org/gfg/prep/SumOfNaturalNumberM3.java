package org.gfg.prep;

public class SumOfNaturalNumberM3 {

    public static int sumOfNaturalNum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
    int n=5;
        System.out.println(sumOfNaturalNum(n));
    }
}

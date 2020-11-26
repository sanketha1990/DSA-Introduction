package org.gfg.mathmatics;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Logorithemic technique
public class CountNumberM3 {
    public static long countNumber(long n){
        return (int)Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args) {
        long n=1234;
        System.out.println(countNumber(n));
        Map<String,String> map=new HashMap();
    }
}

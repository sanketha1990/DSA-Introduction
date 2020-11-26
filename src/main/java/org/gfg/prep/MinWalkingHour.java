package org.gfg.prep;

public class MinWalkingHour {

    public static void main(String[] args) {
        int n=12;
        int speed=0;
        int []walkingHour={1,2,3,4,5};
        int sum=0;
        //time=distance/speed;
        for(int i=0;i<walkingHour.length;i++){
            sum+=walkingHour[i];
        }
        speed=sum/walkingHour.length;
        System.out.println(n/speed);
        System.out.println(n/5);
    }
}

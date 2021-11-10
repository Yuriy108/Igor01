package com.company;

import java.util.Scanner;

public class Main {
   static void inc(){

       System.out.println("Hello world");

    }

    public static void main(String[] args) {




      /*
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int f=sc.nextInt();
       String st=MyMath.min(x,y,z,f);
        System.out.println(st);*/
        Car car1=new Car();
        car1.power=100;
        car1.speed=200;
        car1.inc(car1);
        System.out.println(car1.power+" "+car1.speed);





    }
}

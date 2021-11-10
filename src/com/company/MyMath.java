package com.company;

public class MyMath {
    public static String min(int a,int b,int c,int d){
        if(a<b & a<c & a<d) return " "+a;
         else if(b<a & b<c & b<d) return " " +b;
         else if(c<a & c<b & c<d) return " " +c;
         else if(d<a & d<c & d<b) return " "+d;
        else return "Не корректные входные данные";
    }
}

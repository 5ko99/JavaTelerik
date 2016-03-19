package com.company.Math;


public class Mathemathic {
    public static int pow(int n, int p){
        int result=1;

        for(int i=0;i<p;i++){
            result *= n;
        }

        return result;
    }
}

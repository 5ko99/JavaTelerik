package com.company.Math;


public class Mathemathic {
    public static int pow(int n, int p){

        if(p==0){
            return 1;
        }

        int result=1;

        for(int i=0;i<p;i++){
            result *= n;
        }

        return result;
    }

    public static int recPow(int n, int p){
        if(p==0){
            return 1;
        }

        return recPow(n,p-1) * n;
    }
}

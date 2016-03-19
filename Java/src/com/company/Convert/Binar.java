package com.company.Convert;

public class Binar {
    public static int ToBinar(int a) {
        String bin="";
        int temp=0;

        do{
            temp = a % 2;
            bin += temp;
            a=a/2;
        }
        while(a!=0);

        bin = new StringBuilder(bin).reverse().toString();
        int res = Integer.parseInt(bin);

        return res;
    }
}

package com.company.Convert;

import static com.company.Math.Mathemathic.*;
public class Decimal {

    public static int ToDecimal(int a) {
        int temp=1;
        int dec =0;
        String forCount = String.valueOf(a).toString();
        int lenght =  forCount.length();
        Integer[] arr = new Integer[lenght];
        int n = 0;

        do{
            arr[n]=a%10;
            a/=10;
            n++;
        }
        while (a!=0);

        //Collections.reverse(Arrays.asList(arr));

        for(int i=0;i<lenght;i++){
            temp = arr[i] * pow(2,i);
            dec+=temp;
        }


        return dec;
    }
}

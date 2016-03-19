package com.company;

import java.util.Scanner;

import static com.company.Convert.Binar.ToBinar;
import static com.company.Convert.Decimal.ToDecimal;

/**
 * Created by aoc on 17.03.16.
 */
public class StartupMethod {
    public static void start(){
        int a;
        int result;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter 0 to convert from decimal to binar \n or enter 1 to convert from binar to decimal: \n Choose=");
            a=scanner.nextInt();
            System.out.println();

            if(a==0){
                System.out.print("a=");
                a=scanner.nextInt();
                result= ToBinar(a);
                System.out.printf("Number %s in binar is: %s \n",a,result);
                break;
            } else if(a==1){
                System.out.print("a=");
                a=scanner.nextInt();
                result= ToDecimal(a);
                System.out.printf("Number %s in decimal is: %s \n",a,result);
                break;
            }else{
                System.out.println("Wrong number! \n Please enter only 0 or 1! \n");
            }
        }
    }
}

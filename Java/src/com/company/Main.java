package com.company;
import java.util.Scanner;

import static com.company.Convert.Binar.*;
import static com.company.Convert.Decimal.*;
import static com.company.StartupMethod.*;

public class Main {

    public static void main(String[] args) {
        start();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 to convert another number or 1 to exit! \n n=");
        n=scanner.nextInt();
        System.out.println();

        while(true){
            if(n==0){
                start();
                break;
            }else if(n==1){
                System.out.println("Program exit!");
                break;
            }else{
                System.out.println("Wrong chose enter only 0 or 1! \n");
            }
        }



    }


}

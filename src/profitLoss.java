//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//calculate Profit or Loss.

import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price ");
        int cost = sc.nextInt();
        System.out.println("enter sell price ");
        int sell = sc.nextInt();
        int profitLoss = sell-cost;
        if (profitLoss<0){
            System.out.println(" totle loss is : "+profitLoss*-1);
        }else {
            System.out.println("totle profit is : "+profitLoss);
        }

    }
}

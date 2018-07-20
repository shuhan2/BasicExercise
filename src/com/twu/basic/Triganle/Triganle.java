package com.twu.basic.Triganle;

public class Triganle {
    public void printSingle(){
        System.out.print("*");
    }
    public void printHorizontalLine(int n){
        for (int i = 0 ;i <  n;i ++) {

                System.out.print("*");


        }
    }
    public void printVerticalLine(int n){
        for (int i = 0 ;i <  n;i ++) {
            for (int j = i;j>=0;j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

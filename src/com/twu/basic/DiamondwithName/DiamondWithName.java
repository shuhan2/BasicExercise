package com.twu.basic.DiamondwithName;

public class DiamondWithName {
    public void diamondWithName(int number,String name){
        int temp = number;
        for (int i = 0; i < temp -1; i ++){
             for (int j = temp - i -1;j > 0;j --){
                System.out.print(" ");
            }
            for (int k = 2 * i;k >= 0;k --){
                System.out.print("*");
            }
            for (int l = temp - i -1;l > 0;l --){
                System.out.print(" ");
            }
            System.out.print("\r\n");
        }
        System.out.println(name);
        for (int i = 0; i < temp -1; i ++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * (temp - i - 2); k >= 0; k--) {
                System.out.print("*");
            }
            for (int l = i + 1; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.print("\r\n");
        }
    }
}

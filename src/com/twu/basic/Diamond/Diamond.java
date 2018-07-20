package com.twu.basic.Diamond;

public class Diamond {
    public void dimondIsosceles(int number){
        int temp = number;
        for (int i = 0; i < temp; i ++){
            for (int j = temp - i -1;j > 0;j --){
                System.out.print(" ");
            }
            for (int k = 2*i;k >= 0;k --){
                System.out.print("*");
            }
            for (int l = temp - i -1;l > 0;l --){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public void dimondCentered(int number){
        int temp = number;
        for (int i = 0; i < temp; i ++){
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
//    public void dimondCenter(int number,int currentNumber,boolean flag){
//            int temp = number;
//            for (int j = temp - currentNumber - 1; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 2 * currentNumber; k >= 0; k--) {
//                System.out.print("*");
//            }
//            for (int l = temp - currentNumber - 1; l > 0; l--) {
//                System.out.print(" ");
//            }
//            System.out.println("");
//            if (flag) {
//                if(currentNumber<temp-1) {
//                    dimondCenter(number, ++currentNumber, flag);
//                }
//                else{
//                    flag = !flag;
//                    dimondCenter(number, --currentNumber, flag);
//                }
//            }
//            if(!flag){
//                if(currentNumber>0) {
//                    dimondCenter(number, --currentNumber, flag);
//                }
//                else{
//                    ;
//                }
//            }
//    }


}

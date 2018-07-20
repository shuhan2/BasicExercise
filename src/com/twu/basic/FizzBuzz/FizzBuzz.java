package com.twu.basic.FizzBuzz;

public class FizzBuzz {
    public void fizzBuzz(int left,int right){
        for (int i = left;i <= right;i++){
            fizzBuzzSingleNumber(i);
        }
    }
    public void fizzBuzzSingleNumber(int number){

            if (number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (number % 3 == 0){
                System.out.println("Fizz");
            }
            else if (number % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(number);
        }
    }
    
}

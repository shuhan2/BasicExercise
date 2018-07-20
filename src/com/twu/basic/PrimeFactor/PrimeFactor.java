package com.twu.basic.PrimeFactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    List<Integer> answer = new ArrayList<Integer>();
    public List<Integer> generate(int number){
        if (number == 1){
            return answer;
        }
        else{
            for (int i = 2;i < number;i ++){
                if (number % i == 0 &&justifyFactor(i)){
                    answer.add(i);
                }
            }
        }
        return answer;
    }
    public boolean justifyFactor(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2;i < num;i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

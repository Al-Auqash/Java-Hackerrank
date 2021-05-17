package com.example.javahackerrank;

import java.util.ArrayList;

public class GradingStudent {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        int result = 0;

        for(int i = 1; i <= grades.get(0); i++){
            if((grades.get(i) + 1) % 5 == 0){
                result = grades.get(i) + 1;
            }else if((grades.get(i) + 2) % 5 == 0){
                result = grades.get(i) + 2;
            }else{
                result = grades.get(i);
            }

            r.add(result);
        }

        System.out.println(r);
    }
}

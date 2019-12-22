package com.tesco.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeltaEncoding {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in.txt"));
        Scanner in = new Scanner(System.in);
 
        List<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            int num = in.nextInt();
            list.add(num);
        }
 
        StringBuilder result = new StringBuilder();
        result.append(list.get(0)+" ");
        for (int i=1; i<list.size(); i++) {
            int diff = list.get(i) - list.get(i-1);
            if (Math.abs(diff)>127) {
                result.append("-128 ");
            }
            result.append(diff+" ");
        }
 
        System.out.println(result);
    }
}
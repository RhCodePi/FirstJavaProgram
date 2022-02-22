package com.rhcodepi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int getNumber;
        // initializing a list
        List<Integer> list = new ArrayList<>();
        // User get a input on keybord
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
             getNumber= scanner.nextInt();
             //Then add the list for some number
             list.add(getNumber);
        }

        for(int i = 0; i < list.size(); i++)
        {
            //last thing print the list
            System.out.println(list.get(i));
        }

    }
}

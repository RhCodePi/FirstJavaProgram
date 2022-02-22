package com.rhcodepi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int getNumber;
        // iniliaze list
        List<Integer> list = new ArrayList<>();
        // use get promt
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
             getNumber= scanner.nextInt();
             list.add(getNumber);
        }

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}

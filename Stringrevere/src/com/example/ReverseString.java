package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        //String inputString = "Hello How are You";

        String[] words = inputString.split(" ");

        List<String> result = Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        
        System.out.println(result);
        
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(6);
        num.add(2);
        num.add(5);
        
        Collections.sort(num);
        System.out.println(num); 
      
        
        scanner.close();
     }
}

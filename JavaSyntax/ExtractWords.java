package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ani on 28-Nov-15.
 */
public class ExtractWords {
    public static void main(String[] args) {
        String stringToScan = "This278346127Is887/-+*My+*//542World";

        Pattern checkFor = Pattern.compile("[a-zA-Z]{2,}");
        Matcher lookIn = checkFor.matcher(stringToScan);

        while(lookIn.find()){
            System.out.print(lookIn.group() + " ");
        }
    }
}

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;

public class csv {
    public static void main(String[] args) {
        String outputFile = "C:\\Users\\Ani\\Desktop\\Lucene-Solr.csv";

        // check if file exists
        boolean alreadyExists = new File(outputFile).exists();

        try {
            CsvWriter recordCSV = new CsvWriter(new FileWriter(outputFile, true), ',');


            // writing the header of the file we will be creating
            if (!alreadyExists) {
                recordCSV.write("file_name");
                recordCSV.write("minor");
                recordCSV.write("major");
                recordCSV.write("total");
                recordCSV.write("ownership");
                recordCSV.write("num_of_bugs");
                recordCSV.endRecord();
            }

            recordCSV.write("second.java");
            recordCSV.write("6");
            recordCSV.write("23");
            recordCSV.write("12");
            recordCSV.write("57%");
            recordCSV.write("1");
            recordCSV.endRecord();

            recordCSV.close();

            System.out.println("Input recorded");

        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWritter("English grammer", "A,B,C,D,E,F,J,h,i,k", "\n1,2,3,4,5,6,7,8,9,0");
        fileReader("English grammer");

    }
    public  static  void fileWritter(String fileName, String alphabet, String numbers){

        try (FileWriter writter = new FileWriter( fileName)){
            writter.write(alphabet);
            writter.write(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileReader(String fileName){
        try (FileReader reader = new FileReader(fileName)){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
         catch (IOException e){
            e.printStackTrace();
         }
    }
}

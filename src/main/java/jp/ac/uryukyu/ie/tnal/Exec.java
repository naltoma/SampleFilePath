package jp.ac.uryukyu.ie.tnal;

import java.io.File;
import java.util.Scanner;

public class Exec {
    public static void main(String args[]){
        String filename = "./data/sample.txt";
        String line;
        Scanner scanner;

        try{
            scanner = new Scanner(new File(filename));
            int count = 0;
            while( scanner.hasNextLine() ){
                count++;
                line = scanner.nextLine();
                System.out.printf("%d行目: %s\n",count,line);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}

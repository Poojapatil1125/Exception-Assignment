package com.Question3;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TryWithResources {
	public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\abc.txt");
        FileInputStream fis = new FileInputStream("D:\\abc.txt");
        Scanner sc = new Scanner(fis);
        try {
            fw.write("Welcome to Yash Technologies Pune ");
            
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch(Exception e) {
            System.out.println(e);
            System.out.println("Success");
        }finally {
            fw.close();
            fis.close();
            sc.close();
        }
    }
}

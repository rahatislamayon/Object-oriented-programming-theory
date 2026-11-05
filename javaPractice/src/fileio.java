package javaPractice.src;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileio {
    public static void main(String[] args) {
        try {

            FileWriter file = new FileWriter ("C:\\Users\\USER\\Desktop\\javacode\\javaPractice\\src\\dta.txt");
            BufferedWriter bw=new BufferedWriter(file);
            bw.write("hello");
            bw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}


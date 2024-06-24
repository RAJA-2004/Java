package Exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class rnw {
    public static void main(String[] args) throws IOException {
        String path1 = "aaa.txt";
        String path2 = "abbb.txt";
        File fileInput = new File(path1);
        File fileOutput = new File(path2);

        FileInputStream fi = new FileInputStream(fileInput);
        FileOutputStream fo = new FileOutputStream(fileOutput);

        int c;
        while((c=fi.read())!=-1){
            System.out.println((char)c);
            fo.write(c);
        }
        fo.close();
        fi.close();
    }
}

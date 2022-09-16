package Test4_16thSeptember;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Test4
 {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fileOutputStream1 = new FileOutputStream("A.txt");
        String name1 = "Hi ";
        byte[] b1 = name1.getBytes();
        fileOutputStream1.write(b1);
        FileOutputStream fileOutputStream2 = new FileOutputStream("B.txt");
        String name2 = "Have ";
        byte[] b2 = name2.getBytes();
        fileOutputStream2.write(b2);
        FileOutputStream fileOutputStream3 = new FileOutputStream("C.txt");
        String name3 = "a good";
        byte[] b3 = name3.getBytes();
        fileOutputStream3.write(b3);
        FileOutputStream fileOutputStream4 = new FileOutputStream("D.txt");
        String name4 = " day ";
        byte[] b4 = name4.getBytes();
        fileOutputStream4.write(b4);
        FileInputStream fileInputStream1 = new FileInputStream("A.txt");
        FileInputStream fileInputStream2 = new FileInputStream("B.txt");
        FileInputStream fileInputStream3 = new FileInputStream("C.txt");
        FileInputStream fileInputStream4 = new FileInputStream("D.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("FinalFile.txt");
        Vector v = new Vector();
        v.addElement(fileInputStream1);
        v.addElement(fileInputStream2);
        v.addElement(fileInputStream3);
        v.addElement(fileInputStream4);
        Enumeration enumeration = v.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);
        int i;
        while (true)
        {
            i = sequenceInputStream.read();
            if (i == -1)
                break;
            System.out.print((char) i);
            fileOutputStream.write((char) i);
        }
        sequenceInputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
        fileInputStream4.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
        fileOutputStream4.close();
        fileOutputStream.close();

        FileOutputStream fileOutputStream5 = new FileOutputStream("A1.txt");
        FileOutputStream fileOutputStream6 = new FileOutputStream("B1.txt");
        FileOutputStream fileOutputStream7 = new FileOutputStream("C1.txt");
        FileOutputStream fileOutputStream8 = new FileOutputStream("D1.txt");
        FileInputStream fileInputStream = new FileInputStream("FinalFile.txt");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int j;
        while (true)
        {
            j = fileInputStream.read();
            if (j == -1)
                break;
            byteArrayOutputStream.write((char) j);
        }
        byteArrayOutputStream.writeTo(fileOutputStream5);
        byteArrayOutputStream.writeTo(fileOutputStream6);
        byteArrayOutputStream.writeTo(fileOutputStream7);
        byteArrayOutputStream.writeTo(fileOutputStream8);
        fileInputStream.close();
        byteArrayOutputStream.close();
        fileOutputStream8.close();
        fileOutputStream7.close();
        fileOutputStream6.close();
        fileOutputStream5.close();
    }
}

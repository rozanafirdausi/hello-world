import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args)throws FileNotFoundException {
  try {
               double n1, n2, n3;
  String n;  
  Scanner fileInput = new Scanner(new FileReader("nilai.txt"));
                PrintWriter outFile = new PrintWriter("hasil.txt");
                System.out.println("mulai scanner file");
           try {
                while (fileInput.hasNext()) {
                     String line = fileInput.nextLine();
                     Scanner lineScan = new Scanner(line);
                     lineScan.useDelimiter(";");
                        n   = lineScan.next();
   n1 = lineScan.nextDouble();
   n2 = lineScan.nextDouble();
   n3 = lineScan.nextDouble();
                        double average=(n1+n2+n3)/3;
                        outFile.println(n+";"+average);
  }  } catch (Exception e) {
            System.out.println("scan file error");
        }
      
        fileInput.close();
 outFile.close();
        System.out.println("berhasil scanner file, hasil output akan dicetak di hasil.txt");
  } catch (FileNotFoundException fnfex) {
            System.out.println("File does not exist!!");
        }
        }
         }
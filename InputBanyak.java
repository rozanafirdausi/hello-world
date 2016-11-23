import java.util.Scanner;
 
public class InputBanyak
{
    public static void main(String[]args)
    {
        String kalimat;
        Scanner inputBanyak = new Scanner(System.in);
        System.out.println("Masukan Kalimat");
        kalimat = inputBanyak.nextLine();
        System.out.println(kalimat);
        System.out.println("Cetak Menjadi Huruf Kecil : " + kalimat.toLowerCase());
       System.out.println("Cetak Menjadi Huruf Besar : " + kalimat.toUpperCase());
    }
}
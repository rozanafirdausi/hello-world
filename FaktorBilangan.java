import java.util.Scanner;
 
public class FaktorBilangan
{
    public static void main(String[]args)
    {
        int angka;
        Scanner input = new Scanner(System.in);
     
        System.out.println("Masukkan angka");
        angka = input.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int i = 0; i<= angka; i++)
        {
           tambah++;
           if (angka%tambah==0)
           {
             System.out.print(tambah + " ");
           }
        }
    }
}
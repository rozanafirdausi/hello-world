import java.util.Scanner;
public class Everything {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
      
        double x=0,z=0,   e=0,n=0;
        int nilai=0;
      
      
      
        System.out.println("all in One");
        System.out.println("mau apa??");
        System.out.println("1. pembagian ");
        System.out.println("2. perkalian");
        System.out.println("3. beli rumah angker");
        System.out.println("4. makan makanan mahal");
       nilai = masukan.nextInt();
      
       if (nilai==1){
        System.out.println("masukkan nilai 1");
        x = masukan.nextInt();
        System.out.println("masukan nilai 2");
        z = masukan.nextInt();
           System.out.println("");
           System.out.println("hasilnya adalah");
           System.out.println(x/z);
       }
      
      //kalian
       else if  (nilai==2){
            System.out.println("masukkan nilai 1");
        x = masukan.nextInt();
        System.out.println("masukan nilai 2");
        z = masukan.nextInt();
           System.out.println("");
           System.out.println("hasilnya adalah");
           System.out.println(x*z);   
       }
      
       //rumah
       else if (nilai==3) {
           System.out.println("harga rumah" );
           z=z+100;
           System.out.println(z);
           System.out.println(" mau di renovasi() atau diperbaiki(2)");
       nilai= masukan.nextInt();
        if (nilai==1) {
           System.out.println("ya? tammbah 300");
           e=z+300;
           System.out.println("jimlah total"+ e);
       }
       else if (nilai==2) {
           System.out.println("ya? tambah 500");
           e=z+500;
           System.out.println(e);
       }
       }

      
    
       //makanan
        if (nilai==4) {
            System.out.println("Zen Resto");
        System.out.println("pilih apa yang kamu mau");
        System.out.println("1. nasgor");
        System.out.println("2. bebek");
        nilai=masukan.nextInt();
          
        switch (nilai) {
            case 1 :
                n = n+1000;
                System.out.println(n);
            case 2 :
                n= n+2000;
                System.out.println(n);
          
                System.out.println("mmakan lesehan (1), Apa di Bungkus (2)");
                nilai =masukan.nextInt();
                if (nilai==1) {
                    e = n +1000;
                    System.out.println("nambah 1000, jadi total = " + e);
                } else if (nilai==2) {
                e= n + 3000;
                System.out.println("nambah 3000, jadi total = " + e);
                }
              
        }

    }
}
}
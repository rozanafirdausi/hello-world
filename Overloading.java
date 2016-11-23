class Overloading{
 public void tambah1(){
  int a=5, b=10;
  System.out.println("Hasil Pertambahann dari metod tambah1 ke-1 = "+(a+b));
 }
 //Metod tambah1 di overloading dengan 2 parameter (int x, int y)
 public void tambah1(int x, int y){
  System.out.println("Hasil Pertambahann dari metod tambah1 ke-2 = "+(x+y));
 }
 public static void main(String [] args){
  Overloading pp;
  pp = new Overloading();
  pp.tambah1();//memanggil metod tambah1 ke-1
  pp.tambah1(5,5);//memanggil metod tambah1 ke-2
 }
}
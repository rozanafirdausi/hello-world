import java.util.Scanner; 
import java.util.ArrayList;
public class ListQueueStack {
    static Object data;
    static Scanner zen = new Scanner(System.in);
    static int pilih=0;
    static int bantu=0;
    static int bantu2=0;
    static int start=0;
    static int akeh=0;
    static ArrayList hus=new ArrayList();
    static ArrayList hus2=new ArrayList();
  
    static void display(){
         for (int i = 0; i < hus.size(); i++) {
            System.out.print(hus.get(i).toString()+"=>"); 
          }
            System.out.println();
    }
   
     static void display2(){
         for (int i = hus.size()-1; i >= 0; i--) {
            System.out.print(hus.get(i).toString()+"=>"); 
          }
            System.out.println();
    }
   
     public boolean isEmpty(){
        return (hus.size()<0);
    }
    
     static void current(){
         System.out.println("Data Which Is Exist  : "+hus.size());   
     }
    
    public static void main(String[] args) {
    while(pilih!=3){
        System.out.println("1. Stack"
                + "\n2. Queue"
                + "\n3. stop");
       
        pilih = zen.nextInt();
       
        if (pilih==1){
            while(bantu!=3){
                System.out.println("\n");
                System.out.print("---Menu--\n1. Push"
                        + "\n2. Pop"
                        + "\n3. stop"
                        + " = ");
                
                bantu = zen.nextInt();
                if (bantu==1) {
                    if (hus!=null) {
                System.out.print("inputkan : ");
                       data=zen.next();
                     
                       hus.add(data);
                      
                       display();
                       current();
                    }
                }
                 if (bantu==2){
                    try {
                         hus.remove(hus.size()-1);
                   
                    display();
                    current();
                     System.out.println("Kosong ??? "+hus.isEmpty());
                    } catch (Exception e) {
                        System.out.println("YOU CAN'T POP THE DATA.. NO DATA FOUND TO BE DELETED");
                    }
                      
                }
            }
        }
       
       
         else if (pilih==2){
              while(bantu2!=3){
                System.out.println("");
                System.out.print("---Menu--\n1. Push"
                        + "\n2. Pop"
                        + " = ");
                
                bantu2 = zen.nextInt();
                if (bantu2==1) {
                    if (hus!=null) {
                System.out.print("inputkan : ");
                       data=zen.next();
                     
                       hus.add(data);
                      
                       display2();
                      
                       current();
                    }
                }
                else if (bantu2==2){
                     try {
                         hus.remove(0);
                   
                    display2();
                   
                    current();
                     System.out.println("Kosong ??? "+hus.isEmpty());
                    } catch (Exception e) {
                        System.out.println("YOU CAN'T POP THE DATA.. NO DATA FOUND TO BE DELETED");
                    }
                }
            }         
        }
        else{
            System.out.println("thx");
        }
    }
    }
}

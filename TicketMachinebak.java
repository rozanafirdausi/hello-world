

public class TicketMachinebak
{
    private int price;
    private int balance;
    private int total;
    
   public static int menu ()
    {
     TextIO.putln();
     TextIO.putln("Masukkan Angka");
     TextIO.putln("0 - keluar");
     TextIO.putln("1 - harga tiket");
     TextIO.putln("2 - Masukkan uang dan dapatkan tiket");
     TextIO.putln("3 - mengembalikan uang");
     TextIO.putln("4 - statistik");
     int action=TextIO.getInt();
     return action;
    }
    
    /*public static void main(String[] args)
    {
    System.out.println("Please enter a ticket price");
    int pi=TextIO.getInt();
    TM atm=new TM(pi);
    int Meltem=1;
    while (Meltem!=0)
        Meltem=menu();
    while (Meltem==1)
        int pp=atm.getPrice();
        
    System.out.println("Ticket pice is" +pp);
    }*/
    
    public TicketMachinebak (int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void insertMoney(int amount)
    {
        if (amount>0)
        balance = balance + amount;
        
        else System.out.println("Use a positive amount rather than: " + amount);
    }
    
    public void printTicket()
    {
        if (balance >= price)
        {
            System.out.println("###############");
            System.out.println("# Ticket Machine");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("###############");
            System.out.println();
            
            total = total + price;
            
            balance = balance - price;
        }
        else
        {
            System.out.println("You must insert at least: " + (price - balance) + " more cents.");
        }
    }
    
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
}    
import java.util.Scanner;

public class IntMain
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int cost,menu;
        
        System.out.println("Masukkan harga tiket \n");
        cost=scan.nextInt();
        TicketMachine ticket=new TicketMachine(cost);System.out.println("1. Get Price");
        System.out.println("2. Get Balance");
        System.out.println("3. Insert Money");
        System.out.println("4. Print Ticket");
        menu=scan.nextInt();
        switch(menu)
        {
            case 1:  
                cost=ticket.getPrice();
                System.out.println(cost);
                break;
            case 2:
                ticket.getBalance();
                break;
            case 3:
                int money=scan.nextInt();
                ticket.insertMoney(money);
                break;
            case 4:
                ticket.printTicket();
                break;
    }
}
}

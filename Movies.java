
public class Movies extends BookMyShow
{
    int price;
    @Override
    public void Search() 
    {
        System.out.println("Enter the language you want to Watch: "); 
        System.out.println("Press 1 for Hindi , @ for english: ");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the Movie to watch in hindi: ");
            System.out.println("1 for Javan,2 for Gadar: ");
            String movieSelection=sc.next();
            System.out.println("enjoy watching the movie"+movieSelection);
        }
        
        if(choice==2)
        {
            System.out.println("Enter the movie to wactch in english: ");
            System.out.println("Barbie,Spiderman,Avengere: ");
            String movieSelection=sc.next();
            System.out.println("enjoy watching the movie"+movieSelection);
        }   
    }   
    
    public void seatSelection()
    {
        System.out.println("Enter the number of seat you want: ");
        int numberofseat=sc.nextInt();
        System.out.println("1 for normal---> 200rs");
        System.out.println("2 for premium---> 400rs");
        System.out.println("3 for executive---> 600rs");
        int selectedseat=sc.nextInt();
        
        if(selectedseat==1)
        {
            price+=200*numberofseat;
        }
        if(selectedseat==2)
        {
            price+=400*numberofseat;
        }
        if(selectedseat==3)
        {
            price+=600*numberofseat;
        }
        System.out.println("Total amount for the movie is "+price);
    }
    
    public void addOne()
    {
        System.out.println("do you want addons ? 1 for no,2 for yes");
        int addon=sc.nextInt();
        if(addon==1)
        {
            System.out.println("total price is "+price);
            
        }
        if(addon==2){
        System.out.println("Enter the addon");
        System.out.println("1 for small ---> 150");
        System.out.println("2 for small ---> 300");
        int choice=sc.nextInt();
            System.out.println("Enter the number of addons");
            int numaddon=sc.nextInt();
            if(choice==1)
            {
                price=price+(150*numaddon);
                System.out.println("total price is "+price);
            }
            if(choice==2)
            {
                price=price+(350*numaddon);
                System.out.println("total price is "+price);
            }
        
    }
    
    }
    
    @Override
    public void bookTickets()
    {
        Search();
        seatSelection();
        addOne();
    }
    @Override
    public void cancelticket() 
    {
        System.out.println("Do you want to rally cancel a ticket ? tyes or no");
        String choice=sc.next();
        if(choice.equalsIgnoreCase("yes"))
        {
            System.out.println("ticket has been cancelled");
            price=0;
            System.out.println("total amount refunded");
        }
        if(choice.equalsIgnoreCase("no"))
        {
            System.out.println("Enjoy the movie");
        }
    }
    
    
}

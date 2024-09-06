public class ComedyShow extends BookMyShow
{
    int price;
    int choice;
    int selectedseat;
    @Override
    public void Search()
    {
        System.out.println("Enter the Comedy Show you want to watch");
        System.out.println("press 1 for StandUp,press 2 for Show");
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter which comedian you want to watch      ");
            System.out.println("Munawar,Harsh");
            String movieSelection=sc.next();
            System.out.println("Enjoy watching the Comedy Show Of "+movieSelection);
        }
         if(choice==2)
        {
            System.out.println("Enter which person you want to watch show");
            System.out.println("Zakir,Bassi");
            String movieSelection=sc.next();
            System.out.println("Enjoy watching the Comedy Show of "+movieSelection);
        }
    }
    public void seatSelection()
    {
        System.out.println(" Enter the Number of seat");
        int numberofseat=sc.nextInt();
        if(choice==1)
        {
        System.out.println("Any seat booking fee---->500");
        price=price+(500*numberofseat);  
        }
        if(choice==2)
        {
        System.out.println("Enter the seat type which you want to select for show");
        System.out.println("1 for near the stage---->5000");
        System.out.println("2 for middle---->3000");
        System.out.println("3 for back---->1500");
        selectedseat=sc.nextInt();
        if(selectedseat==1)
        {
            price=price+(5000*numberofseat);
        }
        if(selectedseat==2)
        {
            price=price+(3000*numberofseat);
        }
        if(selectedseat==3)
        {
            price=price+(1500*numberofseat);
        }
        }
        System.out.println("Total amount for the movie is "+price);
}
    public void addone()
    {
     System.out.println("do you want to add addone?");  
     System.out.println("yes or no");
     String addoneselection=sc.next();
     if(addoneselection.equalsIgnoreCase("yes"))
     {
        System.out.println("press 1 for Popcorn,press 2 for drinks");
        int Addontype=sc.nextInt();
        if(Addontype==1)
        {
        System.out.println("Small---->100 or Big--->400");
        String addonesize=sc.next();
        if(addonesize.equalsIgnoreCase("small"))
        {
             System.out.println("How many small popcorn u want to add");
             int numberofaddone=sc.nextInt();
            price=price+(100*numberofaddone);
            System.out.println("Total price="+price);
        }
        if(addonesize.equalsIgnoreCase("big"))
        {
             System.out.println("How many big popcorn you want to add");
             int numberofaddone=sc.nextInt();
            price=price+(400*numberofaddone);
            System.out.println("Total price="+price);
        }
        }
        if(Addontype==2)
        {
         System.out.println("dirinks--->60,oldmonk--->120");
         String addonesize=sc.next();
        if(addonesize.equalsIgnoreCase("drinks"))
        {
             System.out.println("how many drinks u want to add");
             int numberofaddone=sc.nextInt();
            price=price+(60*numberofaddone);
            System.out.println("Total price="+price);
        }
        if(addonesize.equalsIgnoreCase("oldmonk"))
        {
             System.out.println("how many Drinks you want to add");
             int numberofaddone=sc.nextInt();
            price=price+(120*numberofaddone);
            System.out.println("Total price="+price);
        }
        }
     }
     if(addoneselection.equalsIgnoreCase("no"))
     {
        System.out.println("Total price="+price);
     }
    }
    public void Tax()
    { 
        System.out.println("you need to pay some tax according to below list");
        System.out.println("for comedy show 5% tax");
        System.out.println("for other show given list below");
        System.out.println("for near the stage 15% tax");
        System.out.println("for middle 10% tax");
        System.out.println("for back show 5% tax");
        if(choice==1)
        {
         price=price+(price*5)/100;
        }
        if(choice==2)
        {
        if(selectedseat==1)
        {
            price=price+(price*15)/100;
        }
         if(selectedseat==2)
        {
            price=price+(price*10)/100;
        }
         if(selectedseat==3)
        {
            price=price+(price*5)/100;
        }
        }
        System.out.println("total price including taxes ="+ price);
    }
    @Override
    public void bookTickets()
    {
     Search();
     seatSelection();
     addone();
     Tax();
    }
    @Override
    public void cancelticket()
    {
        System.out.println("Do you really want to cancle the tickets? yes,no");
        String cancle=sc.next();
        if(cancle.equalsIgnoreCase("yes"))
        {
         System.out.println("Ticket is cancle successfully");
         price=0;
         System.out.println("Total amout is refunded");
        }
        if(cancle.equalsIgnoreCase("no"))
        {
         System.out.println("Enjoy your movie");
        }
    }
}
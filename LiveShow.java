public class LiveShow extends BookMyShow {
    int price;
    int choice;
    @Override
    public void Search()
    {
        System.out.println("Enter the live Show you want to watch");
        System.out.println("press 1 for  live Music Concert,press 2 for Live Cricket Match");
        choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the Singer name for Live Concert");
            System.out.println("Honey Singh || Arijit Singh");
            String SelectTheOption=sc.next();
            System.out.println("Enjoy watching the live Concert of "+SelectTheOption);
            sc.nextLine();
        }
        if(choice==2){

            System.out.println("Enter which Live Cricket Match you wanna watch :");
            System.out.println("IND Vs PAK || MI Vs CSK");
            sc.nextLine();
            String SelectTheOption=sc.nextLine();
            System.out.println("Enjoy the Live Cricket Match of "+ SelectTheOption);
        }
    }
    public void seatSelection(){
        System.out.println("Enter the Number of Seats you want to book ");
        int numberofseat=sc.nextInt();
        if(choice==1){
            System.out.println("The Booking Amount of Music Cocerts are ---->999/- ");
            price=price+(999*numberofseat);
        }
        if(choice==2){
            System.out.println("The booking Amount of Live Cricket Match of IND Vs PAK is----->1999/- press 1");
            System.out.println("The booking Amount of Live Cricket Match of MI Vs CSK is---->499/- press 2");
            int SelectTheOption=sc.nextInt();
            if(SelectTheOption==1){
                price=price+(1999*SelectTheOption);
            }
            if (SelectTheOption==2){
                price=price+(499*SelectTheOption);
            }
        }
        System.out.println("Total Amount of the live Shows are ="+price);
    }
    public void addon(){
        System.out.println("Do you Want to add Addon?");
        System.out.println("Yes or No");
        String addoneselection=sc.next();
        if(addoneselection.equalsIgnoreCase("yes")){
            System.out.println("Press 1 for the Burgers and Press 2 for the Pizzas");
            int Addontype=sc.nextInt();
            if(Addontype==1){
                System.out.println("Burger  --->69/- || Burger Family pack--->399/- ");
                System.out.println("please type Burger and Burger Family pack ");
                sc.nextLine();
                String bcombo=sc.nextLine();
                if(bcombo.equalsIgnoreCase("Burger")){
                    System.out.println("How many Burgers you want?");
                    int numberofaddone=sc.nextInt();
                    price=price+(69*numberofaddone);
                    System.out.println("Total Amount bookings= "+price);
                }
                if(bcombo.equalsIgnoreCase("Burger Family pack")){
                    System.out.println("How many Combo You want?");
                    int numberofaddon=sc.nextInt();
                    price=price+(399*numberofaddon);
                    System.out.println("Total amount of Bookings= "+ price);
                }
            }
            if(Addontype==2){
                System.out.println("Regular pizzas-->99/- || family pack--->499/-");
                System.out.println("please Type 'Pizza' for Regular pizza & 'Family pack' for the Combo");
                String pcombo=sc.next();
                if(pcombo.equalsIgnoreCase("Pizza")){
                    System.out.println("How many Number of Pizzas You want?");
                    int numberofaddone=sc.nextInt();
                    price=price+(99*numberofaddone);
                    System.out.println("Total Amount of Bookings = "+price);
                }
                if(pcombo.equalsIgnoreCase("Family pack")){
                    System.out.println("How many Number of Family pack You want?");
                    int numberofaddone=sc.nextInt();
                    price=price+(499*numberofaddone);
                    System.out.println("Total Amount of Bookings = "+price);
                }
            }
            System.out.println("Total Amount ="+price);
        }
        if(addoneselection.equalsIgnoreCase("no")){
            System.out.println("total price is = "+price);
        }
    }
    @Override
        public void bookTickets(){
            Search();
            seatSelection();
            addon();
        }
        @Override
        public void cancelticket()
        {
            System.out.println("Do you really want to cancel the tickets? yes,no");
            String cancle=sc.next();
            if(cancle.equalsIgnoreCase("yes"))
            {
             System.out.println("Ticket is cancel successfully");
             price=0;
             System.out.println("Total amout is refunded");
            }
            if(cancle.equalsIgnoreCase("no"))
            {
             System.out.println("Enjoy your movie");
            }
        }

}

import java.util.Scanner;

public class test {
    static{
         System.out.println("------•••Welcome to BookMyShow•••------");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookMyShow b= new BookMyShow();
        b.SignUp();
        if(b.IsLogIn==true){
            b.Search();
            if(b.selection==1){
                Movies m=new Movies();
                m.bookTickets();
                System.out.println("Do you want to cancel ? yes or no");
                String choice =sc.next();
                if(choice.equalsIgnoreCase("yes")){
                    m.cancelticket();
                }
                else{
                    System.out.println("Enjoy the Show");
                }
            }
            if(b.selection==2){
                ComedyShow c=new ComedyShow();
                c.bookTickets();
                System.out.println("Do you want to Cancel bookings? yes or no");
                String choice=sc.next();
                if(choice.equalsIgnoreCase("yes")){
                    c.cancelticket();
                }
                else{
                    System.out.println("Enjoy the Show");
                }
            }
            if(b.selection==3){
                LiveShow l=new LiveShow();
                l.bookTickets();
                System.out.println("Do You want to cancel bookings? yes or no");
                String choice=sc.next();
                if(choice.equalsIgnoreCase("yes")){
                    l.cancelticket();
                }
                else{
                    System.out.println("Enjoy the Live Events/Shows/Concert");
                }
            }
        }
        else{
            System.out.println("Invalid Password");
        }
        sc.close();
    }
    
}
// Amit Raj Anand
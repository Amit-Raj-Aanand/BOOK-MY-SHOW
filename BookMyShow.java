import java.util.Scanner;

public class BookMyShow {
    String emailId,pwd;
    Scanner sc=new Scanner(System.in);
    public boolean IsLogIn;
    public int selection;
    public void SignUp(){
        System.out.println("Do you have any account....");
        System.out.println("Press 1 for NO Press 2 for YES");
        int choice=sc.nextInt();
        if (choice==1){
            System.out.println("Create an Account");
            System.out.println("Enter the email id ");
            emailId=sc.next();
            System.out.println("Enter your Password");
            pwd=sc.next();
            System.out.println("great:Account created");
            LogIn();
        }
        else if(choice==2){
            System.out.println("LogIn to your Account");
            LogIn();
        }
    }
    public void LogIn(){
        System.out.println();
        System.out.println("Enter the Login Details");
        System.out.println("Enter the Email Id");
        String LogInEmail=sc.next();
        System.out.println("Enter the Password ");
        String LogInPass=sc.next();
        if(LogInEmail.equals(emailId) && LogInPass.equals(pwd))
        { System.out.println("LogIn Successfull");
            IsLogIn=true;
        }
        else{
            System.out.println("Password incorrect");
            IsLogIn=false;
        }
    }
    public void Search(){
        System.out.println("Enter the choice");
        System.out.println("press 1 for movies , 2 for the comedy, 3 for live events ");
        selection=sc.nextInt();
    }
    public void bookTickets(){

        System.out.println("ticket is booked");
    }
    public void cancelticket(){
        System.out.println("tickets cancelled");
    }
}

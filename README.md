# Reservation_Syatem
#I develop this project using java only, I mostly use loops in this project. To access use 1234 as ID and password.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int attempt=3;
        int id = 1234;
        int password = 1234;
        int inputpass;
        int inputid;
        String[] trainno={"Indore","Chennai","Jaipur"};
        int[] number= {302010,403020,504030};
        int inputt1;
        System.out.println("---Enter your choice---\n 1.Login\n2.exit");
        ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("---Enter valid ID---");
                    inputid = sc.nextInt();
                        if(inputid == id) {
                            System.out.println("---Enter valid Password---");
                            inputpass = sc.nextInt();
                            if (inputpass == password) {
                                System.out.println("****************************************\nWelcome to Railway Reservation System\n****************************************\n");
                                System.out.println("Train Destinations are: \n1."+trainno[0] +", \n2."+trainno[1]+", \n3."+trainno[2]);
                                System.out.println("____Enter Destination sequence number____");
                                inputt1 = sc.nextInt();
                                    if (inputt1 == 1) {
                                        System.out.println("----Train Details----\n\nTrain Number-302010\nTrain Name-Malwa Express\nUdaipur to Indore\n Time-8:30 AM to 6:45 PM");
                                    }
                                    else if (inputt1 == 2) {
                                        System.out.println("----Train Details-----\n\nTrain Number-403020\nTrain Name-Chennai Express\nMumbai to Chennai\n Time-8:30 AM to 6:45 PM");
                                    }
                                    else if (inputt1 == 3) {
                                        System.out.println("----Train Details----\n\nTrain Number-504030\nTrain Name-Marwar Express\nJaisalmer to Jaipur\n Time-8:30 AM to 6:45 PM");
                                    }
                                    else {
                                        System.out.println("\nInvalid Train Name");
                                        break;
                                    }
                                    System.out.println("\n-----Enter Train Number for Reservation-----");
                                    int num = sc.nextInt();
                                    if(num==number[0]){
                                        System.out.println("\n----Enter Details For Reservation----");
                                    }
                                    else if(num==number[1]){
                                        System.out.println("\n----Enter Details For Reservation----");
                                    }
                                    else if(num==number[2]){
                                        System.out.println("\n----Enter Details For Reservation----");
                                    }
                                    else{
                                        System.out.println("Invalid Train Number");
                                    }
                                    int ticket;
                                System.out.println("\nEnter How Many Ticket You want to book: ");
                                ticket = sc.nextInt();
                                for(int i=1;i<=ticket;i++) {
                                    System.out.println("* Enter name of person " + i + ": ");
                                    String name = sc.next();
                                    System.out.println("* Enter age of person " + i + ": ");
                                    int age = sc.nextInt();
                                    System.out.println("* Enter last 4  digit Aadhar Number of person " + i + ": ");
                                    int aadhar = sc.nextInt();
                                }
                                System.out.println("Ticket booked\n****THANK YOU****");

                                } else {
                                    System.out.println("Invalid Password");
                                }
                            }

                            else{
                                System.out.println("Invalid ID\n please Enter valid ID");
                            }
            case 2:
                System.out.println("\nExit from Railway Reservation System");
        }
    }
}

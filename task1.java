import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


class login{
    JFrame f1 = new JFrame("Railway Reservation System");


    JButton b1 = new JButton("Login");
    JButton b2 = new JButton("Book Ticket");  
    JButton b3= new JButton("Cancel Ticket");
    JButton b4= new JButton("Quit");
    JButton b5 = new JButton("Confirm"); 
    JButton b6 = new JButton("Delhi");
    JButton b7 = new JButton("Mumbai");
    JButton b8 = new JButton("Pune");
    JButton b9 = new JButton("Banglore");
    JButton b10 = new JButton("Bhopal");

    //delhi trains
    JButton b11 = new JButton("Train No       Train Name            Time");
    JButton b12 = new JButton(" 102030       Veer Bhumi Exp      10:45 - 23:30");
    JButton b13 = new JButton(" 203040       Rajdhani Exp        1:50 - 21:00");
    JButton b14 = new JButton(" 304050       Duronto Exp         18:40 - 9:45");
    JButton b15 = new JButton(" 405060       Shatabdi Exp        20:40 - 10:45");
    JButton b16 = new JButton(" 506070       Jan Shatabdi  Exp   12:40 - 22:45");

    //Mumbai trains
    JButton b20 = new JButton("Train No       Train Name                 Time");
    JButton b21 = new JButton(" 607080       Sampark Kranti  Exp      10:45 - 23:30");
    JButton b22 = new JButton(" 708090       Garib Rath Exp           1:50 - 21:00");
    JButton b23 = new JButton(" 809000       HumsafarExp              18:40 - 9:45");
    JButton b24 = new JButton(" 090807       Kavi Guru Exp            20:40 - 10:45");
    JButton b25 = new JButton(" 080706       Rajya Rani  Exp          12:40 - 22:45");

    JButton b17 = new JButton("Confirm");
    JButton b18 = new JButton("Book Ticket");
    JButton b19= new JButton("Ticket Booked Thank You");
    
    
    JLabel l, l1, l2;
    JTextField tf1, tf2;

    int id = 12345;
    int password = 67890;

    int member;

    void form(){
        l = new JLabel("      Railway Reservation System");
        l.setBounds(150,50,600,30);
        l.setFont(new Font("SANS_SERIF", Font.BOLD, 25));

        l1 = new JLabel("Login ID:");
        l1.setBounds(80, 120, 200, 30);
        l1.setFont(new Font("SERIF", Font.PLAIN, 20));

        l2 = new JLabel("Password:");
        l2.setBounds(80, 160, 200, 30);
        l2.setFont(new Font("SERIF", Font.PLAIN, 20));

        tf1 = new JTextField("00000");
        tf1.setBounds(220, 120, 150, 25);
        tf1.setFont(new Font("SERIF", Font.PLAIN, 20));
    
        tf2 = new JTextField("00000");
        tf2.setBounds(220, 160, 150, 25);
        tf2.setFont(new Font("SERIF", Font.PLAIN, 20));
        
        b1.setFont(new Font("SERIF", Font.BOLD, 20));
        b1.setBounds(200, 250, 120, 40);

        f1.add(l);
        f1.add(l1);
        f1.add(l2);
        f1.add(tf1);
        f1.add(tf2);
        f1.add(b1);

        f1.setSize(1000,700);
        f1. setLayout(new BorderLayout()); 
        //f1.setContentPane(new JLabel(new ImageIcon("train.png")));
        //Color c1 = new Color(51-153-255); 
        f1.getContentPane().setBackground(Color.pink);
        f1.setVisible(true);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
class feature extends login{  
    void features(){
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                
                if(Integer.parseInt(tf1.getText())==id && Integer.parseInt(tf2.getText())==password){

            //second frame

                    JFrame f2 = new JFrame("Operations");
                    JLabel l3 = new JLabel();
                    l3.setText("Welcome to Railway Reservation System");
                    l3.setBounds(100,5,500,20);
                    l3.setFont(new Font("SANS_SERIF", Font.BOLD, 25));

                    f2.add(l3);
                    
                    b2.setFont(new Font("SERIF", Font.PLAIN, 20));
                    
                    b3.setFont(new Font("SERIF", Font.PLAIN, 20));
                    
                    b4.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f2.add(b2); 
                    f2.add(b3);
                    f2.add(b4);

                    f2.setLayout(new GridLayout(5, 1, 15, 15));

                    f2.setSize(1000,700);
                    f2.setVisible(true);
                    f2.setBackground(Color.yellow);
                    f2.getContentPane().setBackground(Color.pink);
                    f2.setLayout(null);
                    //f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //add action listner to buttons
        
                }else{
                    //else block if password is wrong
                    b1.setText("Wrong ID or Password\nTry again");
                    b1.setFont(new Font("SERIF", Font.BOLD, 20));
                    b1.setBounds(130, 200, 300, 30);
                    //b1.setFont(new Font("Verdana", Font.PLAIN, 25)); 
                }
            }
        });    
    }
}
class City extends feature{
    void Destination(){
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                JFrame f3 = new JFrame("Book Ticket");

                JLabel l5 = new JLabel("Select Destination:-");
                l5.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
                l5.setBounds(50,5,500,20);
                f3.add(l5);

                b6.setFont(new Font("SERIF", Font.PLAIN, 20));
            
                b7.setFont(new Font("SERIF", Font.PLAIN, 20));
            
                b8.setFont(new Font("SERIF", Font.PLAIN, 20));
            
                b9.setFont(new Font("SERIF", Font.PLAIN, 20));
            
                b10.setFont(new Font("SERIF", Font.PLAIN, 20));
                f3.add(b6); 
                f3.add(b7);
                f3.add(b8);
                f3.add(b9);
                f3.add(b10);

                f3.setLayout(new GridLayout(8, 1, 5, 10));
            
                //b5.setBounds(130, 40, 50, 10);
                //f3.add(b5);
                f3.setSize(1000,700);
                f3.setVisible(true);
                f3.setBackground(Color.yellow);
                f3.getContentPane().setBackground(Color.pink);
                f3.setLayout(null);


            }
        }); 
    
    }

}

class Train extends City{
    void trains(){
        b6.addActionListener(new ActionListener() {
            JFrame f4 = new JFrame("Delhi");
            public void actionPerformed(ActionEvent ae){
                JLabel l4 = new JLabel("Trains from Indore to Delhi-");
                l4.setBounds(100,5,500,20);
                l4.setFont(new Font("SERIF", Font.BOLD, 25));
                f4.add(l4);f4.add(b11);f4.add(b12);f4.add(b13);f4.add(b14);f4.add(b15);f4.add(b16);  
                b11.setFont(new Font("SERIF", Font.BOLD, 25));
                b12.setFont(new Font("SERIF", Font.PLAIN, 20));
                b13.setFont(new Font("SERIF", Font.PLAIN, 20));
                b14.setFont(new Font("SERIF", Font.PLAIN, 20));
                b15.setFont(new Font("SERIF", Font.PLAIN, 20));
                b16.setFont(new Font("SERIF", Font.PLAIN, 20));

                f4.setLayout(new GridLayout(8, 1, 5, 10));
                
                f4.setSize(1000,700);
                f4.setVisible(true);
                f4.setBackground(Color.yellow);
                //Color c1 = new Color(51-153-255);
                f4.getContentPane().setBackground(Color.PINK);
                f4.setLayout(null);

            }
        });
        b7.addActionListener(new ActionListener() {
            JFrame f4 = new JFrame("Mumbai");
            public void actionPerformed(ActionEvent ae){
                JLabel l4 = new JLabel("Trains from Indore to Mumbai-");
                l4.setBounds(100,5,500,20);
                l4.setFont(new Font("VerSERIFdana", Font.BOLD, 25));
                f4.add(l4);f4.add(b20);f4.add(b21);f4.add(b22);f4.add(b23);f4.add(b24);f4.add(b25);  
                b20.setFont(new Font("SERIF", Font.BOLD, 25));
                b21.setFont(new Font("SERIF", Font.PLAIN, 20));
                b22.setFont(new Font("SERIF", Font.PLAIN, 20));
                b23.setFont(new Font("SERIF", Font.PLAIN, 20));
                b24.setFont(new Font("SERIF", Font.PLAIN, 20));
                b25.setFont(new Font("SERIF", Font.PLAIN, 20));
    
                f4.setLayout(new GridLayout(8, 1, 5, 10));
                
                f4.setSize(1000,700);
                f4.setVisible(true);
                f4.setBackground(Color.yellow);
                //Color c1 = new Color(51-153-255);
                f4.getContentPane().setBackground(Color.PINK);
                f4.setLayout(null);
                
            }
        });
        b8.addActionListener(new ActionListener() {
            JFrame f4 = new JFrame("Pune");
            public void actionPerformed(ActionEvent ae){
                JLabel l4 = new JLabel("Trains from Indore to Pune-");
                l4.setBounds(100,5,500,20);
                l4.setFont(new Font("SERIF", Font.BOLD, 25));
                f4.add(l4);f4.add(b11);f4.add(b12);f4.add(b13);f4.add(b14);f4.add(b15);f4.add(b16);  
                b11.setFont(new Font("SERIF", Font.BOLD, 25));
                b12.setFont(new Font("SERIF", Font.PLAIN, 20));
                b13.setFont(new Font("SERIF", Font.PLAIN, 20));
                b14.setFont(new Font("SERIF", Font.PLAIN, 20));
                b15.setFont(new Font("SERIF", Font.PLAIN, 20));
                b16.setFont(new Font("SERIF", Font.PLAIN, 20));

                f4.setLayout(new GridLayout(8, 1, 5, 10));
                
                f4.setSize(1000,700);
                f4.setVisible(true);
                f4.setBackground(Color.yellow);
                //Color c1 = new Color(51-153-255);
                f4.getContentPane().setBackground(Color.PINK);
                f4.setLayout(null);

            }
        });
        b9.addActionListener(new ActionListener() {
            JFrame f4 = new JFrame("Banglore");
            public void actionPerformed(ActionEvent ae){
                JLabel l4 = new JLabel("Trains from Indore to Banglore-");
                l4.setBounds(100,5,500,20);
                l4.setFont(new Font("SERIF", Font.BOLD, 25));
                f4.add(l4);f4.add(b20);f4.add(b21);f4.add(b22);f4.add(b23);f4.add(b24);f4.add(b25);  
                b20.setFont(new Font("SERIF", Font.BOLD, 25));
                b21.setFont(new Font("SERIF", Font.PLAIN, 20));
                b22.setFont(new Font("SERIF", Font.PLAIN, 20));
                b23.setFont(new Font("SERIF", Font.PLAIN, 20));
                b24.setFont(new Font("SERIF", Font.PLAIN, 20));
                b25.setFont(new Font("SERIF", Font.PLAIN, 20));
    
                f4.setLayout(new GridLayout(8, 1, 5, 10));
                
                f4.setSize(1000,700);
                f4.setVisible(true);
                f4.setBackground(Color.yellow);
                //Color c1 = new Color(51-153-255);
                f4.getContentPane().setBackground(Color.PINK);
                f4.setLayout(null);
                
            }
        });
        b10.addActionListener(new ActionListener() {
            JFrame f4 = new JFrame("Bhopal");
            public void actionPerformed(ActionEvent ae){
                JLabel l4 = new JLabel("Trains from Indore to Bhopal-");
                l4.setBounds(100,5,500,20);
                l4.setFont(new Font("SERIF", Font.BOLD, 25));
                f4.add(l4);f4.add(b11);f4.add(b12);f4.add(b13);f4.add(b14);f4.add(b15);f4.add(b16);  
                b11.setFont(new Font("SERIF", Font.BOLD, 25));
                b12.setFont(new Font("SERIF", Font.PLAIN, 20));
                b13.setFont(new Font("SERIF", Font.PLAIN, 20));
                b14.setFont(new Font("SERIF", Font.PLAIN, 20));
                b15.setFont(new Font("SERIF", Font.PLAIN, 20));
                b16.setFont(new Font("SERIF", Font.PLAIN, 20));

                f4.setLayout(new GridLayout(8, 1, 5, 10));
                
                f4.setSize(1000,700);
                f4.setVisible(true);
                f4.setBackground(Color.pink);
                //Color c1 = new Color(51-153-255);
                f4.getContentPane().setBackground(Color.PINK);
                f4.setLayout(null);

            }
        });
    }
}
class tickets extends Train{
    public void bookticket(){
        
        JFrame f5 = new JFrame("Ticket Booking");
        JLabel l5 = new JLabel("Number of tickets:");
        l5.setBounds(80, 80, 200, 20);
        l5.setFont(new Font("SERIF", Font.PLAIN, 20));
        f5.add(l5);
    
        JTextField tf3 = new JTextField();
        tf3.setBounds(250, 80, 90, 25);
        tf3.setFont(new Font("SERIF", Font.PLAIN, 20));
        f5.add(tf3);
        
        b17.setFont(new Font("SERIF", Font.PLAIN, 25));
        b17.setBounds(130, 20, 50, 10);
        b17.setForeground(Color.black);
        b17.setBackground(Color.pink);
        //b17.setOpaque(true);
        b17.setBorderPainted(false);
        f5.add(b17);

        f5.setSize(1000,700);
        f5.setVisible(true);
        //f5.setBackground(Color.yellow);
        f5.getContentPane().setBackground(Color.PINK);
        f5.setLayout(null);

        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                JFrame f6 = new JFrame("Members");
                member = Integer.parseInt(tf3.getText());
                if(member==1){
                    JLabel l7 = new JLabel("Name:");
                    l7.setBounds(80, 80, 200, 25);
                    l7.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l7);
    
                    JTextField tf5 = new JTextField();
                    tf5.setBounds(200, 70, 150, 25);
                    tf5.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf5);

                    JLabel l6 = new JLabel("Age:");
                    l6.setBounds(80, 100, 200, 25);
                    l6.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l6);
        
        
                    JTextField tf4 = new JTextField();
                    tf4.setBounds(200, 100, 150, 25);
                    tf4.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf4);
                    
                    //b17.setText("Book Ticket");
                    b18.setFont(new Font("SERIF", Font.PLAIN, 20));
                    b18.setForeground(Color.black);
                    b18.setBackground(Color.pink);
                    //b17.setOpaque(true);
                    b18.setBorderPainted(false);
                    b18.setBounds(130, 20, 50, 10);
                    f6.add(b18);
                    }
                else if(member==2){
                    JLabel l7 = new JLabel("Name 1");
                    l7.setBounds(80, 80, 200, 25);
                    l7.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l7);
        
                    JTextField tf5 = new JTextField();
                    tf5.setBounds(200, 70, 150, 25);
                    tf5.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf5);

                    JLabel l6 = new JLabel("Age 1");
                    l6.setBounds(80, 100, 200, 25);
                    l6.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l6);
    
                    JTextField tf4 = new JTextField();
                    tf4.setBounds(200, 100, 150, 25);
                    tf4.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf4);

                    JLabel l9 = new JLabel("Name 2");
                    l9.setBounds(80, 150, 200, 50);
                    l9.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l9);
        
                    JTextField tf7 = new JTextField();
                    tf7.setBounds(200, 150, 150, 25);
                    tf7.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf7);

                    JLabel l10 = new JLabel("Age 2");
                    l10.setBounds(80, 180, 200, 25);
                    l10.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(l10);
        
                    JTextField tf8 = new JTextField();
                    tf8.setBounds(200, 180, 150, 25);
                    tf8.setFont(new Font("SERIF", Font.PLAIN, 20));
                    f6.add(tf8);
                    
                    //b17.setText("Book Ticket");
                    b18.setFont(new Font("SERIF", Font.PLAIN, 20));
                    b18.setForeground(Color.black);
                    b18.setBackground(Color.pink);
                    //b18.setOpaque(true);
                    b18.setBorderPainted(false);
                    b18.setBounds(130, 20, 50, 15);
                    f6.add(b18);
                    }

                else{
                    JLabel l6 = new JLabel("You can book maxium two person ticket");
                    l6.setBounds(80, 100, 500, 20);
                    l6.setFont(new Font("SERIF", Font.BOLD, 20));
                    f6.add(l6);
                }
                
                f6.setSize(1000,700);
                f6.setVisible(true);
                f6.setBackground(Color.PINK);
                f6.getContentPane().setBackground(Color.PINK);
                f6.setLayout(null);
            }
        });
       
    }
}
class lastpage extends tickets{
    void lastframe(){
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                JFrame f7 = new JFrame("Exit");
                //b17.setText("Thank You");
                b19.setFont(new Font("SERIF", Font.BOLD, 20));
                b19.setForeground(Color.blue);
                b19.setBackground(Color.pink);
                b19.setOpaque(true);
                b19.setBorderPainted(false);
                b19.setBounds(130, 20, 50, 10);
                f7.add(b19);
                
                f7.setSize(1000,700);
                f7.setVisible(true);
                //f7.setBackground(Color.yellow);
                f7.getContentPane().setBackground(Color.PINK);
                f7.setLayout(null);
            }
        });
    }
}
class booking extends lastpage{
    void Book(){
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();
                
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket(); 
                lastframe(); 
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket(); 
                lastframe(); 
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                bookticket();
                lastframe();  
            }
        });
        
    }
}


class cancel extends booking{
    void cancellation(){
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                JFrame f8 = new JFrame("Cancellation");
                JLabel l11 = new JLabel("Enter Destination:");
                l11.setBounds(80, 80, 200, 25);
                l11.setFont(new Font("SERIF", Font.BOLD, 20));
                f8.add(l11);
    
                JTextField tf9 = new JTextField();
                tf9.setBounds(300, 80, 150, 25);
                tf9.setFont(new Font("SERIF", Font.PLAIN, 20));
                f8.add(tf9);

                JButton b26 = new JButton("Confirm");
                b26.setFont(new Font("SERIF", Font.BOLD, 20));
                b26.setForeground(Color.blue);
                b26.setBackground(Color.pink);
                b26.setOpaque(false);
                b26.setBorderPainted(false);
                b26.setBounds(150, 20, 50, 15);
                f8.add(b26);

                b26.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        JFrame f9 = new JFrame("Exit");
                        JButton b27 = new JButton("Ticket Cancelled Succesfully");
                        b27.setFont(new Font("SERIF", Font.BOLD, 20));
                        b27.setForeground(Color.blue);
                        b27.setBackground(Color.pink);
                        b27.setOpaque(true);
                        b27.setBorderPainted(false);
                        b27.setBounds(130, 20, 50, 10);
                        f9.add(b27);
                        
                        f9.setSize(1000,700);
                        f9.setVisible(true);
                        f9.setBackground(Color.yellow);
                        f9.getContentPane().setBackground(Color.PINK);
                        f9.setLayout(null); 
                    }
                });
                f8.setSize(1000,700);
                f8.setVisible(true);
                f8.setBackground(Color.yellow);
                //f8.getContentPane().setBackground(Color.PINK);
                f8.setLayout(null);
            }
        });
        b4.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        JFrame f9 = new JFrame("Exit");
                        JButton b27 = new JButton("Thank You for using this Application");
                        b27.setFont(new Font("SERIF", Font.BOLD, 20));
                        b27.setBounds(200, 10, 400, 51);
                        b27.setForeground(Color.blue);
                        b27.setBackground(Color.pink);
                        b27.setOpaque(true);
                        b27.setBorderPainted(false);
                        f9.add(b27);
                        
                        f9.setSize(1000,700);
                        f9.setVisible(true);
                        f9.setBackground(Color.yellow);
                        f9.getContentPane().setBackground(Color.PINK);
                        f9.setLayout(null); 
                    }
                });
    }
}

public class task1 {
    public static void main(String[] args) {
        cancel ref = new cancel();
        ref.form();
        ref.features();
        ref.Destination();
        ref.trains();
        //ref.bookticket();
        ref.Book();
        ref.cancellation();
    }
}

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkPackages, bookpackage,ViewHotels,destinations;
    JButton ViewPackage,bookhotel,viewBookedHotel , payments , notepad,calculators,deletedetails,profile,About,Review;
    Dashboard(String username) {
        this.username = username ;
        // setBounds(0,0,1600,1000);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
       
       JPanel p1 =  new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0,0,102));
       p1.setBounds(0,0,1600,65);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
       Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(5,0,70,70);
       p1.add(icon);
       
       JLabel heading = new JLabel ("Dashboard");
       heading.setBounds(80,10,300,40);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
       p1.add(heading);
       
       JPanel p2 =  new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0,0,102));
       p2.setBounds(0,65,300,800);
       add(p2);
       
       addPersonalDetails = new JButton("Add Personal Details");
       addPersonalDetails.setBounds(0,0,300,50);
       addPersonalDetails.setBackground(new Color(0,0,102));
       addPersonalDetails.setForeground(Color.WHITE);
       addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       addPersonalDetails.setMargin(new Insets(0,0,0,60));
       addPersonalDetails.addActionListener(this);
       p2.add(addPersonalDetails);
       
       updatePersonalDetails = new JButton("Update Personal Details");
       updatePersonalDetails.setBounds(0,45,300,50);
       updatePersonalDetails.setBackground(new Color(0,0,102));
       updatePersonalDetails.setForeground(Color.WHITE);
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       updatePersonalDetails.setMargin(new Insets(0,0,0,30));
       updatePersonalDetails.addActionListener(this);
       p2.add(updatePersonalDetails);
       
       viewPersonalDetails = new JButton("View Personal Details");
       viewPersonalDetails.setBounds(0,90,300,50);
       viewPersonalDetails.setBackground(new Color(0,0,102));
       viewPersonalDetails.setForeground(Color.WHITE);
       viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPersonalDetails.setMargin(new Insets(0,0,0,50));
       viewPersonalDetails.addActionListener(this);
       p2.add(viewPersonalDetails);
       
       deletedetails = new JButton("Delete Personal Details");
       deletedetails.setBounds(0,135,300,50);
       deletedetails.setBackground(new Color(0,0,102));
       deletedetails.setForeground(Color.WHITE);
       deletedetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       deletedetails.setMargin(new Insets(0,0,0,32));
       deletedetails.addActionListener(this);
       p2.add(deletedetails);
       
       checkPackages = new JButton("Check Packages");
       checkPackages.setBounds(0,180,300,50);
       checkPackages.setBackground(new Color(0,0,102));
       checkPackages.setForeground(Color.WHITE);
       checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       checkPackages.setMargin(new Insets(0,0,0,99));
       checkPackages.addActionListener(this);
       p2.add(checkPackages);
       
       bookpackage = new JButton("Book Packages");
       bookpackage.setBounds(0,225,300,50);
       bookpackage.setBackground(new Color(0,0,102));
       bookpackage.setForeground(Color.WHITE);
       bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookpackage.setMargin(new Insets(0,0,0,110));
       bookpackage.addActionListener(this);
       p2.add(bookpackage);
       
       ViewPackage = new JButton("View Packages");
       ViewPackage.setBounds(0,270,300,50);
       ViewPackage.setBackground(new Color(0,0,102));
       ViewPackage.setForeground(Color.WHITE);
       ViewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       ViewPackage.setMargin(new Insets(0,0,0,110));
       ViewPackage.addActionListener(this);
       p2.add(ViewPackage);
       
       ViewHotels = new JButton("View Hotels");
       ViewHotels.setBounds(0,315,300,50);
       ViewHotels.setBackground(new Color(0,0,102));
       ViewHotels.setForeground(Color.WHITE);
       ViewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
       ViewHotels.setMargin(new Insets(0,0,0,133));
       ViewHotels.addActionListener(this);
       p2.add(ViewHotels);
       
       bookhotel = new JButton("Book Hotel");
       bookhotel.setBounds(0,360,300,50);
       bookhotel.setBackground(new Color(0,0,102));
       bookhotel.setForeground(Color.WHITE);
       bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookhotel.setMargin(new Insets(0,0,0,142));
       bookhotel.addActionListener(this);
       p2.add(bookhotel);
       
       viewBookedHotel = new JButton("View Booked Hotel");
       viewBookedHotel.setBounds(0,405,300,50);
       viewBookedHotel.setBackground(new Color(0,0,102));
       viewBookedHotel.setForeground(Color.WHITE);
       viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewBookedHotel.setMargin(new Insets(0,0,0,70));
       viewBookedHotel.addActionListener(this);
       p2.add(viewBookedHotel);
       
       destinations = new JButton("Destinations");
       destinations.setBounds(0,450,300,50);
       destinations.setBackground(new Color(0,0,102));
       destinations.setForeground(Color.WHITE);
       destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
       destinations.setMargin(new Insets(0,0,0,123));
       destinations.addActionListener(this);
       p2.add(destinations);
       
       payments = new JButton("Payments");
       payments.setBounds(0,495,300,50);
       payments.setBackground(new Color(0,0,102));
       payments.setForeground(Color.WHITE);
       payments.setFont(new Font("Tahoma",Font.PLAIN,20));
       payments.setMargin(new Insets(0,0,0,148));
       payments.addActionListener(this);
       p2.add(payments);
       
       calculators = new JButton("Calculator");
       calculators.setBounds(0,540,300,50);
       calculators.setBackground(new Color(0,0,102));
       calculators.setForeground(Color.WHITE);
       calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
       calculators.setMargin(new Insets(0,0,0,145));
       calculators.addActionListener(this);
       p2.add(calculators);
       
       notepad = new JButton("Notepad");
       notepad.setBounds(0,585,300,50);
       notepad.setBackground(new Color(0,0,102));
       notepad.setForeground(Color.WHITE);
       notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
       notepad.setMargin(new Insets(0,0,0,155));
       notepad.addActionListener(this);
       p2.add(notepad);
       
       About = new JButton("About");
       About.setBounds(0,630,300,50);
       About.setBackground(new Color(0,0,102));
       About.setForeground(Color.WHITE);
       About.setFont(new Font("Tahoma",Font.PLAIN,20));
       About.setMargin(new Insets(0,0,0,175));
       p2.add(About);
       
       Review = new JButton("Review");
       Review.setBounds(0,675,300,50);
       Review.setBackground(new Color(0,0,102));
       Review.setForeground(Color.WHITE);
       Review.setFont(new Font("Tahoma",Font.PLAIN,20));
       Review.setMargin(new Insets(0,0,0,175));
       p2.add(Review);
       
       profile = new JButton("Profile");
       profile.setBackground(Color.WHITE);
       profile.setForeground(Color.BLACK);
       profile.setBounds(1250,20,100,30);
       profile.addActionListener(this);
       add(profile);
       
       
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1300,900,Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel image = new JLabel(i6);
       image.setBounds(0,0,1900,1000);
       add(image);
       
       JLabel text = new JLabel("Heaven Travel Agency");
       text.setBounds(400,70,1200,115);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,45));
       image.add(text);
       
       
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource()== updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource()== checkPackages) {
            new Checkpackages();
        } else if (ae.getSource()==bookpackage) {
            new BookPackage(username);
        } else if (ae.getSource()== ViewPackage) {
            new ViewPackage(username);
        } else if (ae.getSource()==ViewHotels) {
            new CheckHotels();
        } else if (ae.getSource()==destinations) {
            new Destinations();
        } else if (ae.getSource()==bookhotel) {
            new BookHotel(username);
        } else if (ae.getSource()==viewBookedHotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource()==payments) {
            new Payment();
        }  else if (ae.getSource()==deletedetails) {
            new DeleteDetails(username);   
        } else if (ae.getSource()==calculators) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource()==notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (ae.getSource()==profile) {
            new Profile(username); 
        }
            
    }
    
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}

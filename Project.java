/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import packages
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// creating abstract class 
// Abstraction
abstract class ElectricityBill{
    //declaring abstract method.
    public abstract void BillCalculation(ActionEvent evt); 
    public abstract void GenerateBillNum(ActionEvent evt); 
    public abstract void GenerateCustomerNumber(ActionEvent evt);
}
// Inheritance
// extending ElectricityBill Class
class ElectricityBillingSystem extends ElectricityBill{

    //Declaring variables
    //All Variables are private to acheive encapsulation/data hiding
    private String  rand, random;
    private long randomNumbers, randomNum;
    private double GeneralSalesTax, TVL_Fee, costEnergyCharges, ElectricityDuty;
    private double amount, UnitConsume, tax, subtotal, govt_charges, TotalAmount;
      
    private JButton Exit, Exit1;
    private JButton jButton1, jButton2, jButton3, jButton4, jButton5;
    
    private JCheckBox jCheckBox1, jCheckBox2;
    
    private JLabel jLabel1, jLabel3,  jLabel5;
    private JLabel jLabel6,  jLabel7,  jLabel8,  jLabel9,  jLabel10;
    private JLabel jLabel11, jLabel12, jLabel13, jLabel14, jLabel15;
    private JPanel jPanel2, jPanel3, jPanel4, jPanel6, jPanel7;
    
    private JTextField jTextField1, txtDisplay;
    private JTextField jTextField10, jTextField11, jTextField12, jTextField13;
    private JTextField jTextField2, jTextField3, jTextField4, jTextField5;
    private JTextField jTextField6, jTextField7, jTextField8, jTextField9;
    
    public ElectricityBillingSystem(){
        //This method is used to initialize the form or creates a form.
        initComponents();  
    }
    
    public void initComponents(){
        //creating the objects of Jframe and its components.
        JFrame jf = new JFrame("Electricity Billing System                                 "
                + "Project By Bismah & Farah"); //adding title of the frame
        jf.setVisible(true);
        jf.setSize(200,200);  
        txtDisplay = new JTextField(); 
        jPanel2 = new JPanel();
        jTextField5 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel7 = new JLabel();
        jPanel3 = new JPanel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jTextField8 = new JTextField();
        jTextField9 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField10 = new JTextField();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jCheckBox2 = new JCheckBox();
        jCheckBox1 = new JCheckBox();
        jLabel1 = new JLabel();
        jLabel6 = new JLabel();
        jTextField4 = new JTextField();
        jLabel15 = new JLabel();
        jPanel4 = new JPanel();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jTextField12 = new JTextField();
        jTextField13 = new JTextField();
        jTextField11 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        Exit = new JButton();
        Exit1 = new JButton();
        jButton3 = new JButton();
        jLabel14 = new JLabel();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close JFrame Window.
        jf.getContentPane().setLayout(null);

        txtDisplay.setEditable(false);
        txtDisplay.setFont(new Font("Calibri", 1, 36)); //setting font of the text
        //Action is performed when the text displays
        txtDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        
        //Creating  panel to take information of Bill.
        jPanel2.setBorder(BorderFactory.createTitledBorder("")); //Setting the border of panel 2
        jPanel2.setPreferredSize(new Dimension(930, 370));      //Dimensions of panel
        jPanel2.setLayout(null);

        //Text Field for Bill Number
        jTextField5.setEditable(false);                      
        jTextField5.setFont(new Font("Calibri", 1, 18)); 
        jTextField5.setHorizontalAlignment(JTextField.CENTER);
        jTextField5.setText("");
        jTextField5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               jTextField5ActionPerformed(evt);
            }});
        jPanel2.add(jTextField5);                            //Adding JTextField to the Jpanel
        jTextField5.setBounds(190, 290, 110, 30);            //Setting Bounds of the textField

        //Text Feild for Area Code
        jTextField2.setFont(new Font("Calibri", 1, 18)); 
        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new ActionListener() {    //adding action listner to the Text Field
            public void actionPerformed(ActionEvent evt) {
                jTextField2ActionPerformed(evt);               //call the function to perform an event
            }});
        jPanel2.add(jTextField2);
        jTextField2.setBounds(190, 80, 110, 30);

        //Text Feild for Meter Number
        jTextField3.setFont(new Font("Calibri", 1, 18)); 
        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }});
        jPanel2.add(jTextField3);
        jTextField3.setBounds(190, 140, 110, 30);

        //This is a button to generate Bill Number.
        jButton4=new JButton();
        jButton4.setFont(new Font("Calibri", 1, 18)); 
        jButton4.setHorizontalAlignment(SwingConstants.CENTER);//Sets the alignment along the X axis.
        jButton4.setText("BILLNUMBER");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               GenerateBillNum(evt);
           }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(20, 290, 140, 30);

        //This Button is used to generate a Customer Number
        jButton5=new JButton();
        jButton5.setFont(new Font("Calibri", 1, 18));
        jButton5.setText("CUSTOMERNO");
        jButton5.setToolTipText("");//sets the tooltip text for the component
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GenerateCustomerNumber(evt);
            }});
        jPanel2.add(jButton5);
        jButton5.setBounds(30, 30, 140, 30);

        //Creating Label for Area Code
        jLabel7.setFont(new Font("Calibri", 1, 18)); 
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("AREA CODE");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 80, 140, 30);

        jPanel3.setMinimumSize(new Dimension(570, 350));
        jPanel3.setPreferredSize(new Dimension(550, 330));//sets the preferred size
        jPanel3.setLayout(null);

        jLabel8.setFont(new Font("Calibri", 1, 18));  //Creating Label for Electricity Duty and setting its  font.
        jLabel8.setText("ELECTRICITY DUTY");          // text of the label.
        jPanel3.add(jLabel8);                         //Add label to the panel.
        jLabel8.setBounds(30, 70, 190, 40);           //Setting Bounds of the label.

        jLabel9.setFont(new Font("Calibri", 1, 18)); //Creating Label for CostOfEnergy Charges
        jLabel9.setText("COST OF ENERGYCHARGE");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 20, 230, 40);

        jLabel10.setFont(new Font("Calibri", 1, 18));  //Label for GeneralSalesTax
        jLabel10.setText("GENERAL SALES TAX");
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 120, 270, 40);

        //Setting Text Field for General Sales Tax
        jTextField8.setEditable(false);
        jTextField8.setFont(new Font("Calibri", 1, 18)); 
        jTextField8.setHorizontalAlignment(JTextField.CENTER);
        jTextField8.setText("0");
        jTextField8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8);
        jTextField8.setBounds(330, 120, 110, 30);

        // Text Field for TVL Fee
        jTextField9.setEditable(false);
        jTextField9.setFont(new Font("Calibri", 1, 18));
        jTextField9.setHorizontalAlignment(JTextField.CENTER);
        jTextField9.setText("0");
        jTextField9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(270, 220, 110, 30);

        //Text Feild for Cost Of Energy Charges.
        jTextField6.setEditable(false);//setEditable(false) makes the TextField uneditable
        jTextField6.setFont(new Font("Calibri", 1, 18)); 
        jTextField6.setHorizontalAlignment(JTextField.CENTER);
        jTextField6.setText("0");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(330, 20, 110, 30);

        //Text Field for Electricity Duty
        jTextField7.setEditable(false);
        jTextField7.setFont(new Font("Calibri", 1, 18)); 
        jTextField7.setHorizontalAlignment(JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7);
        jTextField7.setBounds(330, 70, 110, 30);

        //Text Field for Government Charges
        jTextField10.setEditable(false);
        jTextField10.setFont(new Font("Calibri", 1, 18)); 
        jTextField10.setHorizontalAlignment(JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10);
        jTextField10.setBounds(270, 280, 110, 30);

        jLabel3.setFont(new Font("Calibri", 1, 24)); // Setting Label of TVL Fee
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("TVL Fee");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 220, 100, 30);

        jLabel5.setFont(new Font("Calibri", 1, 24)); //Setting Label of Government Charges.
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("GOVT CHARGES");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 280, 160, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(310, 20, 570, 330);

        //TextField for Cutomer Number
        jTextField1.setEditable(false);
        jTextField1.setFont(new Font("Calibri", 1, 18)); 
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("");
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }});
        jPanel2.add(jTextField1);
        jTextField1.setBounds(190, 30, 110, 30);

        // Checkbox for Units Consume
        jCheckBox2.setFont(new Font("Calibri", 1, 14)); 
        jCheckBox2.setText("UNITS CONSUMED");
        jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }});
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(20, 210, 150, 30);

        //CheckBox for MeterNumber
        jCheckBox1.setFont(new Font("Calibri", 1, 14)); 
        jCheckBox1.setText("METER NUMBER");
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }});
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(20, 140, 160, 30);

        jLabel1.setFont(new Font("Calibri", 1, 12));  //Label for Unit Consumed
        jLabel1.setText("Enter Units Consumed");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 240, 180, 20);

        jLabel6.setFont(new Font("Calibri", 1, 12)); //Label for Meter Number
        jLabel6.setText("Enter your Meter Number");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 170, 180, 20);

        //Text Field for Unit Consume
        jTextField4.setFont(new Font("Calibri", 1, 18)); 
        jTextField4.setHorizontalAlignment(JTextField.CENTER);
        jTextField4.setText("0");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(190, 210, 60, 30);

        jLabel15.setFont(new Font("Calibri", 1, 18)); //Setting Label of Units
        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel15.setText("Units");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(250, 210, 50, 30);

        jf.getContentPane().add(jPanel2);// retrieves the content pane layer so that you can add an object to it
        jPanel2.setBounds(230, 110, 910, 370);
        jf.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 10, 10);
        jf.getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 10, 10);

        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new Dimension(1200, 110));
        jPanel7.setLayout(null);

        //Label for Total Amount
        jLabel11.setFont(new Font("Calibri", 1, 24)); 
        jLabel11.setText("TOTAL AMOUNT");
        jLabel11.setToolTipText("");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(160, 90, 180, 30);

        //Label for SubTotal
        jLabel12.setFont(new Font("Calibri", 1, 24)); 
        jLabel12.setText("SUB TOTAL");
        jLabel12.setToolTipText("");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(160, 10, 180, 30);

        //Label for Tax 
        jLabel13.setFont(new Font("Calibri", 1, 24)); 
        jLabel13.setText("TAX");
        jLabel13.setToolTipText("");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(160, 50, 180, 30);

        //Text Field for Tax
        jTextField12.setEditable(false);
        jTextField12.setFont(new Font("Calibri", 1, 18)); 
        jTextField12.setHorizontalAlignment(JTextField.CENTER);
        jTextField12.setText("Rs 0.00");
        jTextField12.setPreferredSize(new Dimension(65, 30));
        jTextField12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }});
        jPanel7.add(jTextField12);
        jTextField12.setBounds(380, 50, 310, 30);

        //Text Feild for Total Amount
        jTextField13.setEditable(false);
        jTextField13.setFont(new Font("Calibri", 1, 18)); 
        jTextField13.setHorizontalAlignment(JTextField.CENTER);
        jTextField13.setText("Rs 0.00");
        jTextField13.setPreferredSize(new Dimension(65, 30));
        jTextField13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }});
        jPanel7.add(jTextField13);
        jTextField13.setBounds(380, 90, 310, 30);

        //Text Field for SubTotal
        jTextField11.setEditable(false);
        jTextField11.setFont(new Font("Calibri", 1, 18)); 
        jTextField11.setHorizontalAlignment(JTextField.CENTER);
        jTextField11.setText("Rs 0.00");
        jTextField11.setPreferredSize(new Dimension(65, 30));
        jPanel7.add(jTextField11);
        jTextField11.setBounds(380, 10, 310, 30);

        jButton1.setFont(new Font("Calibri", 1, 24)); //Calculate Button
        jButton1.setText("Calculate");
        jButton1.addActionListener(new ActionListener() {  //When calculate button is pressed it performs calcultion
            public void actionPerformed(ActionEvent evt) { //according to the given values or units
                BillCalculation(evt);   //when the button is clicked all the calcultions performed
                WriteInFile(evt);      //Function called to perform an event
            }});
        jPanel7.add(jButton1);
        jButton1.setBounds(760, 70, 310, 50);

        jButton2.setFont(new Font("Calibri", 1, 24));  //Clear Button is used to clear all the selections.
        jButton2.setText("Clear");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }});
        jPanel7.add(jButton2);
        jButton2.setBounds(760, 10, 310, 50);

        // Exit button is used to exit the frame or close the frame.
        jButton3.setFont(new Font("Calibri", 1, 24)); 
        jButton3.setText("EXIT");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }});
        jPanel7.add(jButton3);
        jButton3.setBounds(1110, 40, 100, 60);

        jf.getContentPane().add(jPanel7);
        jPanel7.setBounds(20, 490, 1250, 130);

        //Label for Electricity Billing System
        jLabel14.setFont(new Font("Calibri", 1, 48)); 
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel14.setText("ELECTRICITY BILLLNG SYSTEM");
        jf.getContentPane().add(jLabel14);
        jLabel14.setBounds(220, 20, 790, 80);

        jf.pack();
    }

    public void txtDisplayActionPerformed(ActionEvent evt)   {}//Action performed when txtDisplay is called
    public void jTextField10ActionPerformed(ActionEvent evt) {}
    public void jTextField5ActionPerformed(ActionEvent evt)  {}
    public void jTextField8ActionPerformed(ActionEvent evt)  {}   
    public void jTextField1ActionPerformed(ActionEvent evt)  {}
   
    //Method  to Generate Bill Number
    public void GenerateBillNum(ActionEvent evt){
        if(evt.getSource()== jButton4){       //If this button is pressed it generate a random Bill Number
        long num1=10000;                       //for every bill
        long num2=100000;
        randomNum = (long )(Math.random() *(num2-num1+1)+num1); //to generate random number 
        rand="BILL"+randomNum;                                   //Bill Number
        jTextField5.setText(String.valueOf(rand));              //Setting text
        }
    }
    //Method to Generate Customer Number
    public void GenerateCustomerNumber(ActionEvent evt){
        if(evt.getSource()== jButton5){       // If the button is pressed it generates a random Customer Number
        long num1=10000;                      // for every customer.
        long num2=100000;
        randomNumbers = (long )(Math.random() *(num2-num1+1)+num1); //method for random numbers 
        random="LA"+randomNumbers;                            // Custommer Number
        jTextField1.setText(String.valueOf(random));
        }
     }
    public void jTextField9ActionPerformed(ActionEvent evt) {}
    public void jTextField12ActionPerformed(ActionEvent evt) {}
    public void jTextField13ActionPerformed(ActionEvent evt) {}

    //Method to Calculate Bill
    public void BillCalculation(ActionEvent evt) {
        // If checkbox2(Unit Consumed) is selected It performs calcultions
       if((jCheckBox2.isSelected()))             
       {
           //converting its text to double.
           UnitConsume= Double.parseDouble(jTextField4.getText());  
           // Conditions to calculate bill with respect to its unit.
           if(UnitConsume <= 200){                                  
               amount = UnitConsume * 10.06;
           }
           else if(UnitConsume >= 201 && UnitConsume <=300 ){
               amount= (200*10.06)+((UnitConsume-200)*12.15); 
           }
           else if(UnitConsume >= 301 && UnitConsume <= 700){
               amount = (300*12.15)+((UnitConsume-300)*19.25);
           }
           else if(UnitConsume >= 701 ){
               amount = (700 * 19.25) + ((UnitConsume-700)*28.35);
           }
           
           costEnergyCharges = amount;
           ElectricityDuty = amount * 1.5/100;            //Calculating Electricity Duty of 1.5%.
           GeneralSalesTax = amount* 17.255/100;          //Calculating sales tax of 17.55%.
           TVL_Fee= 35.00;                                //TVL Fee is fixed
           subtotal = amount;
           tax = ElectricityDuty + GeneralSalesTax + TVL_Fee ;       //Calculating total Tax by adding all the charges.
           govt_charges=ElectricityDuty + GeneralSalesTax + TVL_Fee;
           TotalAmount = subtotal + tax;
           
           String item = String.format("%.2f",amount);
           jTextField6.setText((String)item);
           
           String e_duty = String.format("%.2f",ElectricityDuty);
           jTextField7.setText((String)e_duty);
           
           String gst = String.format("%.2f",GeneralSalesTax);
           jTextField8.setText((String)gst);
           
           String tvl = String.format("%.2f",TVL_Fee);
           jTextField9.setText((String)tvl);
           
           String s = String.format("%.2f",govt_charges);
           jTextField10.setText((String)s);
           
           String sub = String.format("%.2f",subtotal);
           jTextField11.setText((String)sub);
           
           String ta = String.format("%.2f",tax);
           jTextField12.setText((String)ta);
           
           String a = String.format("%.2f",TotalAmount);
           jTextField13.setText((String)a);
       }
       else
       {
           txtDisplay.setText("Enter Choice");
       }
    }
    //When this button is pressed.it sets all the textfeild to 0
    public void jButton2ActionPerformed(ActionEvent evt){ 
       txtDisplay.setText("");
       jTextField1.setText("");
       jTextField5.setText("");
       jTextField2.setText("0");
       jTextField3.setText("0");
       jTextField4.setText("0");
       jTextField6.setText("0");
       jTextField7.setText("0");
       jTextField8.setText("0");
       jTextField9.setText("0");
       jTextField10.setText("0");
       jTextField11.setText("Rs 0.00");
       jTextField12.setText("Rs 0.00");
       jTextField13.setText("Rs 0.00");
    }

    public void jTextField2ActionPerformed(ActionEvent evt) {}
    public void jTextField3ActionPerformed(ActionEvent evt) {}

    public void jCheckBox1ActionPerformed(ActionEvent evt) {  //Method for checkbox of Mter number 
       if(jCheckBox1.isSelected())                            //if its selected it gives option to write  
       {                                                      //otherwise it sets to 0
           jTextField3.setEditable(true);
           jTextField3.setText(" ");
           jTextField3.requestFocus(); //request that the given Component gets set to a focused state.
       }
       else
       {
           jTextField3.setEditable(true);
           jTextField3.setText("0");   
       }
    }
    public void jCheckBox2ActionPerformed(ActionEvent evt) {  //Mtehod for checkbox of Unitsif its selected it gives option to write
       if(jCheckBox2.isSelected())                            //otherwise it sets to 0
       {
           jTextField4.setEditable(true);
           jTextField4.setText(" ");
           jTextField4.requestFocus();
       }
       else
       {
           jTextField4.setEditable(true);
           jTextField4.setText("0");    
       }
    }
    public void jTextField7ActionPerformed(ActionEvent evt) {}
    public void jButton3ActionPerformed(ActionEvent evt) { //to exit a window.
       System.exit(0);
    }
    
    // Method to write On file to keep records of all the users
    public void WriteInFile(ActionEvent evt){
    try{
        File file = new File("userInfo.txt");        //create object of file
        FileWriter fr = new FileWriter(file, true);  //create object of filewriter
        BufferedWriter br = new BufferedWriter(fr);  //create object of bufferdwriter
        PrintWriter pw = new PrintWriter(br);        //create object of printwriter
        
        String custNo   = "Customer Number  : " + random;
        String Billno   = "Bill Number      : " + rand;
        String units    = "Units Consume    : " + UnitConsume;
        String Amount   = "Amount           : " + String.format("%.2f", amount);
        String GST      = "General Sales Tax: " + String.format("%.2f",GeneralSalesTax);
        String E_duty   = "Electricity Duty : " + String.format("%.2f",ElectricityDuty);
        String TVL      = "TVL Fee          : " + String.format("%.2f",TVL_Fee);
        String totaltax = "Total tax        : " + String.format("%.2f",tax);
        String t_bill   = "Total Bill       : " + String.format("%.2f",TotalAmount);
        
        //writing in file
        pw.println(custNo);
        pw.println(Billno);
        pw.println(units);
        pw.println(Amount);
        pw.println(GST);
        pw.println(E_duty);
        pw.println(TVL);
        pw.println(totaltax);
        pw.println(t_bill);
        pw.println();
        
        pw.flush();     //enforce all data to write in file
        pw.close();     //close PrintWriter
        br.close();     //close BufferedWriter
        fr.close();     //close FileWriter
    }
    catch(Exception e){
        System.out.println(e);
    }
    }

}
class Registration {     //registration class
    
    // Variables declaration
    private String name1,name2,Address,em,pn,pd;
    private JPanel jPanel1,jPanel2;
    private JLabel heading,fname,lname,add,emailId,phoneNo,pass;
    private JTextField firstname,lastname,address,email,phone;
    private JPasswordField password;
    private JButton login,reset,exit;
    
    //constructor
    public Registration(){
        initComponents();
    }
    //This method is called from within the constructor to initialize the form.
    private void initComponents() {
         JFrame jf1 = new JFrame("Electricity Billing System                                 "
                + "Project By Bismah & Farah"); //adding title of the frame 
        jf1.setVisible(true);     // make window visible   
       
        //create objects of panels
        jPanel1 = new JPanel();  
        jPanel2 = new JPanel();
        
        //create objects of labels
        heading = new JLabel();
        fname = new JLabel();
        lname = new JLabel();
        add = new JLabel();
        emailId = new JLabel();
        phoneNo = new JLabel();
        pass = new JLabel();
        
        //create objects of textfields
        firstname = new JTextField();
        lastname = new JTextField();
        address = new JTextField();
        email = new JTextField();
        phone = new JTextField();
        password = new JPasswordField();
        
        //create objects of buttons
        login = new JButton();
        reset = new JButton();
        exit = new JButton();
        
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); ///close window
        jf1.getContentPane().setLayout(null);//retrieves the content pane layer so that you can add an object to it

        jPanel1.setBackground(new Color(102, 102, 102));  //sets background of panel1
        jPanel1.setLayout(null);

        heading.setBackground(new Color(204, 204, 204)); //set background color of heading(Jlabel)
        heading.setFont(new Font("Calibri", 1, 36)); //set font of heading(Jlabel)
        heading.setForeground(new Color(204, 255, 255)); //set foreground color of heading(Jlabel)
        heading.setText("Registration Form For Electricity Billing"); //set text of heading(Jlabel)
        jPanel1.add(heading); //add heading on panel1 
        heading.setBounds(100, 20, 600, 50); //set bounds of heading 

        jf1.getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 20, 820, 100);

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setLayout(null);
        
        fname.setFont(new Font("Calibri", 1, 18)); 
        fname.setText("FIRST NAME");
        jPanel2.add(fname);
        fname.setBounds(110, 50, 170, 40);
        
        lname.setFont(new Font("Calibri", 1, 18)); 
        lname.setText("LAST NAME");
        jPanel2.add(lname);
        lname.setBounds(110, 100, 170, 40);
        
        add.setFont(new Font("Calibri", 1, 18));
        add.setText("ADDRESS");//EMAIL ID
        jPanel2.add(add);
        add.setBounds(110, 150, 170, 40);
        
        emailId.setFont(new Font("Calibri", 1, 18)); 
        emailId.setText("EMAIL ID"); 
        jPanel2.add(emailId);
        emailId.setBounds(110, 200, 236, 40);
        
        phoneNo.setFont(new Font("Calibri", 1, 18)); 
        phoneNo.setText("PHONE NO");
        jPanel2.add(phoneNo);
        phoneNo.setBounds(110, 250, 160, 40);
        
        pass.setFont(new Font("Calibri", 1, 18)); 
        pass.setText("PASSWORD");
        jPanel2.add(pass);
        pass.setBounds(110, 300, 230, 40);

        firstname.setFont(new Font("Calibri", 1, 18)); //set font of firstname(JTextField)
        jPanel2.add(firstname);    //add firstname(JTextField) on panel2
        firstname.setBounds(380, 60, 200, 30); //set Bounds pf firstname(JTextField)

        lastname.setFont(new Font("Calibri", 1, 18));
        jPanel2.add(lastname);
        lastname.setBounds(380, 110, 200, 30);
        
        address.setFont(new Font("Calibri", 1, 18));
        jPanel2.add(address);
        address.setBounds(380, 160, 200, 30);
        
        email.setFont(new Font("Calibri", 1, 18));
        jPanel2.add(email);
        email.setBounds(380, 210, 200, 30);

        phone.setFont(new Font("Calibri", 1, 18)); 
        jPanel2.add(phone);
        phone.setBounds(380, 260, 200, 30);
        
        jPanel2.add(password);
        password.setBounds(380, 300, 200, 30);

        login.setFont(new java.awt.Font("Calibri", 1, 18));  //set font of login button
        login.setText("Login"); //set text
        login.addActionListener(new ActionListener(){    //add actionlistener on login button
            public void actionPerformed(ActionEvent evt) { // method of ActionListener interface
                loginActionPerformed(evt);       //call method when login button clicked
            }
        });
        jPanel2.add(login); //add login button on panel2
        login.setBounds(260, 380, 100, 40);//set bounds of login button

        reset.setFont(new java.awt.Font("Calibri", 1, 18)); 
        reset.setText("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetActionPerformed(evt); //call method when reset button clicked
            }
        });
        jPanel2.add(reset);
        reset.setBounds(380, 380, 100, 40);
        
        exit.setFont(new java.awt.Font("Calibri", 1, 18));
        exit.setText("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitActionPerformed(evt); //call method when exit button clicked
            }
        });
        jPanel2.add(exit);
        exit.setBounds(490, 380, 100, 40);

        jf1.getContentPane().add(jPanel2);
        jPanel2.setBounds(150, 130, 820, 450);

        jf1.pack(); //pack
    }
    //when login button clicked this method will call
    public void loginActionPerformed(ActionEvent evt){ 
     /*sets condition if registration method is completely filled then
       go to electricity billing system*/
        if(firstname.getText().trim().isEmpty()  || lastname.getText().trim().isEmpty()
           || address.getText().trim().isEmpty() || email.getText().trim().isEmpty()
           || phone.getText().trim().isEmpty()   || password.getText().trim().isEmpty())
        {
            firstname.setText("");
            lastname.setText(""); 
            email.setText("");
            phone.setText("");
            password.setText("");
            address.setText("");
        }
        else{
            //creates the obj of ElectricityBillingSystem class
            ElectricityBillingSystem  BillingSystem= new ElectricityBillingSystem();
            TakeInputAndWriteInFile(evt);    //to store information of all users
        }         
    }
    //when reset button clicked this method will call
    public void resetActionPerformed(ActionEvent evt){
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        email.setText("");
        phone.setText("");
        password.setText("");
    }
    //when exit button clicked this method will call
    public void exitActionPerformed(ActionEvent evt){
        System.exit(0);
    }
   
    //file hanling with exception handling using try catch block
    public void TakeInputAndWriteInFile(ActionEvent evt){
        name1 = firstname.getText();     //getting data in the variable
        name2 = lastname.getText();
        Address = address.getText();
        em = email.getText();
        pn = phone.getText();
        pd = password.getText();
    try{
        File file = new File("userInfo.txt");        //create object of file
        FileWriter fr = new FileWriter(file, true);  //create object of filewriter
        BufferedWriter br = new BufferedWriter(fr);  //create object of bufferdwriter
        PrintWriter pw = new PrintWriter(br);        //create object of printwriter
        
        //making string to write in file
        
        String s1 = "First Name: "+name1;
        String s2 = "Last Name:  "+name2;
        String s3 = "Address:    "+Address;
        String s4 = "Email:      "+em;
        String s5 = "Phone:      "+pn;
        String s6 = "Password:   "+pd;
        
        //writing in file
        pw.println(s1);
        pw.println(s2);
        pw.println(s3);
        pw.println(s4);
        pw.println(s5);
        pw.println(s6);
       
        pw.flush();     //enforce all data to write in file
        pw.close();     //close PrintWriter
        br.close();     //close BufferedWriter
        fr.close();     //close FileWriter
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
     //main method
   public static void main(String args[]) {
        // Set the Nimbus look and feel
        /*Nimbus uses Java 2D vector graphics to draw the user interface.
        The first line of code retrieves the list of all installed look and feel
        implementations for the platform and then iterates through the list to 
        determine if Nimbus is available. If so, Nimbus is set as the look and feel.
        Look" refers to the appearance of GUI widgets(more formally,JComponents)
        and "feel" refers to the way the widgets behave.*/
 /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html*/
       try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch(UnsupportedLookAndFeelException e){
            System.out.println(e);
         }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(InstantiationException e){
            System.out.println(e);
        }
        catch(IllegalAccessException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){ //EventQueue is a platform-independent class that queues events
            public void run() {     // invokeLater(Runnable runnable) Causes runnable to have its run method 
                new Registration();
            }
        });
    }
}

/*Reference: https://github.com/Jiteshshetty0411/Java-Mini-Project */
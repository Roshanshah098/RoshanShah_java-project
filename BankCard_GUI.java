
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *  Description of class BANKCARD_GUI with DEBITCARD_GUI, CREDITCARD_GUI methods here.
 *
 * @author Roshan Shah
 * @version 1.1
 */
public class BankCard_GUI implements ActionListener
{    
    //Creating frame for debitcard
    private JFrame frame1;
    private JPanel panel1;
    private JLabel title,CardID, Cname,PINnum,Bankaccount,BalanceAmount,Issuerbank;
    private JButton btn_Add_To_Debit_Card,btnWithdrawal_from_Debit_card,btnDispay,btnClear,btnclose,btnProceed_to_CreditCard;

    private JTextField card_Id_txt,client_Name_txt,issuer_Bank_txt,bank_Account_txt,pin_Number_txt,balance_Amount_txt;
    ArrayList<BankCard> bankcard_arr = new ArrayList<BankCard>();  
    //calling constrcutor bankcard_GUI to frame1
    public BankCard_GUI(){           

        frame1 = new JFrame("Bank_GUI of DebitCard");   
        panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setLayout(null);
        frame1.add(panel1);

        title = new JLabel("DebitCard");
        title.setBounds(218,17,117,36);
        panel1.add(title);
        title.setFont(new Font("ARIAL", Font.BOLD,20));     //setting font size for better bold

        CardID = new JLabel("Card ID:");  
        Cname = new JLabel("ClientName:"); 
        PINnum = new JLabel("PIN number:");
        Bankaccount = new JLabel("BankAccount:"); 
        BalanceAmount = new JLabel("BalanceAmount:"); 
        Issuerbank = new JLabel("IssuerBank:"); 

        card_Id_txt = new JTextField();
        client_Name_txt = new JTextField();
        pin_Number_txt = new JTextField();
        bank_Account_txt = new JTextField();
        balance_Amount_txt = new JTextField(); 
        issuer_Bank_txt = new JTextField();

        CardID.setBounds(44,98,53,20);
        Cname.setBounds(315,98,73,20);
        PINnum.setBounds(44,139,79,20);
        Bankaccount.setBounds(315,139,82,20);
        BalanceAmount.setBounds(44,187,105,20);
        Issuerbank.setBounds(315,187,70,20);

        card_Id_txt.setBounds(168,98,132,20); 
        client_Name_txt.setBounds(433,98,113,20);
        pin_Number_txt.setBounds(168,139,132,20 );
        bank_Account_txt.setBounds(433,139,113,20);
        balance_Amount_txt.setBounds(168,187,132,20); 
        issuer_Bank_txt.setBounds(433,187,113,20);

        btn_Add_To_Debit_Card = new JButton("Add a Debit Card");
        btn_Add_To_Debit_Card.setFont(new Font("Courier", Font.BOLD,15));
        btn_Add_To_Debit_Card.setBounds(38,324,239,32);
        btnProceed_to_CreditCard = new JButton("Proceed to CreditCard");
        btnProceed_to_CreditCard.setFont(new Font("Courier", Font.BOLD,15));
        btnProceed_to_CreditCard.setBounds(315,321,208,32);
        panel1.add(btnProceed_to_CreditCard);

        btnclose = new JButton("Close");     //close buttons
        btnclose.setFont(new Font("ARIAL", Font.BOLD,10));
        btnclose.setBounds(315,404,68,20);
        btnWithdrawal_from_Debit_card = new JButton("Withdrawal from Debit card");
        btnWithdrawal_from_Debit_card.setFont(new Font("ARIAL", Font.BOLD,12));
        btnWithdrawal_from_Debit_card.setBounds(38,269,239,35);

        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("ARIAL", Font.BOLD,10));
        btnClear.setBounds(474,404,76,20);
        btnDispay = new JButton("display");
        btnDispay.setFont(new Font("ARIAL", Font.BOLD,9));
        btnDispay.setBounds(44,403,73,22);

        panel1.add(btnWithdrawal_from_Debit_card);
        panel1.add(btnClear);
        panel1.add(btnDispay);
        panel1.add(btn_Add_To_Debit_Card);     //Add the buttons to frame 1
        panel1.add(btnclose);
        panel1.add(btnDispay);
        panel1.add(CardID);
        panel1.add(Cname);
        panel1.add(PINnum);
        panel1.add(Bankaccount);
        panel1.add(BalanceAmount);
        panel1.add(Issuerbank);
        panel1.add(btnProceed_to_CreditCard);

        panel1.add(card_Id_txt);
        panel1.add(client_Name_txt);
        panel1.add(issuer_Bank_txt);
        panel1.add(bank_Account_txt);
        panel1.add(pin_Number_txt);            
        panel1.add(balance_Amount_txt);

        //Creating an object
        btnDispay.addActionListener(this); 
        btnWithdrawal_from_Debit_card.addActionListener(this);      // aligning ActionListener along with buttons
        btn_Add_To_Debit_Card.addActionListener(this);
        btnclose.addActionListener(this);
        btnClear.addActionListener(this);
        btnProceed_to_CreditCard.addActionListener(this);

        //Display frame 1
        //frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setSize(600,480);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);

    }
    //frame2
    private JFrame frame2;
    private JPanel panel2;

    private JLabel l1frame2,l2frame2,l3frame2,l4frame2,l5frame2,l6frame2,l7frame2,l8frame2,l9frame2;

    private JTextField txt_cardID,txt_clientName,txt_issuerBank,txt_intererstRate,txt_cvcNumber,txt_bankAcount,txt_balanceAmount;
    private JButton btnDispay_frame2,btnClear_frame2,close_frame2,btnCancelCreditCard_frame2,btnCreditLimit_frame2,btnBack_To_Debit_Card,btn_Add_To_Credit_Card;
    private JComboBox box_frame2,box2_frame2,box3_frame2;

    //# Frame for Credit card.
    public  void CreditCard_GUI()
    {
        frame2 = new JFrame("Bank_GUI Of CreditCard");
        panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(null);
        frame2.add(panel2); 

        title = new JLabel("CreditCard");
        title.setBounds(210,23,126,36);
        panel2.add(title);
        //this is for incresing font size.
        title.setFont(new Font("ARIAL", Font.BOLD,20));

        l1frame2 = new JLabel("Card ID:");
        l2frame2 = new JLabel("ClientName:");
        l3frame2 = new JLabel("IssuerBank:");
        l4frame2 = new JLabel("BankAccount:");
        l5frame2 = new JLabel("BalanceAmount:");
        //l6frame2 = new JLabel("");
        l7frame2 = new JLabel("CVC Number:");
        l8frame2 = new JLabel("InterestRate:");
        l9frame2 = new JLabel("ExpirationDate:");
        //for ComboBox.
        box_frame2 = new JComboBox();
        box_frame2.addItem("1");
        box_frame2.addItem("2");
        box_frame2.addItem("3");
        box_frame2.addItem("4");
        box_frame2.addItem("5");
        box_frame2.addItem("6");
        box_frame2.addItem("7");
        box_frame2.addItem("8");
        box_frame2.addItem("9");
        box_frame2.addItem("10");
        box_frame2.addItem("11");
        box_frame2.addItem("12");
        box_frame2.addItem("13");
        box_frame2.addItem("14");
        box_frame2.addItem("15");
        box_frame2.addItem("16");
        box_frame2.addItem("17");
        box_frame2.addItem("18");
        box_frame2.addItem("19");
        box_frame2.addItem("20");
        box_frame2.addItem("21");
        box_frame2.addItem("22");
        box_frame2.addItem("23");
        box_frame2.addItem("24");
        box_frame2.addItem("25");
        box_frame2.addItem("26");
        box_frame2.addItem("27");
        box_frame2.addItem("28");
        box_frame2.addItem("29");
        box_frame2.addItem("30");

        box2_frame2 = new JComboBox();
        box2_frame2.addItem("January");
        box2_frame2.addItem("Feburary");
        box2_frame2.addItem("March");
        box2_frame2.addItem("April");
        box2_frame2.addItem("June");
        box2_frame2.addItem("July");
        box2_frame2.addItem("August");
        box2_frame2.addItem("September");
        box2_frame2.addItem("October");
        box2_frame2.addItem("November");
        box2_frame2.addItem("December");

        box3_frame2 = new JComboBox(); 
        box3_frame2.addItem("2020");
        box3_frame2.addItem("2021");
        box3_frame2.addItem("2022");
        box3_frame2.addItem("2023");

        txt_cardID = new JTextField();
        txt_clientName = new JTextField();
        //txt_pinNumber = new JTextField();
        txt_bankAcount = new JTextField();
        txt_balanceAmount = new JTextField();
        txt_issuerBank = new JTextField();
        txt_cvcNumber = new JTextField();
        txt_intererstRate = new JTextField();

        l1frame2.setBounds(44,98,53,20);
        l2frame2.setBounds(315,98,73,20);
        l3frame2.setBounds(44,139,79,20);
        l4frame2.setBounds(315,139,82,20);
        l5frame2.setBounds(44,187,105,20);
        //l6frame2.setBounds(315,187,70,20);
        l7frame2.setBounds(44,239,96,20);
        l8frame2.setBounds(44,286,84,20);
        l9frame2.setBounds(315,242,103,20);

        txt_cardID.setBounds(168,98,132,20);
        txt_clientName.setBounds(433,98,113,20);
        txt_issuerBank.setBounds(168,139,132,20);
        txt_bankAcount.setBounds(433,139,113,20);
        txt_balanceAmount.setBounds(168,187,132,20);
        //txt_issuerBank.setBounds(433,187,113,20);
        txt_cvcNumber.setBounds(168,240,132,20); 
        txt_intererstRate.setBounds(168,286,132,20); 

        box_frame2.setBounds(318,274,60,32);
        box2_frame2.setBounds(392,274,82,32);
        box3_frame2.setBounds(490,274,70,32);

        panel2.add(l1frame2);
        panel2.add(l2frame2);
        panel2.add(l3frame2);
        panel2.add(l4frame2);
        panel2.add(l5frame2);
        //panel2.add(l6frame2);
        panel2.add(l7frame2);
        panel2.add(l8frame2);
        panel2.add(l9frame2);

        panel2.add(txt_cardID);
        panel2.add(txt_clientName);
        panel2.add(txt_issuerBank);
        panel2.add(txt_intererstRate);
        panel2.add(txt_cvcNumber);
        panel2.add(txt_bankAcount);
        panel2.add(txt_balanceAmount);

        panel2.add(box_frame2);
        panel2.add(box2_frame2);
        panel2.add(box3_frame2);

        btnClear_frame2 = new JButton("Clear");
        btnDispay_frame2 = new JButton("display");
        close_frame2 = new JButton("Close");

        btnClear_frame2.setBounds(469,492,82,20);
        btnDispay_frame2.setBounds(44,492,79,22);
        close_frame2.setBounds(367,492,82,20);

        panel2.add(btnClear_frame2);
        panel2.add(btnDispay_frame2);
        panel2.add(close_frame2);

        btnBack_To_Debit_Card = new JButton("Back To DebitCard"); 
        btnBack_To_Debit_Card.setBounds(322,440,239,32);
        panel2.add(btnBack_To_Debit_Card);

        btnCancelCreditCard_frame2 = new JButton("Cancel CreditCard");
        btnCancelCreditCard_frame2.setBounds(44,424,166,32);
        panel2.add(btnCancelCreditCard_frame2);

        btnCreditLimit_frame2 = new JButton("Set CreditLimit");
        btnCreditLimit_frame2.setBounds(44,367,166,35);
        panel2.add(btnCreditLimit_frame2);

        btn_Add_To_Credit_Card = new JButton("Add to CreditCard");
        btn_Add_To_Credit_Card.setBounds(322,358,239,53);
        panel2.add(btn_Add_To_Credit_Card);

        //Create an object
        //BankCard_GUI obj=new BankCard_GUI();

        //#Associate ActionListener along with buttons
        close_frame2.addActionListener(this);
        btnClear_frame2.addActionListener(this);
        btnDispay_frame2.addActionListener(this);
        btnCancelCreditCard_frame2.addActionListener(this);
        btnCreditLimit_frame2.addActionListener(this);
        btn_Add_To_Credit_Card.addActionListener(this);
        btnBack_To_Debit_Card.addActionListener(this);

        //Display frame 2
        //frame2.setLayout(null); 
        frame2.setResizable(false); 
        frame2.setVisible(true); 
        frame2.setSize(620,580);
        frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
    }

    //frame3 
    private JFrame frame3;  
    private JPanel panel3;  
    private JTextField WithdrawalAmount_txt,PINNumber_txt,Cardid_txt;

    private JLabel WithdrawalAmount_lb, PINNumber_lb, Withdrawal_date_lb,Cardid_lb;
    private JButton btnWithdrawal,btnClear_Withdrawal,btnclose_Withdrawal; //btndisplay_Withdrawal
    private JComboBox box_frame3,box2_frame3,box3_frame3;

    //# frame3 for withdrawal

    public  void withdrawal_frame()
    {
        frame3 = new JFrame("Withdrawal_Detail");
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setLayout(null);
        frame3.add(panel3);

        Cardid_lb = new JLabel("Card ID:"); 
        WithdrawalAmount_lb = new JLabel("WithdrawalAmount:"); 
        PINNumber_lb = new JLabel("PIN number:");
        Withdrawal_date_lb = new JLabel("WithdrawalDate:"); 

        Cardid_lb.setBounds(88,37,125,20);
        WithdrawalAmount_lb.setBounds(88,72,125,20);
        PINNumber_lb.setBounds(88,115,125,20);
        Withdrawal_date_lb.setBounds(88,158,125,20);

        Cardid_txt = new JTextField();
        WithdrawalAmount_txt = new JTextField();
        PINNumber_txt = new JTextField();
        Cardid_txt.setBounds(239,37,140,20);
        WithdrawalAmount_txt.setBounds(239,72,140,20);
        PINNumber_txt.setBounds(239,115,140,20);

        //for ComboBox.of withrawal date
        box_frame3 = new JComboBox();
        box_frame3.addItem("1");
        box_frame3.addItem("2");
        box_frame3.addItem("3");
        box_frame3.addItem("4");
        box_frame3.addItem("5");
        box_frame3.addItem("6");
        box_frame3.addItem("7");
        box_frame3.addItem("8");
        box_frame3.addItem("9");
        box_frame3.addItem("10");
        box_frame3.addItem("11");
        box_frame3.addItem("12");
        box_frame3.addItem("13");
        box_frame3.addItem("14");
        box_frame3.addItem("15");
        box_frame3.addItem("16");
        box_frame3.addItem("17");
        box_frame3.addItem("18");
        box_frame3.addItem("19");
        box_frame3.addItem("20");
        box_frame3.addItem("21");
        box_frame3.addItem("22");
        box_frame3.addItem("23");
        box_frame3.addItem("24");
        box_frame3.addItem("25");
        box_frame3.addItem("26");
        box_frame3.addItem("27");
        box_frame3.addItem("28");
        box_frame3.addItem("29");
        box_frame3.addItem("30");

        box2_frame3 = new JComboBox();
        box2_frame3.addItem("January");
        box2_frame3.addItem("Feburary");
        box2_frame3.addItem("March");
        box2_frame3.addItem("April");
        box2_frame3.addItem("June");
        box2_frame3.addItem("July");
        box2_frame3.addItem("August");
        box2_frame3.addItem("September");
        box2_frame3.addItem("October");
        box2_frame3.addItem("November");
        box2_frame3.addItem("December");

        box3_frame3 = new JComboBox(); 
        box3_frame3.addItem("2020");
        box3_frame3.addItem("2021");
        box3_frame3.addItem("2022");
        box3_frame3.addItem("2023"); 

        box_frame3.setBounds(239,152,65,32);
        box2_frame3.setBounds(309,152,66,32);
        box3_frame3.setBounds(380,152,60,32);

        panel3.add(WithdrawalAmount_lb);
        panel3.add(PINNumber_lb);
        panel3.add(Withdrawal_date_lb);
        panel3.add(Cardid_lb);

        panel3.add(WithdrawalAmount_txt);
        panel3.add(PINNumber_txt);
        panel3.add(Cardid_txt); 
        panel3.add(box_frame3);
        panel3.add(box2_frame3);
        panel3.add(box3_frame3);

        btnWithdrawal = new JButton(" Withdrawal");
        btnClear_Withdrawal = new JButton("Clear");
        btnclose_Withdrawal = new JButton("Close");
        //btndisplay_Withdrawal = new JButton("Display");
        btnWithdrawal.setBounds(165,208,144,34);
        btnClear_Withdrawal.setBounds(88,282,77,20);
        btnclose_Withdrawal.setBounds(309,282,70,20);
        //btndisplay_Withdrawal.setBounds(188,267,104,38);

        panel3.add(btnClear_Withdrawal);
        panel3.add(btnWithdrawal);
        panel3.add(btnclose_Withdrawal);
        //panel3.add(btndisplay_Withdrawal);

        //Create an object
        //#Associate ActionListener along with buttons

        btnWithdrawal.addActionListener(this);
        btnclose_Withdrawal.addActionListener(this);
        btnClear_Withdrawal.addActionListener(this);
        //btndisplay_Withdrawal.addActionListener(this);

        //Display frame 3
        //frame3.setLayout(null);
        frame3.setResizable(false); 
        frame3.setVisible(true); 
        frame3.setSize(472,360); 
        frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
    }
    //#frame4
    private JFrame frame4; 
    private JPanel panel4;
    private JLabel Card_lb, CreditLimit_lb, gracePeriod_lb;
    private JTextField txt_Credit_Limit,txt_card_id, txt_Grace;
    private JButton btnSet_Credit_Limit,btnClear_Credit_Limit,btnclose_Credit_Limit;
    /**
     * this is frame4 for Credit_Limit
     **/
    public void Credit_Limit() 
    {
        frame4 = new JFrame("Set CreditLimit");
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setLayout(null);
        frame4.add(panel4); 

        CreditLimit_lb = new JLabel("new CreditLimit:");
        Card_lb= new JLabel("Card_id:");
        gracePeriod_lb= new JLabel("new grace period:");

        CreditLimit_lb.setBounds(61,101,102,20);
        Card_lb.setBounds(61,57,87,20);
        gracePeriod_lb.setBounds(61,138,102,20); 

        txt_Credit_Limit = new JTextField();
        txt_card_id = new JTextField();
        txt_Grace = new JTextField();

        txt_Grace.setBounds(176,138,140,20); 
        txt_Credit_Limit.setBounds(176,101,140,20);
        txt_card_id.setBounds(176,57,140,20);

        panel4.add(gracePeriod_lb);
        panel4.add(txt_Grace);
        panel4.add(CreditLimit_lb);
        panel4.add(Card_lb);
        panel4.add(txt_Credit_Limit);
        panel4.add(txt_card_id);

        btnSet_Credit_Limit = new JButton("set");
        btnClear_Credit_Limit = new JButton("Clear");
        btnclose_Credit_Limit = new JButton("Close");
        //btndisplay_Credit_Limit = new JButton("display"); 

        //btndisplay_Credit_Limit.setBounds(61,193,87,44);
        btnSet_Credit_Limit.setBounds(155,193,81,44);
        btnClear_Credit_Limit.setBounds(259,175,70,20);
        btnclose_Credit_Limit.setBounds(259,205,70,20);

        //panel4.add(btndisplay_Credit_Limit);
        panel4.add(btnSet_Credit_Limit);
        panel4.add(btnClear_Credit_Limit);
        panel4.add(btnclose_Credit_Limit);

        //CreatING  an object
        //#Associate ActionListener along with buttons

        //btndisplay_Credit_Limit.addActionListener(this);
        btnSet_Credit_Limit.addActionListener(this);
        btnclose_Credit_Limit.addActionListener(this);
        btnClear_Credit_Limit.addActionListener(this);

        //Display frame 4
        //frame4.setLayout(null);
        frame4.setResizable(false);
        frame4.setVisible(true);
        frame4.setSize(390,282);
        frame4.setDefaultCloseOperation(frame4.EXIT_ON_CLOSE);
    }
    //#frame5 
    private JFrame frame5;
    private JPanel panel5;
    private JTextField Card_ID_txt;

    private JLabel Card_ID_lb;
    private JButton btnCancelCredit,btnClear_Cancel,btnclose_Cancel;

    /**
     *  frame5 for Cancel CreditCard 
     **/
    public  void cancelCredit_frame()
    {
        frame5 = new JFrame("Cancel CreditCard_Detail"); 
        JPanel panel5 = new JPanel(); 
        panel5.setBackground(Color.LIGHT_GRAY); 
        panel5.setLayout(null);
        frame5.add(panel5);

        Card_ID_lb = new JLabel("Card_ID:");
        Card_ID_lb.setBounds(77,83,63,20);
        Card_ID_txt= new JTextField();
        Card_ID_txt.setBounds(205,83,131,20);
        panel5.add(Card_ID_lb);
        panel5.add(Card_ID_txt);

        btnCancelCredit = new JButton("Cancel_CreditCard");
        btnClear_Cancel = new JButton("Clear");
        btnclose_Cancel = new JButton("Close");
        //btndisplay_Cancel = new JButton("display");
        btnCancelCredit.setBounds(55,167,121,95);
        btnClear_Cancel.setBounds(300,201,71,20);
        btnclose_Cancel.setBounds(300,246,71,20);
        //btndisplay_Cancel.setBounds(185,167,96,95);

        //panel5.add(btndisplay_Cancel);
        panel5.add(btnClear_Cancel);
        panel5.add(btnCancelCredit);
        panel5.add(btnclose_Cancel);

        //Create an object
        //#Associate ActionListener along with buttons

        //btndisplay_Cancel.addActionListener(this);
        btnCancelCredit.addActionListener(this);
        btnclose_Cancel.addActionListener(this);
        btnClear_Cancel.addActionListener(this);

        //Display frame 5
        //frame5.setLayout(null);
        frame5.setResizable(false); 
        frame5.setVisible(true); 
        frame5.setSize(465,348); 
        frame5.setDefaultCloseOperation(frame5.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){ 
        String button=e.getActionCommand();
        //#frame1 add botton
        if(e.getSource()== btn_Add_To_Debit_Card)
        {   if(card_Id_txt.getText().isEmpty() || client_Name_txt.getText().isEmpty() || balance_Amount_txt.getText().isEmpty() || issuer_Bank_txt.getText().isEmpty() || 
            bank_Account_txt.getText().isEmpty() || pin_Number_txt.getText().isEmpty() ) 

            {  JOptionPane.showMessageDialog(panel1 , "Please fill all details to Proceed ", "Error!!!",JOptionPane.ERROR_MESSAGE);
            } else{    
                try {
                    //logic to Add a DebitCard   
                    int cardId = Integer.parseInt(card_Id_txt.getText());  //typecasting of integer value
                    String clientName = client_Name_txt.getText();
                    double balanceAmount = Double.parseDouble(balance_Amount_txt.getText());  //typecasting of integer value
                    String issuerBank = issuer_Bank_txt.getText();
                    String bankAccount = bank_Account_txt.getText();  
                    int pinNumber = Integer.parseInt(pin_Number_txt.getText()); 
                    //obj of debit card  
                    DebitCard objdeb = new DebitCard(balanceAmount,cardId, bankAccount, issuerBank,clientName,pinNumber); 

                    bankcard_arr.add(objdeb);//TO store in a arraylist 
                    JOptionPane.showMessageDialog(panel1 , "Successfully, DebitCard was Added");  //add dialogbox using JOptionPane

                }catch (NumberFormatException ex){  
                    JOptionPane.showMessageDialog(panel1, "Invalid Input!!!Please Enter valid informations.","Error!!!",JOptionPane.ERROR_MESSAGE);
                } 
            }
        }

        //#Close button
        else if(button.equals("Close")) 
        { 
            //DebitCard_GUI();
            frame1.setVisible(false); 
        } 

        //# clear button
        else if(e.getSource()==btnClear)
        {
            card_Id_txt.setText("");   
            client_Name_txt.setText("");  
            issuer_Bank_txt.setText("");
            bank_Account_txt.setText("");
            pin_Number_txt.setText("");
            balance_Amount_txt.setText("");
        }
        //#display button of frame1
        else if(e.getSource() == btnDispay)  //upcasting using instanceof operator to display
        { 
            for (BankCard card : bankcard_arr){  
                if (card instanceof DebitCard) {   
                    ((DebitCard)card).display();
                }
            }
        }
        //#frame1 for withdraw
        else if(button.equals("Withdrawal from Debit card"))
        {
            withdrawal_frame();      //calling to frame3
            frame3.setVisible(true);
            //frame1.setVisible(false);//frame3 set to visible.
        } 

        //#withdrawal function
        else if (e.getSource() == btnWithdrawal) {
            // isempty to indicate whether input is null or empty,
            if(WithdrawalAmount_txt.getText().isEmpty() || PINNumber_txt.getText().isEmpty() )
            {  JOptionPane.showMessageDialog(panel3 , "Please fill all details to Proceed ", "Error!!!",JOptionPane.ERROR_MESSAGE);
            } else{ 
                int cardId = Integer.parseInt(Cardid_txt.getText());
                int  withdrawalAmount= Integer.parseInt(WithdrawalAmount_txt.getText()); 
                int pinNumber = Integer.parseInt(PINNumber_txt.getText());
                String box1 = box_frame3.getSelectedItem().toString();
                String box2 = box2_frame3.getSelectedItem().toString();
                String box3 = box3_frame3.getSelectedItem().toString();
                String dateOfWithdrawal = box1 + box2 + box3;
                boolean cardFound = false;

                for (BankCard card : bankcard_arr) { 
                    if(card instanceof DebitCard){ 
                        if(card.getCardId () == cardId){
                            if(card.getBalanceAmount () >= withdrawalAmount){
                                DebitCard debitcard_obj = (DebitCard) card;
                                debitcard_obj.withdrawn(withdrawalAmount, pinNumber,dateOfWithdrawal);
                                card.setBalanceAmount(card.getBalanceAmount () - withdrawalAmount);
                                JOptionPane.showMessageDialog(panel3 , "Successfully, withdrawn was accomplished" );   //+ "\n" + WithdrawalAmount_txt.getText());
                            }
                            cardFound = true;
                        } 
                    } 
                }
                if(!cardFound) {
                    JOptionPane.showMessageDialog(panel4, "Invalid cardId", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //#Next button
        //frame1 for next button
        else if(button.equals("Proceed to CreditCard"))
        {
            CreditCard_GUI();      //calling to frame2
            frame2.setVisible(true);
            frame1.setVisible(false);//frame3 set to visible.
        } 

        //display frame1
        /**else if(e.getSource() == btnDispay)  //upcasting using instanceof operator to display
        {
        String display = "";
        for (BankCard card : DebitCard_Arr){  
        if (card instanceof DebitCard) {   
        DebitCard debitCard = (DebitCard) card;
        display += "BalanceAmount:" + debitCard.getBalanceAmount () + "\n" + "Card ID: " + debitCard.getCardId () + "\n" + "BankAccount: " + debitCard.getBankAccount () + "\n" + "IssuerBank:" +  debitCard.getIssuerBank ()+ "\n" + "ClientName: "
        + debitCard.getClientName () + "\n" + "PIN number:" +debitCard.getPinNumber();

        }
        }
        } **/

        //#frame2 Backbutton
        else if(button.equals("Back To DebitCard"))
        {
            //DebitCard_GUI();
            frame2.setVisible(false);
            frame1.setVisible(true);
        }  

        //#frame2 closebutton
        else if(button.equals("Close")) 
        { 
            //DebitCard_GUI();
            frame2.setVisible(false); 
        } 

        //#frame2 clear all data.
        else if(e.getSource()==btnClear_frame2)
        {
            txt_cardID.setText("");
            txt_clientName.setText("");
            txt_issuerBank.setText("");
            txt_intererstRate.setText("");
            txt_cvcNumber.setText("");
            txt_bankAcount.setText("");
            txt_balanceAmount.setText("");
            // combobox.setCombo("");

            box_frame2.setSelectedIndex(0);
            box2_frame2.setSelectedIndex(0);
            box3_frame2.setSelectedIndex(0);
        }
        //#Adding credit card button
        if (e.getSource() == btn_Add_To_Credit_Card){
            try{
                int cardId = Integer.parseInt(txt_cardID.getText());
                String issuerBank = txt_issuerBank.getText();
                String clientName = txt_clientName.getText();
                String bankAccount = txt_bankAcount.getText();
                int cvcNumber = Integer.parseInt(txt_cvcNumber.getText());
                double balanceAmount = Double.parseDouble(txt_balanceAmount.getText());
                double interestRate = Double.parseDouble(txt_intererstRate.getText());
                String expirationalDate1 = box_frame2.getSelectedItem().toString();
                String expirationalDate2 = box2_frame2.getSelectedItem().toString();
                String expirationalDate3 = box3_frame2.getSelectedItem().toString();

                String expirationalDate = expirationalDate1 + expirationalDate2 + expirationalDate3;

                CreditCard objcredit = new CreditCard(balanceAmount,cardId, bankAccount,issuerBank, clientName, cvcNumber, interestRate, expirationalDate);

                bankcard_arr.add(objcredit);
                JOptionPane.showMessageDialog(panel2, "Credit Card Added Successfully!");
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid Input!Please enter valid numbers.");
            }
        }  
        //frame2 display button
        /**else if(e.getSource() == btnDispay_frame2)  //upcasting using instanceof operator to display
        {
        String display = "";
        for (BankCard card : CreditCard_Arr){  
        if (card instanceof CreditCard) {
        CreditCard creditCard = (CreditCard) card;
        display += "BalanceAmount:" + creditCard.getBalanceAmount () + "\n" + "Card ID: " + creditCard.getCardId () + "\n" + "BankAccount: " + creditCard.getBankAccount () + "\n" + "IssuerBank:" +  creditCard.getIssuerBank ()+ "\n" + "ClientName: "
        + creditCard.getClientName () + "\n" + "cvcNumber:" +creditCard.getCvcNumber() + "\n" + "interestRate: "+ creditCard.getInterestRate() + "\n" + "expirationalDate:" + creditCard.getExpirationalDate();

        } 
        }
        }  **/
        else if(e.getSource() == btnDispay_frame2)  //upcasting using instanceof operator to display
        { 
            for (BankCard card : bankcard_arr){  
                if (card instanceof CreditCard) {   
                    ((CreditCard)card).display();
                }
            }
        }

        // frame3
        else if(e.getSource()==btnclose_Withdrawal)
        {
            frame3.setVisible(false);
            frame1.setVisible(true);
        }
        //frame3
        else if(e.getSource()==btnClear_Withdrawal)
        {
            WithdrawalAmount_txt.setText("");
            PINNumber_txt.setText("");
            Cardid_txt.setText("");

            box_frame3.setSelectedIndex(0);
            box2_frame3.setSelectedIndex(0);
            box3_frame3.setSelectedIndex(0);
        }
        //frame3 display button
        /**else if(e.getSource() == btndisplay_Withdrawal)  //upcasting using instanceof operator to display
        {
        String display = "";
        for (BankCard card : DebitCard_Arr){  
        if (card instanceof DebitCard) {
        DebitCard debitCard = (DebitCard) card;
        display +=  "withdrawalAmount: " + debitCard.getWithdrawalAmount() + "\n" + "pinNumber:" +  debitCard.getPinNumber()+ "\n" +
        "dateOfWithdrawal: "+ debitCard.getDateOfWithdrawal ();
        } 
        }
        } **/

        // frame4
        else if(button.equals("Set CreditLimit"))
        {
            Credit_Limit();          //calling to frame4
            frame4.setVisible(true);//frame3 set to visible.
        }
        //#set credit limit 
        else if (e.getSource() == btnSet_Credit_Limit) {
            int cardid = Integer.parseInt(txt_card_id.getText());
            int grace_period = Integer.parseInt(txt_Grace.getText());
            double creditLimit = Double.parseDouble(txt_Credit_Limit.getText());
            boolean cardFound = false;
            for (BankCard card : bankcard_arr) {
                if(card instanceof CreditCard){
                    if(card.getCardId () == cardid){
                        CreditCard credit_card_obj = (CreditCard) card;
                        credit_card_obj.setCreditLimit(creditLimit,grace_period);
                        cardFound = true;
                        JOptionPane.showMessageDialog(panel4, "Successfully, credit limit was set");
                    }
                }
            } 
            if(!cardFound) {
                JOptionPane.showMessageDialog(panel4, "Invalid cardId", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnclose_Credit_Limit) //close frame4
        {
            frame4.setVisible(false);
            frame2.setVisible(true);
        }
        //frame4 clear
        else if(e.getSource()==btnClear_Credit_Limit)
        {
            txt_Credit_Limit.setText("");
            txt_card_id.setText("");
            txt_Grace.setText("");

        } 

        //calling to frame5  

        else if(button.equals("Cancel CreditCard"))
        {
            cancelCredit_frame();          
            frame5.setVisible(true);       //frame5 set to visible.
        }
        /**cancel creditcard function
        else if (e.getSource() == btnCancelCredit) {  
        int cardId = Integer.parseInt(Card_ID_txt.getText()); 
        for (BankCard card : bankcard_arr) {
        if (card.getCardId () == cardId) {
        bankcard_arr.remove(card);   
        JOptionPane.showMessageDialog(panel5, "Successfully!!! , Credit Card was Cancelled "); //break
        }
        }
        } **/

        //#cancel credit card 
        else if (e.getSource() == btnCancelCredit) {
            int cardid = Integer.parseInt(Card_ID_txt.getText());
            boolean cardfound = false;
            for (BankCard card : bankcard_arr) {
                if(card instanceof CreditCard){
                    if(card.getCardId () == cardid){
                        CreditCard credit_card_obj = (CreditCard) card;
                        credit_card_obj.cancelCreditCard( );
                        cardfound = true;
                        JOptionPane.showMessageDialog(panel5, "Successfully, Credit Card was Cancelled");
                        //JOptionPane.showMessageDialog(panel5, "Successfully, graceperiod, creditlimit");
                    }
                }
            }
            if(!cardfound) {
                JOptionPane.showMessageDialog(panel4, "Invalid cardId", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } 
        //# close button of frame5
        else if(e.getSource()==btnclose_Cancel)
        {
            frame5.setVisible(false);
            frame2.setVisible(true); 
        }

        //#frame5 clear button
        else if(e.getSource()==btnClear_Cancel)
        {
            Card_ID_txt.setText("");
        }
    }

    public static void main(String args[])
    {   
        new BankCard_GUI();
    }
} 

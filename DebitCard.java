
/**
 * EXPLANATION DebitCard
 *
 * RoshanShah
 * 1.1
 */
public class DebitCard extends BankCard
{
    private int pinNumber ;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //constructor of debitcard with parameter of six as well as calling superclass constructor
    public DebitCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber) 
    { 
        super(balanceAmount, cardId,bankAccount,issuerBank); //calling superclass parameter
        super.setClientName(clientName); //calling setter from superclass
        this.pinNumber= pinNumber;       //giving argument/value in construcor
        this.hasWithdrawn = false;
    }
    //Getter method to return  value 
    public int getPinNumber()
    {  
        return this.pinNumber;
    } 
    public boolean getWithdrawn()
    {  
        return this.hasWithdrawn;
    }
    public String getDateOfWithdrawal ()
    {  
        return this.dateOfWithdrawal;
    }
    public int getWithdrawalAmount() 
    {  
        return this.withdrawalAmount; 
    }
    public void setWithdrawalAmount(int withdrawalAmount)  //mutator method or setter used to modify value
    { 
        this.withdrawalAmount = withdrawalAmount;
    } 
    public void withdrawn(int withdrawalAmount, int pinNumber,  String dateOfWithdrawal)
    {  
        if (this.pinNumber == pinNumber){
            if (super.getBalanceAmount() >= getWithdrawalAmount()){  
                super.setBalanceAmount(super.getBalanceAmount()- getWithdrawalAmount()); //calling supersettermethod and supergettermethod to get value from superclass
                this.hasWithdrawn = true;                                                //giving argument/value 
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.withdrawalAmount =  withdrawalAmount;
            }
            else{  
                System.out.println( "you have insufficient balance amount. please try again!");
            }
        }else 
        { 
            System.out.println( "you have enterned the wrong pin number. please try to enter pinnumber correctly!"); 
        }
    }
    public void display() 
    {                    
        if(hasWithdrawn == true ) {
            super.display();                         //calling super signature method inside if condition in order to display only balanceamount when the condtion is false
            System.out.println("Pin number :" + getPinNumber()); 
            System.out.println("Withdrawal Amount :" + getWithdrawalAmount());
            System.out.println("Date Of withdrawal :" + getDateOfWithdrawal());
        }
        else{
            System.out.println("Sorry the tansaction has not been carried out! your total amount is : "+super.getBalanceAmount()); 
        }
    }
}
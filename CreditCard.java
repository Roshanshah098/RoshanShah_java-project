
/**
 * EXPLANATION CreditCard 
 *
 * RoshanShah
 * 1.1
 */
public class CreditCard extends BankCard
{ 
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationalDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor of creditcard with parameter of eight as well as calling superclass constructor
    public CreditCard( double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int cvcNumber,double interestRate, String expirationalDate)
    { 
        super(balanceAmount, cardId,bankAccount,issuerBank);  //calling superclass parameter
        super.setClientName(clientName);                      //calling setter from superclass
        this.cvcNumber =  cvcNumber;                          //giving argument/value in construcor
        this.interestRate = interestRate;
        this.expirationalDate = expirationalDate;
        this.isGranted = false;
    }
    public int getCvcNumber()     //gettermethod to return the value
    {  
        return this.cvcNumber;
    }
    public double getCreditLimit()
    {  
        return this.creditLimit;
    }
    public double getInterestRate()
    {  
        return this.interestRate;
    }
    public String getExpirationalDate()
    {  
        return this.expirationalDate;
    }
    public int getGracePeriod()
    {  
        return this.gracePeriod;
    }
    public boolean getIsGranted()
    {  
        return this.isGranted;
    }
    public void setCreditLimit(double creditLimit, int gracePeriod)    //settermethod where value is asigned
    {  
        if(creditLimit <= (2.5* super.getBalanceAmount()))   //calling supergettermethod to get value from superclass
        {  
            this.isGranted= true; 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
        } else 
        { 
            System.out.println("The credit cannot be issued");
        } 
    }
    public void cancelCreditCard()
    { 
        this.cvcNumber = 0;           //cancellingcreditcardvalue 
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    public void display()
    { 
        super.display();           //calling super signature method 
        if (isGranted == true ) {
            System.out.println(" creditLimit :" + getCreditLimit());
            System.out.println(" cvcNumber:" + getCvcNumber());
            System.out.println(" interestRate:" + getInterestRate());
            System.out.println(" expirationalDate:" + getExpirationalDate());
            System.out.println(" gracePeriod:" + getGracePeriod());
        }
        else{ 
            System.out.println(" cvcNumber:" + getCvcNumber());   //incase isgranted is false then graceperoid and creditlimit is not display
            System.out.println(" interestRate:" + getInterestRate());
            System.out.println(" expirationalDate:" + getExpirationalDate());
        }
    }
}
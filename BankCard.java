
/**
 * EXPLANATION BankCard 
 *
 * RoshanShah
 * 1.1
 */
public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    //constructor of bankcard with parameter of four
    public BankCard(double balanceAmount,int cardId,String bankAccount,String issuerBank)
    { 
        clientName = "";
        this.balanceAmount = balanceAmount;     //giving argument/value in construcor
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    //Getter method to return value 
    public int getCardId ()
    {  
        return this.cardId;
    }
    public String getClientName ()
    {  
        return this.clientName;
    }
    public String getIssuerBank ()
    {  
        return this.issuerBank;
    }
    public String getBankAccount ()
    {  
        return this.bankAccount;
    }
    public double getBalanceAmount ()
    {  
        return this.balanceAmount;
    }
     public void setClientName ( String clientName ) //setter to update/modify value, to pass value in parameter
    {  
        this.clientName = clientName;
    }
     public void setBalanceAmount ( double balanceAmount ) //setter to update/modify value, to pass value in parameter
    {  
        this.balanceAmount = balanceAmount ;
    }
    public void display()
    {   System.out.println("cardid :" + getCardId());
        System.out.println("Issuerbank :" + getIssuerBank());
        System.out.println("Bankaccount :" + getBankAccount());
        System.out.println("Balanceamount :" + getBalanceAmount());
        if (clientName == null)
        { 
            System.out.println("client name is not assign");
        }else{ 
            System.out.println( "ClientName :" +getClientName ());
        }
    }
}
public class Account {
    private String number;
    private double balance;
    private String customername;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.err.println("Deposit of " +depositAmount + " processed. New Balance is " +balance);
    }
   

    public void withdrawl(double withdrawlAmount){
        if(this.balance-withdrawlAmount<0){
            System.out.println("only " +this.balance + " available. Withdrawl not proccesssed SORRY !!"  );
        }else{
            this.balance -= withdrawlAmount;
            System.out.println("withdrawl of" + withdrawlAmount + "processed. Remaining Balance =" +this.balance);
        }
    }

    public String getnumber(){
        return number;
    }

    public void setnumber(String number){
        this.number  = number ;
    }
    public double getbalance(){
        return balance;
    }

    public void setbalance(Double balance){
        this.balance= balance;
    }
    public String getcustomername(){
        return customername;
    }

    public void setcustomername(String customername){
        this.customername= customername;
    }
    public String getcustomerEmailAddress(){
        return customerEmailAddress;
    }

    public void setcustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress= customerEmailAddress;
    }
    public String get(){
        return customerPhoneNumber;
    }

    public void setcustomerPhoneNumber(String customerPhoneNumber ){
        this.customerPhoneNumber= customerPhoneNumber;
    }


}

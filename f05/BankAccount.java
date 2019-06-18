class BankAccount {
    private int accountNumber;
    private float balance;
    private String ownerName;

    public BankAccount(){
        this(0, 0, "default name");
    }
    public BankAccount(int accountNumber, float balance, String ownerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public BankAccount(final BankAccount object){
        this(object.accountNumber, object.balance, object.ownerName);
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public float getBalance(){
        return balance;
    }
    public int add(float value){
        if(value<0){
            return 0;
        }
        balance+=value;
        return 1;
    }
    public int subtract(float value){
        if(value<0||value>balance){
            return 0;
        }
        balance-=value;
        return 1;
    }
    public void details(){
        System.out.println("Account # : " + accountNumber);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Balance : " + balance + "\n");
    }
}

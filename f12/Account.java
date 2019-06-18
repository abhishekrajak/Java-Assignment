class Account {
    private int accountNumber;
    private String holderName;
    private float balance;

    public Account(){
        this(0, "default_name", 0);
    }
    public Account(int accountNumber, String holderName, float balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.printf("Acc. # : %d\nHolder Name : %s\nBalance : %.2f\n\n", accountNumber, holderName, balance);
    }

}


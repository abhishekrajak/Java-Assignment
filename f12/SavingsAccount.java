class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(){
        this(0, "default_name", 0, 0);
    }
    public SavingsAccount(int accountNumber, String holderName, float balance, float interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    public SavingsAccount(final SavingsAccount object){
        this(object.getAccountNumber(), object.getHolderName(), object.getBalance(), object.getInterestRate());
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate(){
        return interestRate;
    }

    public float calculateYearlyInterest(){
        return interestRate*(super.getBalance());
    }
@Override
    public void display(){
        System.out.printf("Acc. # : %d\nHolder Name : %s\nBalance : %.2f\n", super.getAccountNumber(), super.getHolderName(), super.getBalance());
        System.out.printf("Interest Rate : %.2f\nInterest : %.2f\n\n", interestRate, (super.getBalance()*interestRate*0.01));
    }
}
